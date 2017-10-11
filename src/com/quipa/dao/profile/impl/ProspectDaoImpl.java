package com.quipa.dao.profile.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.quipa.common.dao.AbstractBaseDao;
import com.quipa.dao.profile.ProspectDao;
import com.quipa.model.profile.Prospect;

@SuppressWarnings("rawtypes")
@Repository
public class ProspectDaoImpl extends AbstractBaseDao implements ProspectDao {

	@SuppressWarnings("unchecked")
	@Transactional
	public Prospect save(Prospect prospect) {
		return (Prospect) super.store(prospect);
	}

	public List<Prospect> listAll() {
		return super.verifyListNamedQueryAll("com.quipa.dao.profile.impl.ProspectDaoImpl.listAll");
	}

	@Transactional
	public boolean remove(Prospect prospect) {
		return super.remove(prospect);

	}

	@Override
	public Prospect getById(String prospectId) {
		return super.verifyNamedQueryAll("com.quipa.dao.profile.impl.ProspectDaoImpl.getById", prospectId);
	}
}