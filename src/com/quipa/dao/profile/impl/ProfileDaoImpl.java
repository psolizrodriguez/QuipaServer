package com.quipa.dao.profile.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.quipa.common.dao.AbstractBaseDao;
import com.quipa.dao.profile.ProfileDao;
import com.quipa.model.profile.Profile;

@SuppressWarnings("rawtypes")
@Repository
public class ProfileDaoImpl extends AbstractBaseDao implements ProfileDao {

	@SuppressWarnings("unchecked")
	@Transactional
	public Profile save(Profile profile) {
		return (Profile) super.store(profile);
	}

	public List<Profile> listAll() {
		return super.verifyListNamedQueryAll("com.quipa.dao.profile.impl.ProfileDaoImpl.listAll");
	}

	@Transactional
	public boolean remove(Profile profile) {
		return super.remove(profile);

	}

	@Override
	public Profile getById(Long profileId) {
		return super.verifyNamedQueryAll("com.quipa.dao.profile.impl.ProfileDaoImpl.getById", profileId);
	}
}