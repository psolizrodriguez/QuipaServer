package com.quipa.service.profile;

import java.util.List;

import com.quipa.model.profile.Profile;

public interface ProfileService {
	public Profile save(Profile profile);

	public List<Profile> listAll();

	public Profile getById(String profileId);

	public boolean remove(Profile profile);
}
