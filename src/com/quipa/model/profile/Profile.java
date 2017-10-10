package com.quipa.model.profile;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Profile {
	@Id
	@GeneratedValue
	private Long profileId;
	private String lastName;
	private String firstName;
	private String description;
	private String profilePicUrl;
	private String email;
	private String password;
	private String mobilePhoneNumber;
	private String status;
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar createdDate;

	public Profile() {
	}

	public Profile(String lastName, String firstName, String description, String profilePicUrl, String email,
			String password, String mobilePhoneNumber, String status, Calendar createdDate) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.description = description;
		this.profilePicUrl = profilePicUrl;
		this.email = email;
		this.password = password;
		this.mobilePhoneNumber = mobilePhoneNumber;
		this.status = status;
		this.createdDate = createdDate;
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

	public Calendar getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Calendar createdDate) {
		this.createdDate = createdDate;
	}

}
