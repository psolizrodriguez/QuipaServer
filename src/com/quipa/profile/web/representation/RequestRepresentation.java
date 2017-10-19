package com.quipa.profile.web.representation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.quipa.common.constants.AppBaseConstantsWeb;
import com.quipa.common.utility.AppBaseUtilsWeb;
import com.quipa.model.profile.Request;

@XmlRootElement(name = "Request")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class RequestRepresentation {
	private Long requestId;
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
	private String status;
	private Long profileId;
	private Long prospectId;

	public RequestRepresentation() {
	}

	public RequestRepresentation(Request request) {
		this.requestId = request.getRequestId();
		this.date = AppBaseUtilsWeb.CalendarToString(request.getDate(), AppBaseConstantsWeb.DATE_FORMAT);
		this.fromHour = request.getFromHour();
		this.toHour = request.getToHour();
		this.hours = request.getHours();
		this.priceHour = request.getPriceHour();
		this.subTotal = request.getSubTotal();
		this.taxes = request.getTaxes();
		this.transportation = request.getTransportation();
		this.total = request.getTotal();
		this.requiredSkill = request.getRequiredSkill();
		this.jobTitle = request.getJobTitle();
		this.description = request.getDescription();
		this.status = request.getStatus();
		this.profileId = request.getProfile().getProfileId();
		this.prospectId = request.getProspect().getProfileId();
	}

	public Long getRequestId() {
		return requestId;
	}

	public void setRequestId(Long requestId) {
		this.requestId = requestId;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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
