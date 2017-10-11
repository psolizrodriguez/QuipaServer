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
	private String lastName;
	private String firstName;
	private String description;
	private String profilePicUrl;
	private String email;
	private String password;
	private String mobilePhoneNumber;
	private String status;
	private String createdDate;

	public ProfileRepresentation() {

	}

	public ProfileRepresentation(Profile profile) {
		this.profileId = profile.getProfileId();
		this.lastName = profile.getLastName();
		this.firstName = profile.getFirstName();
		this.description = profile.getDescription();
		this.profilePicUrl = profile.getProfilePicUrl();
		this.email = profile.getEmail();
		this.password = profile.getPassword();
		this.mobilePhoneNumber = profile.getMobilePhoneNumber();
		this.status = profile.getStatus();
		this.createdDate = AppBaseUtilsWeb.CalendarToString(profile.getCreatedDate(), AppBaseConstantsWeb.DATE_FORMAT);
	}

	public Long getProfileId() {
		return profileId;
	}

	public void setProfileId(Long profileId) {
		this.profileId = profileId;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProfilePicUrl() {
		return profilePicUrl;
	}

	public void setProfilePicUrl(String profilePicUrl) {
		this.profilePicUrl = profilePicUrl;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

}
