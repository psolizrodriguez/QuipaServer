package com.quipa.profile.web.workflow;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quipa.common.utility.AppBaseUtilsWeb;
import com.quipa.model.profile.Message;
import com.quipa.profile.web.representation.MessageRepresentation;
import com.quipa.profile.web.representation.MessageRequest;
import com.quipa.service.profile.MessageService;
import com.quipa.service.profile.ProfileService;
import com.quipa.service.profile.RequestService;

@Service
public class MessageActivityImpl implements MessageActivity {

	@Autowired
	private RequestService requestService;
	@Autowired
	private ProfileService profileService;
	@Autowired
	private MessageService messageService;

	public List<MessageRepresentation> getMessages(Long profileId) {

		List<Message> messages = new ArrayList<>();
		List<MessageRepresentation> messageRepresentations = new ArrayList<>();
		messages = messageService.listAll(profileId);
		System.out.println("message size " + messages.size());
		Iterator<Message> it = messages.iterator();
		while (it.hasNext()) {
			Message message = (Message) it.next();
			messageRepresentations.add(new MessageRepresentation(message));
		}
		return messageRepresentations;
	}

	public MessageRepresentation createMessage(MessageRequest messageRequest) {
		Message message = new Message(null, messageRequest.getContent(), AppBaseUtilsWeb.getCurrentTime(),
				requestService.getById(messageRequest.getRequestId()),
				profileService.getById(messageRequest.getProfileId()));
		message = messageService.save(message);
		return new MessageRepresentation(message);
	}

	public MessageRepresentation getMessage(Long messageId) {
		return new MessageRepresentation(messageService.getById(messageId));
	}

}
