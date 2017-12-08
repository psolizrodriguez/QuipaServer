package com.quipa.profile.web.workflow;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quipa.common.constants.AppBaseConstantsWeb;
import com.quipa.common.utility.AppBaseUtilsWeb;
import com.quipa.model.profile.Profile;
import com.quipa.profile.web.representation.ProfileRepresentation;
import com.quipa.profile.web.representation.ProfileRequest;
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

	public ProfileRepresentation createProfile(ProfileRequest profileRequest) {

		Profile profile = new Profile(null, profileRequest.getName(), profileRequest.getDescription(), "",
				profileRequest.getEmail(), AppBaseUtilsWeb.encriptText(profileRequest.getPassword()),
				profileRequest.getMobilePhoneNumber(), AppBaseConstantsWeb.PROFILE_STATUS_PENDING,
				profileRequest.getLatitude(), profileRequest.getLongitude(), AppBaseConstantsWeb.PROFILE_PRICEXHOUR_01,
				AppBaseConstantsWeb.PROFILE_CATEGORY_01, profileRequest.getSkills(), AppBaseUtilsWeb.getCurrentTime());
		profile = profileService.save(profile);
		System.out.println("saving image");
		AppBaseUtilsWeb.saveImageToServer(AppBaseUtilsWeb.decodeToImage(profileRequest.getProfilePicture()),
				"" + profile.getProfileId());
		return new ProfileRepresentation(profile);
	}

	public ProfileRepresentation getProfile(Long profileId) {
		return new ProfileRepresentation(profileService.getById(profileId));
	}

	@Override
	public ProfileRepresentation getProfileByPhoneNumber(String mobilePhoneNumber, String password) {
		Profile profile = profileService.getProfileByPhoneNumber(mobilePhoneNumber);
		ProfileRepresentation profileRepresentation = null;
		if (profile != null && profile.getPassword().equals(AppBaseUtilsWeb.encriptText(password))) {
			profileRepresentation = new ProfileRepresentation(profile);
		}
		return profileRepresentation;
	}

	@Override
	public List<ProfileRepresentation> listAllByLatitudeAndLongitudeAndSkills(String skills, Double latitude,
			Double longitude, Long profileId) {
		List<Profile> profiles = new ArrayList<>();
		List<ProfileRepresentation> profileRepresentations = new ArrayList<>();
		profiles = profileService.listAllByLatitudeAndLongitudeAndSkills(skills, latitude, longitude, profileId);
		Iterator<Profile> it = profiles.iterator();
		while (it.hasNext()) {
			Profile profile = (Profile) it.next();
			profileRepresentations.add(new ProfileRepresentation(profile));
		}
		return profileRepresentations;
	}

}
