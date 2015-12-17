package com.imm.model;

import javax.xml.bind.annotation.XmlElement;

/**
 * @author georgian
 *
 */
public class IMMMessageHeader {

	@XmlElement(name = "message-id")
	private String messageId;

	@XmlElement(name = "transaction-name")
	private String transactionName;

	@XmlElement(name = "partner-name")
	private String partnerName;

	@XmlElement(name = "create-timestamp")
	private String createTimeStamp;

	@XmlElement(name = "source-url")
	private String sourceURL;

	@XmlElement(name = "response-request")
	private String responseRequest;

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public void setTransactionName(String transactionName) {
		this.transactionName = transactionName;
	}

	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}

	public void setCreateTimeStamp(String createTimeStamp) {
		this.createTimeStamp = createTimeStamp;
	}

	public void setResponseRequest(String responseRequest) {
		this.responseRequest = responseRequest;
	}

	public void setSourceURL(String sourceURL) {
		this.sourceURL = sourceURL;
	}

	@Override
	public String toString() {
		return "IMMResponseMessageHeader [messageId=" + messageId + ", transactionName=" + transactionName
				+ ", partnerName=" + partnerName + ", createTimeStamp=" + createTimeStamp + ", sourceURL=" + sourceURL
				+ ", responseRequest=" + responseRequest + "]";
	}

}
