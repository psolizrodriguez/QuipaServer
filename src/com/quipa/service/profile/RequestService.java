package com.quipa.service.profile;

import java.util.List;

import com.quipa.model.profile.Request;

public interface RequestService {
	public Request save(Request request);

	public List<Request> listAll();

	public Request getById(String requestId);

	public boolean remove(Request request);
}
