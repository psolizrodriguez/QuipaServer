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

import com.quipa.profile.web.representation.MessageRepresentation;
import com.quipa.profile.web.representation.MessageRequest;
import com.quipa.profile.web.workflow.MessageActivityImpl;

@Component
@Path("/messageservice/")
public class MessageResource implements MessageWebService {
	@Autowired
	MessageActivityImpl messageActivity;

	@GET
	@Produces({ "application/xml", "application/json" })
	@Path("/message")
	public List<MessageRepresentation> getMessages(@FormParam("requestId") Long requestId) {
		System.out.println("GET METHOD Message for all messages ............. , profileId = " + requestId);
		return messageActivity.getMessages(requestId);
	}

	@GET
	@Produces({ "application/xml", "application/json" })
	@Path("/message/{messageId}")
	public MessageRepresentation getMessage(@PathParam("messageId") Long messageId) {
		return messageActivity.getMessage(messageId);
	}

	@POST
	@Produces({ "application/xml", "application/json" })
	@Path("/message")
	public MessageRepresentation createMessage(MessageRequest messageRequest) {
		System.out.println("POST METHOD Message");
		return messageActivity.createMessage(messageRequest);
	}

}