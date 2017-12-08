package com.quipa.service.profile;

import java.util.List;

import com.quipa.model.profile.Profile;

public interface ProfileService {
	public Profile save(Profile profile);

	public List<Profile> listAll();
	
	public List<Profile> listAllByLatitudeAndLongitudeAndSkills(String skills, Double latitude, Double Longitude, Long profileId);

	public Profile getById(Long profileId);

	public boolean remove(Profile profile);
	
	public Profile getProfileByPhoneNumber(String mobilePhoneNumber);
}
