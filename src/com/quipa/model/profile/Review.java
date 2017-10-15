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
public class Review {
	@Id
	@GeneratedValue
	private Long reviewId;
	private String title;
	private String description;
	private Integer rating;
	private String status;
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar createdDate;
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn
	private Request request;

	public Long getReviewId() {
		return reviewId;
	}

	public void setReviewId(Long reviewId) {
		this.reviewId = reviewId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
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

	public Request getRequest() {
		return request;
	}

	public void setRequest(Request request) {
		this.request = request;
	}

}
