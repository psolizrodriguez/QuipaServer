package com.quipa.profile.web.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.quipa.profile.web.representation.ProfileRepresentation;
import com.quipa.profile.web.representation.ProfileRequest;
import com.quipa.profile.web.workflow.ProfileActivityImpl;

@Component
@Path("/profileservice/")
public class ProfileResource implements ProfileWebService {
	@Autowired
	ProfileActivityImpl profileActivity;

	@GET
	@Produces({ "application/xml", "application/json" })
	@Path("/profile")
	public List<ProfileRepresentation> getEmployees() {
		System.out.println("GET METHOD Request for all profiles .............");
		return profileActivity.getProfiles();
	}

	@POST
	@Produces({ "application/xml", "application/json" })
	@Path("/profile")
	public ProfileRepresentation createEmployee(ProfileRequest profileRequest) {
		System.out.println("POST METHOD Request");
		return profileActivity.createProfile(profileRequest);
	}

}