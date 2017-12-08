package com.quipa.dao.profile.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.quipa.common.dao.AbstractBaseDao;
import com.quipa.dao.profile.RequestDao;
import com.quipa.model.profile.Request;

@SuppressWarnings("rawtypes")
@Repository
public class RequestDaoImpl extends AbstractBaseDao implements RequestDao {

	@SuppressWarnings("unchecked")
	@Transactional
	public Request save(Request request) {
		return (Request) super.store(request);
	}

	public List<Request> getRequestsByProfileId(Long profileId) {
		return super.verifyListNamedQueryAll("com.quipa.dao.profile.impl.RequestDaoImpl.getRequestsByProfileId",
				profileId);
	}

	@Transactional
	public boolean remove(Request request) {
		return super.remove(request);

	}

	@Override
	public Request getById(Long prospectId) {
		return super.verifyNamedQueryAll("com.quipa.dao.profile.impl.RequestDaoImpl.getById", prospectId);
	}

	@Override
	public List<Request> getRequestsByProspectId(Long prospectId) {
		return super.verifyListNamedQueryAll("com.quipa.dao.profile.impl.RequestDaoImpl.getRequestsByProspectId",
				prospectId);
	}
}