package com.quipa.profile.web.workflow;

import java.util.List;

import javax.ws.rs.PathParam;

import com.quipa.profile.web.representation.RequestRepresentation;

public interface RequestActivity {

	public List<RequestRepresentation> getRequestsByProfileId(Long profileId);
	
	public List<RequestRepresentation> getRequestsByProspectId(@PathParam("prospectId") Long prospectId);

	public RequestRepresentation getRequest(Long requestId);
}
