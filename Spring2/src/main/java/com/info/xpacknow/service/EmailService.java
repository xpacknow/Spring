package com.info.xpacknow.service;

public interface EmailService {

	void confirmMessage(String subject, String toEmail, String login);

	void confirmAccount(String login, String digest);

}
