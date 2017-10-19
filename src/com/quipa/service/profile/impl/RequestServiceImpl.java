package com.quipa.service.profile.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quipa.dao.profile.RequestDao;
import com.quipa.model.profile.Request;
import com.quipa.service.profile.RequestService;

@Service
public class RequestServiceImpl implements RequestService {
	@Autowired
	RequestDao dao;

	@Override
	public Request save(Request request) {
		return dao.save(request);
	}

	@Override
	public List<Request> listAll(Long profileId) {
		return dao.listAll(profileId);
	}

	@Override
	public Request getById(Long requestId) {
		return dao.getById(requestId);
	}

	@Override
	public boolean remove(Request request) {
		return dao.remove(request);
	}

}
