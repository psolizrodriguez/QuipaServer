package com.quipa.service.profile.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quipa.dao.profile.ProspectDao;
import com.quipa.model.profile.Prospect;
import com.quipa.service.profile.ProspectService;

@Service
public class ProspectServiceImpl implements ProspectService {
	@Autowired
	ProspectDao dao;

	@Override
	public Prospect save(Prospect prospect) {
		return dao.save(prospect);
	}

	@Override
	public List<Prospect> listAll() {
		return dao.listAll();
	}

	@Override
	public Prospect getById(String prospectId) {
		return dao.getById(prospectId);
	}

	@Override
	public boolean remove(Prospect prospect) {
		return dao.remove(prospect);
	}

}
