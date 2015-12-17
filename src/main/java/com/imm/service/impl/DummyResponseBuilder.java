package com.imm.service.impl;

import com.imm.model.IMMMessageHeader;
import com.imm.model.IMMResponseMessageStatus;
import com.imm.model.TransactionInfo;

/**
 * @author george
 *
 */
public class DummyResponseBuilder {

	public static TransactionInfo addTransactionInfo() {
		TransactionInfo transactionInfo = new TransactionInfo();
		transactionInfo.setEventId("dummyEventId");
		return transactionInfo;
	}

	public static IMMResponseMessageStatus addMessageStatus() {
		IMMResponseMessageStatus messageStatus = new IMMResponseMessageStatus();
		messageStatus.setComments("dummyComments");
		messageStatus.setResponseTimestamp("123456789");
		messageStatus.setStatusCode(0);
		messageStatus.setStatusDescription("dummyDescription");
		return messageStatus;
	}

	public static IMMMessageHeader addMessageHeader() {
		IMMMessageHeader messageHeader = new IMMMessageHeader();
		messageHeader.setCreateTimeStamp("123456789");
		messageHeader.setMessageId("dummyId");
		messageHeader.setPartnerName("dummyPartnerName");
		messageHeader.setResponseRequest("dummyResponseRequest");
		messageHeader.setSourceURL("dummyURL");
		messageHeader.setTransactionName("dummyTxName");
		return messageHeader;
	}

}
