package com.quipa.service.profile.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quipa.common.utility.AppBaseUtilsWeb;
import com.quipa.dao.profile.RequestDao;
import com.quipa.model.profile.Request;
import com.quipa.service.profile.RequestService;

@Service
public class RequestServiceImpl implements RequestService {
	@Autowired
	RequestDao dao;

	@Override
	public Request save(Request request) {
		String phoneNumber = request.getProspect().getMobilePhoneNumber();
		if (phoneNumber.equals("8479975828") || phoneNumber.equals("3123838870")) {
			AppBaseUtilsWeb.sendMessage(phoneNumber,
					"You've just got a Job Request from " + request.getProfile().getName() + ", please call "
							+ request.getProfile().getMobilePhoneNumber() + ".");
		}
		return dao.save(request);
	}

	@Override
	public List<Request> getRequestsByProfileId(Long profileId) {
		return dao.getRequestsByProfileId(profileId);
	}

	@Override
	public Request getById(Long requestId) {
		return dao.getById(requestId);
	}

	@Override
	public boolean remove(Request request) {
		return dao.remove(request);
	}

	@Override
	public List<Request> getRequestsByProspectId(Long profileId) {
		return dao.getRequestsByProspectId(profileId);
	}

}
