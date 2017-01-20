package com.info.xpacknow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.info.xpacknow.domain.Employee;
import com.info.xpacknow.service.EmployeeService;

@Controller

public class EmployeeController {

	@Autowired
	private EmployeeService employeeService ;

	

	@RequestMapping(value = "/popo", method = RequestMethod.GET)
	public String poRejestracjiPracownika(Model model) {


		return "po";
	}

	@RequestMapping(value = "/dodajpracownika", method = RequestMethod.GET)
	public String getResjestracjaPracownika(@ModelAttribute("form1") Employee pracownik) {

		return "dodajpracownika";
	}

	@RequestMapping(value = "/dodajpracownika", method = RequestMethod.POST)
	public String postRejestracjaPracownika(@ModelAttribute("form1") Employee pracownik) {

		
employeeService.addEmployee(pracownik);




		return "redirect:/popo";

	}

}
