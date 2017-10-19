package com.quipa.service.profile;

import java.util.List;

import com.quipa.model.profile.Message;

public interface MessageService {
	public Message save(Message message);

	public List<Message> listAll(Long requestId);

	public Message getById(Long messageId);

	public boolean remove(Message message);
}
