package com.quipa.profile.web.representation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.quipa.common.constants.AppBaseConstantsWeb;
import com.quipa.common.utility.AppBaseUtilsWeb;
import com.quipa.model.profile.Message;

@XmlRootElement(name = "Message")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class MessageRepresentation {
	private Long messageId;
	private String content;
	private String createdDate;
	private Long requestId;
	private Long profileId;

	public MessageRepresentation() {
	}

	public MessageRepresentation(Message message) {
		this.messageId = message.getMessageId();
		this.content = message.getContent();
		this.createdDate = AppBaseUtilsWeb.CalendarToString(message.getCreatedDate(), AppBaseConstantsWeb.DATETIME_FORMAT);
		this.requestId = message.getRequest().getRequestId();
		this.profileId = message.getProfile().getProfileId();
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

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public Long getRequestId() {
		return requestId;
	}

	public void setRequestId(Long requestId) {
		this.requestId = requestId;
	}

	public Long getProfileId() {
		return profileId;
	}

	public void setProfileId(Long profileId) {
		this.profileId = profileId;
	}

}
