package com.quipa.common.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.quipa.service.profile.ProspectService;

@Controller
public class MainController {
	@Autowired
	private ProspectService prospectService;

	@RequestMapping("/index")
	public String index(HttpServletRequest request) {
		// Testing addCustomer
		System.out.println("Adding Customer julia.cicale");
		return "index";
	}

}