package com.imm.model;

import javax.xml.bind.annotation.XmlElement;

/**
 * @author georgian
 *
 */
public class IMMResponseMessageStatus {

	@XmlElement(name = "status-code")
	private int statusCode;

	@XmlElement(name = "status-description")
	private String statusDescription;

	@XmlElement(name = "comments")
	private String comments;

	@XmlElement(name = "response-timestamp")
	private String responseTimestamp;

	@XmlElement(name = "filename")
	private String fileName;

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public void setResponseTimestamp(String responseTimestamp) {
		this.responseTimestamp = responseTimestamp;
	}

	@Override
	public String toString() {
		return "IMMResponseMessageStatus [statusCode=" + statusCode + ", statusDescription=" + statusDescription
				+ ", comments=" + comments + ", responseTimestamp=" + responseTimestamp + ", fileName=" + fileName
				+ "]";
	}

}
