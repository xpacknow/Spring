package com.info.xpacknow.serviceimp;

import java.util.HashMap;
import java.util.Map;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.velocity.app.VelocityEngine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.velocity.VelocityEngineUtils;

import com.info.xpacknow.service.EmailService;

@Service
@Transactional(readOnly = true)
public class EmailServiceImp implements EmailService {

	private static final String USER_MSG_TEMPLATE_PATH = "confirmEmail.vm";

	private static final Logger logger = LoggerFactory.getLogger(EmailServiceImp.class);

	@Autowired
	private JavaMailSender mailSender;
	@Autowired
	private VelocityEngine velocityEngine;

	@Value("${adminEmail}")
	private String adminEmailAddr;

	@Value("${confirmKey}")
	private String confirmKey;

	@Value("${basicUrl}")
	private String basicUrl;

	@Async
	@Transactional(readOnly = false)
	public void confirmMessage(String subject, String toEmail, String login) {

		MimeMessage mimeMsg = createEmail(subject, toEmail, adminEmailAddr, USER_MSG_TEMPLATE_PATH, login);
		sendEmail(mimeMsg);

	}

	@Deprecated
	private MimeMessage createEmail(String subject, String toEmail, String fromEmail, String templatePath,
			String login) {

		MimeMessage mimeMsg = mailSender.createMimeMessage();

		MimeMessageHelper helper = new MimeMessageHelper(mimeMsg);
		String digest = generateDigest(login);
		String url = basicUrl + "?login=" + login + "&digest=" + digest;

		Map<String, Object> model = new HashMap<String, Object>();
		model.put("login", login);
		model.put("url", url);

		String text = VelocityEngineUtils.mergeTemplateIntoString(velocityEngine, templatePath, "UTF-8", model);

		try {

			helper.setSubject(subject);
			helper.setTo(toEmail);
			helper.setFrom(fromEmail);
			helper.setText(text, true);

		} catch (MessagingException e) {

			throw new RuntimeException(e);

		}

		return mimeMsg;

	}

	@Transactional(readOnly = false)
	public void confirmAccount(String login, String digest) {

		String expectedDigest = generateDigest(login);

		if (!digest.equals(expectedDigest)) {

			logger.info("Bad digest");

		}

		logger.info("Account confirm");

	}

	private void sendEmail(MimeMessage mimeMsg) {

		mailSender.send(mimeMsg);
	}

	private String generateDigest(String login) {

		return DigestUtils.sha256Hex(login + ":" + confirmKey);

	}

}
