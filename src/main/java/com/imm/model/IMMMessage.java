package com.imm.model;

import javax.xml.bind.annotation.XmlElement;

/**
 * @author georgian
 *
 */
public class IMMMessage {

	@XmlElement(name = "message-header")
	private IMMMessageHeader messageHeader;

	@XmlElement(name = "sales-order-submission")
	private SalesOrderSubmission salesOrderSubmission;
	
	@XmlElement(name = "sales-order-success")
	private SalesOrderSuccess salesOrderSuccess;
	
	@XmlElement(name = "sales-order-rejection")
	private SalesOrderRejection salesOrderRejection;
	
	@XmlElement(name = "transactionInfo")
	private TransactionInfo transactionInfo;

	public void setMessageHeader(IMMMessageHeader messageHeader) {
		this.messageHeader = messageHeader;
	}

	public void setSalesOrderSubmission(SalesOrderSubmission salesOrderSubmission) {
		this.salesOrderSubmission = salesOrderSubmission;
	}

	public void setTransactionInfo(TransactionInfo transactionInfo) {
		this.transactionInfo = transactionInfo;
	}

	public void setSalesOrderRejection(SalesOrderRejection salesOrderRejection) {
		this.salesOrderRejection = salesOrderRejection;
	}

}
