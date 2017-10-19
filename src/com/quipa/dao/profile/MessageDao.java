package com.quipa.dao.profile;

import java.util.List;

import com.quipa.common.dao.Dao;
import com.quipa.model.profile.Message;

public interface MessageDao extends Dao {
	public Message save(Message message);

	public List<Message> listAll(Long requestId);

	public Message getById(Long messageId);

	public boolean remove(Message message);
}
