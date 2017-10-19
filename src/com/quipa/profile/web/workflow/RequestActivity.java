package com.quipa.profile.web.workflow;

import java.util.List;

import com.quipa.profile.web.representation.RequestRepresentation;

public interface RequestActivity {

	public List<RequestRepresentation> getRequests(Long profileId);

	public RequestRepresentation getRequest(Long requestId);
}
