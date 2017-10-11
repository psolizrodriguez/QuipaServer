package com.quipa.profile.web.service;

import java.util.List;

import javax.jws.WebService;

import com.quipa.profile.web.representation.ProfileRepresentation;

@WebService
public interface ProfileWebService {

	public List<ProfileRepresentation> getEmployees();

}
