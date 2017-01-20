package com.info.xpacknow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.info.xpacknow.domain.Client;
import com.info.xpacknow.service.EmailService;
import com.info.xpacknow.service.ClientService;

@Controller

public class RegistrationController {

	@Autowired
	private ClientService clientService;
	@Autowired
	private EmailService emailService;

	@RequestMapping(value = "/rejestracjaPo", method = RequestMethod.GET)
	public String porejestracji(Model model) {

		return "rejestracjaTrwaPotwierdzenie";
	}

	@RequestMapping(value = "/rejestracja", method = RequestMethod.GET)
	public String getresjestracja(@ModelAttribute("rejestracja1") Client client) {

		return "rejestracja";
	}

	@RequestMapping(value = "/rejestracja", method = RequestMethod.POST)
	public String putrejestracja(@ModelAttribute("rejestracja1") Client client) {


		emailService.confirmMessage("Link Aktywacyjny", client.getIdKontakty().getStrona(), client.getLogin());
		clientService.addClient(client);

		return "redirect:/rejestracjaPo";

	}

	@RequestMapping(value = "/rejestracja/confirm", method = RequestMethod.GET)
	public String potwierdzenieRejestracji(@RequestParam("login") String login, @RequestParam("digest") String digest,
			Model model) {

		emailService.confirmAccount(login, digest);

		return "rejestracjaPotwierdzenie";
	}

}
