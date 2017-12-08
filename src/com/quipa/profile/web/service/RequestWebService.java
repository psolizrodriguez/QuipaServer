package com.quipa.profile.web.service;

import java.util.List;

import javax.jws.WebService;

import com.quipa.profile.web.representation.RequestRepresentation;
import com.quipa.profile.web.representation.RequestRequest;

@WebService
public interface RequestWebService {

	public List<RequestRepresentation> getRequestsByProfileId(Long profileId);

	public List<RequestRepresentation> getRequestsByProspectId(Long prospectId);

	public RequestRepresentation getRequest(Long requestId);

	public RequestRepresentation createRequest(RequestRequest requestRequest);

}
