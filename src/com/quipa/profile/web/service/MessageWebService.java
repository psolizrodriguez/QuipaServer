package com.quipa.profile.web.service;

import java.util.List;

import javax.jws.WebService;

import com.quipa.profile.web.representation.MessageRepresentation;
import com.quipa.profile.web.representation.MessageRequest;

@WebService
public interface MessageWebService {

	public List<MessageRepresentation> getMessages(Long requestId);

	public MessageRepresentation getMessage(Long messageId);

	public MessageRepresentation createMessage(MessageRequest messageRequest);

	public List<MessageRepresentation> getMessagesByProfileId(Long profileId, String createdDate);
}
