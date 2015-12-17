package com.imm.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author georgian
 *
 */
@XmlRootElement(name = "message")
public class IMMResponse {

	@XmlElement(name = "message-header")
	private IMMMessageHeader messageHeader;

	@XmlElement(name = "message-status")
	private IMMResponseMessageStatus messageStatus;

	@XmlElement(name = "transactionInfo")
	private TransactionInfo transactionInfo;

	public void setMessageHeader(IMMMessageHeader messageHeader) {
		this.messageHeader = messageHeader;
	}

	public void setMessageStatus(IMMResponseMessageStatus messageStatus) {
		this.messageStatus = messageStatus;
	}

	public void setTransactionInfo(TransactionInfo transactionInfo) {
		this.transactionInfo = transactionInfo;
	}

	@Override
	public String toString() {
		return "IMMResponse [messageHeader=" + messageHeader + ", messageStatus=" + messageStatus + ", transactionInfo="
				+ transactionInfo + "]";
	}

}
