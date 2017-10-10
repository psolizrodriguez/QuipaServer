package com.quipa.dao.profile;

import java.util.List;

import com.quipa.common.dao.Dao;
import com.quipa.model.profile.Prospect;

public interface ProspectDao extends Dao {
	public Prospect save(Prospect prospect);

	public List<Prospect> listAll();

	public Prospect getById(String prospectId);

	public boolean remove(Prospect prospect);
}
