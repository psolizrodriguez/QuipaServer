package com.quipa.service.profile;

import java.util.List;

import com.quipa.model.profile.Request;

public interface RequestService {
	public Request save(Request request);

	public List<Request> getRequestsByProfileId(Long profileId);
	
	public List<Request> getRequestsByProspectId(Long profileId);

	public Request getById(Long requestId);

	public boolean remove(Request request);
}
