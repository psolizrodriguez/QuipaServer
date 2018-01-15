package com.quipa.common.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.quipa.common.utility.AppBaseUtilsWeb;

@Controller
public class MainController {


	@RequestMapping("/index")
	public String index(HttpServletRequest request) {
		/*Profile profile = new Profile(Long.valueOf(1), "Percy Soliz", "Software Engineer living in Chicago", "",
				"percy.soliz@gmail.com", "test1234", "333-333-3333", "Pending", 1000.0, 2000.0, 0.0, "", "",
				AppBaseUtilsWeb.getCurrentTime());
		profile = profileService.save(profile);
		Profile prospect = new Profile(Long.valueOf(2), "Kelly Blackwell", "Mechanic living in Chicago", "",
				"kelly.blackwell@gmail.com", "test1234", "222-222-3333", "Verified", 1000.0, 2000.0, 25.0, "Master",
				"1,2,3,4", AppBaseUtilsWeb.getCurrentTime());
		prospect = profileService.save(prospect);
		Request workRequest = new Request(Long.valueOf(1),
				AppBaseUtilsWeb.StringToCalendar("12/12/2017", AppBaseConstantsWeb.DATE_FORMAT), "15:00", "17:00", 2.0,
				25.0, 50.0, 5.0, 15.0, 70.0,"[1]", "Mechanic", "Nissan Z350 needs an oil change", "Pending", profile,
				prospect);
		workRequest = requestService.save(workRequest);
		System.out.println("Kelly Blackwell Id = " + prospect.getProfileId());*/
		/*AppBaseUtilsWeb.sendMessage("3123838870",
				"You've just got a Job Request from Percy.");*/
		return "index";
	}

}