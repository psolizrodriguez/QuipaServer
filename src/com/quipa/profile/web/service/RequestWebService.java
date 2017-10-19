package com.quipa.profile.web.service;

import java.util.List;

import javax.jws.WebService;

import com.quipa.profile.web.representation.RequestRepresentation;
import com.quipa.profile.web.representation.RequestRequest;

@WebService
public interface RequestWebService {

	public List<RequestRepresentation> getRequests(Long profileId);

	public RequestRepresentation getRequest(Long requestId);

	public RequestRepresentation createRequest(RequestRequest requestRequest);

}
