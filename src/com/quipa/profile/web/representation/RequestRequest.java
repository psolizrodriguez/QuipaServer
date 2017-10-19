package com.quipa.profile.web.representation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class RequestRequest {
	private String date;
	private String fromHour;
	private String toHour;
	private Double hours;
	private Double priceHour;
	private Double subTotal;
	private Double taxes;
	private Double transportation;
	private Double total;
	private String requiredSkill;
	private String jobTitle;
	private String description;
	private Long profileId;
	private Long prospectId;

	public RequestRequest() {
	}

	public RequestRequest(String date, String fromHour, String toHour, Double hours, Double priceHour, Double subTotal,
			Double taxes, Double transportation, Double total, String requiredSkill, String jobTitle,
			String description, Long profileId, Long prospectId) {
		this.date = date;
		this.fromHour = fromHour;
		this.toHour = toHour;
		this.hours = hours;
		this.priceHour = priceHour;
		this.subTotal = subTotal;
		this.taxes = taxes;
		this.transportation = transportation;
		this.total = total;
		this.requiredSkill = requiredSkill;
		this.jobTitle = jobTitle;
		this.description = description;
		this.profileId = profileId;
		this.prospectId = prospectId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getFromHour() {
		return fromHour;
	}

	public void setFromHour(String fromHour) {
		this.fromHour = fromHour;
	}

	public String getToHour() {
		return toHour;
	}

	public void setToHour(String toHour) {
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

	public Double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
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

	public String getRequiredSkill() {
		return requiredSkill;
	}

	public void setRequiredSkill(String requiredSkill) {
		this.requiredSkill = requiredSkill;
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

	public Long getProfileId() {
		return profileId;
	}

	public void setProfileId(Long profileId) {
		this.profileId = profileId;
	}

	public Long getProspectId() {
		return prospectId;
	}

	public void setProspectId(Long prospectId) {
		this.prospectId = prospectId;
	}

}
