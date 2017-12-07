package com.quipa.service.profile;

import java.util.Calendar;
import java.util.List;

import com.quipa.model.profile.Message;

public interface MessageService {
	public Message save(Message message);

	public List<Message> listAll(Long requestId);

	public List<Message> listAllMessagesByProfileId(Long profileId);
	
	public List<Message> listAllMessagesByProfileIdAndCreatedDate(Long profileId, Calendar createdDate);

	public Message getById(Long messageId);

	public boolean remove(Message message);
}
