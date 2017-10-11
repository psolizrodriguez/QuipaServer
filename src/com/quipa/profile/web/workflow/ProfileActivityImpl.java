package com.quipa.profile.web.workflow;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quipa.model.profile.Profile;
import com.quipa.profile.web.representation.ProfileRepresentation;
import com.quipa.service.profile.ProfileService;

@Service
public class ProfileActivityImpl implements ProfileActivity {

	@Autowired
	private ProfileService profileService;

	public List<ProfileRepresentation> getProfiles() {

		List<Profile> profiles = new ArrayList<>();
		List<ProfileRepresentation> profileRepresentations = new ArrayList<>();
		profiles = profileService.listAll();

		Iterator<Profile> it = profiles.iterator();
		while (it.hasNext()) {
			Profile profile = (Profile) it.next();
			profileRepresentations.add(new ProfileRepresentation(profile));
		}
		return profileRepresentations;
	}
}
