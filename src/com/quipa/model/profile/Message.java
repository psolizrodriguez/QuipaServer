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
public class Message {
	@Id
	@GeneratedValue
	private Long messageId;
	private String content;
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar createdDate;
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn
	private Request request;
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn
	private Profile profile;

	public Message() {
	}

	public Message(String content, Calendar createdDate, Request request, Profile profile) {

		this.content = content;
		this.createdDate = createdDate;
		this.request = request;
		this.profile = profile;
	}

	public Long getMessageId() {
		return messageId;
	}

	public void setMessageId(Long messageId) {
		this.messageId = messageId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
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

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

}
