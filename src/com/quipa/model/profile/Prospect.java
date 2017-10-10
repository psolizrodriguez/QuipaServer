package com.quipa.model.profile;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Prospect extends Profile {

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn
	private Address location;
	private Double priceHour;
	private String category;
	private String skills;

	public Prospect() {
	}

	public Prospect(String lastName, String firstName, String description, String profilePicUrl, String email,
			String password, String mobilePhoneNumber, String status, Calendar createdDate, Address location,
			Double priceHour, String category, String skills) {
		super(lastName, firstName, description, profilePicUrl, email, password, mobilePhoneNumber, status, createdDate);
		this.location = location;
		this.priceHour = priceHour;
		this.category = category;
		this.skills = skills;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public Address getLocation() {
		return location;
	}

	public void setLocation(Address location) {
		this.location = location;
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

}
