package com.quipa.model.profile;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Profile {
	@Id
	@GeneratedValue
	private Long profileId;
	private String name;
	private String description;
	private String profilePicture;
	private String email;
	private String password;
	private String mobilePhoneNumber;
	private String status;
	private Double latitude;
	private Double longitude;
	private Double priceHour;
	private String category;
	private String skills;
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar createdDate;

	public Profile() {
	}

	public Profile(Long profileId, String name, String description, String profilePicture, String email,
			String password, String mobilePhoneNumber, String status, Double latitude, Double longitude, Double priceHour,
			String category, String skills, Calendar createdDate) {
		this.profileId = profileId;
		this.name = name;
		this.description = description;
		this.profilePicture = profilePicture;
		this.email = email;
		this.password = password;
		this.mobilePhoneNumber = mobilePhoneNumber;
		this.status = status;
		this.latitude = latitude;
		this.longitude = longitude;
		this.priceHour = priceHour;
		this.category = category;
		this.skills = skills;
		this.createdDate = createdDate;
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

	public Calendar getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Calendar createdDate) {
		this.createdDate = createdDate;
	}

}
