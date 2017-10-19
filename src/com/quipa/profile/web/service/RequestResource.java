package com.quipa.profile.web.service;

import java.util.List;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.quipa.profile.web.representation.RequestRepresentation;
import com.quipa.profile.web.representation.RequestRequest;
import com.quipa.profile.web.workflow.RequestActivityImpl;

@Component
@Path("/requestservice/")
public class RequestResource implements RequestWebService {
	@Autowired
	RequestActivityImpl requestActivity;

	@GET
	@Produces({ "application/xml", "application/json" })
	@Path("/request")
	public List<RequestRepresentation> getRequests(@FormParam("profileId") Long profileId) {
		System.out.println("GET METHOD Request for all requests ............. , profileId = " + profileId);
		return requestActivity.getRequests(profileId);
	}

	@GET
	@Produces({ "application/xml", "application/json" })
	@Path("/request/{requestId}")
	public RequestRepresentation getRequest(@PathParam("requestId") Long requestId) {
		return requestActivity.getRequest(requestId);
	}

	@POST
	@Produces({ "application/xml", "application/json" })
	@Path("/request")
	public RequestRepresentation createRequest(RequestRequest requestRequest) {
		System.out.println("POST METHOD Request");
		return requestActivity.createRequest(requestRequest);
	}

}