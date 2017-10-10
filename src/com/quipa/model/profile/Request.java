package com.quipa.model.profile;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Request {
	@Id
	@GeneratedValue
	private Long requestId;
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar date;
	private String fromHour;
	private String toHour;
	private Double hours;
	private Double priceHour;
	private Double subtotal;
	private Double taxes;
	private Double transportation;
	private Double total;
	private String jobTitle;
	private String description;
	private String status;
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn
	private Profile profile;
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn
	private Address location;

	public Request() {
	}

	public Request(Calendar date, String fromHour, String toHour, Double hours, Double priceHour, Double subtotal, Double taxes,
			Double transportation, Double total, String jobTitle, String description, String status, Profile profile,
			Address location) {
		this.date = date;
		this.fromHour = fromHour;
		this.toHour = toHour;
		this.hours = hours;
		this.priceHour = priceHour;
		this.subtotal = subtotal;
		this.taxes = taxes;
		this.transportation = transportation;
		this.total = total;
		this.jobTitle = jobTitle;
		this.description = description;
		this.status = status;
		this.profile = profile;
		this.location = location;
	}

	public Long getRequestId() {
		return requestId;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public String getFrom() {
		return fromHour;
	}

	public void setFrom(String fromHour) {
		this.fromHour = fromHour;
	}

	public String getTo() {
		return toHour;
	}

	public void setTo(String toHour) {
		this.toHour = toHour;
	}

	public Double getHours() {
		return hours;
	}

	public void setHours(Double hours) {
		this.hours = hours;
	}

	public Double getPriceHour() {
		return priceHour;
	}

	public void setPriceHour(Double priceHour) {
		this.priceHour = priceHour;
	}

	public Double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

	public Double getTaxes() {
		return taxes;
	}

	public void setTaxes(Double taxes) {
		this.taxes = taxes;
	}

	public Double getTransportation() {
		return transportation;
	}

	public void setTransportation(Double transportation) {
		this.transportation = transportation;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public Address getLocation() {
		return location;
	}

	public void setLocation(Address location) {
		this.location = location;
	}

	public void setRequestId(Long requestId) {
		this.requestId = requestId;
	}

}
