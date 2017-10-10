package com.quipa.service.profile;

import java.util.List;

import com.quipa.model.profile.Prospect;

public interface ProspectService {
	public Prospect save(Prospect prospect);

	public List<Prospect> listAll();

	public Prospect getById(String prospectId);

	public boolean remove(Prospect prospect);
}
