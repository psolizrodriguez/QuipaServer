package com.quipa.profile.web.workflow;

import java.util.List;

import com.quipa.profile.web.representation.MessageRepresentation;

public interface MessageActivity {

	public List<MessageRepresentation> getMessages(Long requestId);

	public MessageRepresentation getMessage(Long messageId);
}
