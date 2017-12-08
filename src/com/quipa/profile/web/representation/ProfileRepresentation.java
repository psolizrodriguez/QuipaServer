package com.quipa.profile.web.representation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.quipa.common.constants.AppBaseConstantsWeb;
import com.quipa.common.utility.AppBaseUtilsWeb;
import com.quipa.model.profile.Profile;

@XmlRootElement(name = "Profile")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class ProfileRepresentation {

	private Long profileId;
	private String name;
	private String description;
	private String profilePicture;
	private String email;
	private String mobilePhoneNumber;
	private String status;
	private Double latitude;
	private Double longitude;
	private Double priceHour;
	private String category;
	private String skills;
	private String createdDate;

	public ProfileRepresentation() {

	}

	public ProfileRepresentation(Profile profile) {
		this.profileId = profile.getProfileId();
		this.name = profile.getName();
		this.description = profile.getDescription();
		this.profilePicture = "http://" + AppBaseConstantsWeb.SERVER_URL + "/QuipaServer/viewProfilePicture.html?profileId=" + profile.getProfileId();
		this.email = profile.getEmail();
		this.mobilePhoneNumber = profile.getMobilePhoneNumber();
		this.status = profile.getStatus();
		this.latitude = profile.getLatitude();
		this.longitude = profile.getLongitude();
		this.priceHour = profile.getPriceHour();
		this.category = profile.getCategory();
		this.skills = profile.getSkills();
		this.createdDate = AppBaseUtilsWeb.CalendarToString(profile.getCreatedDate(), AppBaseConstantsWeb.DATE_FORMAT);
	}

	public Long getProfileId() {
		return profileId;
	}

	public void setProfileId(Long profileId) {
		this.profileId = profileId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobilePhoneNumber() {
		return mobilePhoneNumber;
	}

	public void setMobilePhoneNumber(String mobilePhoneNumber) {
		this.mobilePhoneNumber = mobilePhoneNumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getPriceHour() {
		return priceHour;
	}

	public void setPriceHour(Double priceHour) {
		this.priceHour = priceHour;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

}
