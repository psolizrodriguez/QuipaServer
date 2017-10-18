package com.quipa.profile.web.service;

import java.util.List;

import javax.jws.WebService;

import com.quipa.profile.web.representation.ProfileRepresentation;
import com.quipa.profile.web.representation.ProfileRequest;

@WebService
public interface ProfileWebService {

	public List<ProfileRepresentation> getProfiles();

	public ProfileRepresentation getProfile(Long profileId);

	public ProfileRepresentation createProfile(ProfileRequest profileRequest);

}
