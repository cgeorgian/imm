package com.imm.model;

import javax.xml.bind.annotation.XmlElement;

/**
 * @author georgian
 *
 */
public class TransactionInfo {

	@XmlElement(name = "eventID")
	private String eventId;

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	@Override
	public String toString() {
		return "IMMTransactionInfo [eventId=" + eventId + "]";
	}

}
