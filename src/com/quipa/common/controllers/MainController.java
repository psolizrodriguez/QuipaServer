package com.quipa.common.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.quipa.common.utility.AppBaseUtilsWeb;
import com.quipa.model.profile.Profile;
import com.quipa.service.profile.ProfileService;

@Controller
public class MainController {
	@Autowired
	private ProfileService profileService;

	@RequestMapping("/index")
	public String index(HttpServletRequest request) {
		Profile profile = new Profile("Soliz", "Percy", "Software Engineer living in Chicago", "",
				"percy.soliz.rodriguez@gmail.com", "test1234", "123-123-1234", "Verified",
				AppBaseUtilsWeb.getCurrentTime());
		profileService.save(profile);
		return "index";
	}

}