package com.imm.model;

import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.xml.annotate.JacksonXmlProperty;

/**
 * @author georgian
 *
 */
public class SalesOrderSubmission {

	@JacksonXmlProperty(localName = "sales-order-submission")
	private SalesOrderHeader salesOrderSubmissionHeader;
	
	@JacksonXmlProperty(localName = "")
	private SalesOrderDetail salesOrderSubmissionDetail;

	public SalesOrderHeader getSalesOrderSubmissionHeader() {
		return salesOrderSubmissionHeader;
	}

	@XmlElement
	public void setSalesOrderSubmissionHeader(SalesOrderHeader salesOrderSubmissionHeader) {
		this.salesOrderSubmissionHeader = salesOrderSubmissionHeader;
	}

	public SalesOrderDetail getSalesOrderSubmissionDetail() {
		return salesOrderSubmissionDetail;
	}

	@XmlElement
	public void setSalesOrderSubmissionDetail(SalesOrderDetail salesOrderSubmissionDetail) {
		this.salesOrderSubmissionDetail = salesOrderSubmissionDetail;
	}

}
