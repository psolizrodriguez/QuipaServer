package com.quipa.profile.web.workflow;

import java.util.List;

import com.quipa.profile.web.representation.ProfileRepresentation;

public interface ProfileActivity {

	public List<ProfileRepresentation> getProfiles();

	public ProfileRepresentation getProfile(Long profileId);

	public ProfileRepresentation getProfileByPhoneNumber(String mobilePhoneNumber, String password);

	public List<ProfileRepresentation> listAllByLatitudeAndLongitudeAndSkills(String skills, Double latitude,
			Double longitude, Long profileId);

}
