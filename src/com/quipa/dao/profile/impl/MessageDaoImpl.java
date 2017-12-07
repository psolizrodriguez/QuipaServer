package com.quipa.dao.profile.impl;

import java.util.Calendar;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.quipa.common.dao.AbstractBaseDao;
import com.quipa.dao.profile.MessageDao;
import com.quipa.model.profile.Message;

@SuppressWarnings("rawtypes")
@Repository
public class MessageDaoImpl extends AbstractBaseDao implements MessageDao {

	@SuppressWarnings("unchecked")
	@Transactional
	public Message save(Message message) {
		return (Message) super.store(message);
	}

	public List<Message> listAll(Long requestId) {
		return super.verifyListNamedQueryAll("com.quipa.dao.profile.impl.MessageDaoImpl.listAll", requestId);
	}

	@Transactional
	public boolean remove(Message message) {
		return super.remove(message);

	}

	@Override
	public Message getById(Long messageId) {
		return super.verifyNamedQueryAll("com.quipa.dao.profile.impl.MessageDaoImpl.getById", messageId);
	}

	@Override
	public List<Message> listAllMessagesByProfileIdAndCreatedDate(Long profileId, Calendar createdDate) {
		return super.verifyListNamedQueryAll("com.quipa.dao.profile.impl.MessageDaoImpl.listAllMessagesByProfileIdAndCreatedDate", profileId, createdDate);
	}

	@Override
	public List<Message> listAllMessagesByProfileId(Long profileId) {
		return super.verifyListNamedQueryAll("com.quipa.dao.profile.impl.MessageDaoImpl.listAllMessagesByProfileId", profileId);
	}
}