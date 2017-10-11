package com.quipa.service.profile.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quipa.dao.profile.ProfileDao;
import com.quipa.model.profile.Profile;
import com.quipa.service.profile.ProfileService;

@Service
public class ProfileServiceImpl implements ProfileService {
	@Autowired
	ProfileDao dao;

	@Override
	public Profile save(Profile profile) {
		return dao.save(profile);
	}

	@Override
	public List<Profile> listAll() {
		System.out.println("Entra Dao");
		return dao.listAll();
	}

	@Override
	public Profile getById(String profileId) {
		return dao.getById(profileId);
	}

	@Override
	public boolean remove(Profile profile) {
		return dao.remove(profile);
	}

}
