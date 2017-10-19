package com.quipa.service.profile.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quipa.dao.profile.MessageDao;
import com.quipa.model.profile.Message;
import com.quipa.service.profile.MessageService;

@Service
public class MessageServiceImpl implements MessageService {
	@Autowired
	MessageDao dao;

	@Override
	public Message save(Message message) {
		return dao.save(message);
	}

	@Override
	public List<Message> listAll(Long requestId) {
		return dao.listAll(requestId);
	}

	@Override
	public Message getById(Long messageId) {
		return dao.getById(messageId);
	}

	@Override
	public boolean remove(Message message) {
		return dao.remove(message);
	}

}
