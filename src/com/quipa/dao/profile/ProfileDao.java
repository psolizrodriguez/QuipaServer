package com.quipa.dao.profile;

import java.util.List;

import com.quipa.common.dao.Dao;
import com.quipa.model.profile.Profile;

public interface ProfileDao extends Dao {
	public Profile save(Profile profile);

	public List<Profile> listAll();

	public Profile getById(Long profileId);

	public boolean remove(Profile profile);
}
