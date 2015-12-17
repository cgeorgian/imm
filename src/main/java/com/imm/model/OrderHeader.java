package com.imm.model;

import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.xml.annotate.JacksonXmlProperty;

/**
 * @author georgian
 *
 */
public class OrderHeader {

	@JacksonXmlProperty(localName = "customer-order-number")
	private String customerOrderNumber;
	
	@JacksonXmlProperty(localName = "customer-order-date")
	private String customerOrderDate;
	
	@JacksonXmlProperty(localName = "order-reference")
	private String orderReference;
	
	@JacksonXmlProperty(localName = "order-type")
	private String orderType;

	public String getCustomerOrderNumber() {
		return customerOrderNumber;
	}

	@XmlElement
	public void setCustomerOrderNumber(String customerOrderNumber) {
		this.customerOrderNumber = customerOrderNumber;
	}

	public String getCustomerOrderDate() {
		return customerOrderDate;
	}

	@XmlElement
	public void setCustomerOrderDate(String customerOrderDate) {
		this.customerOrderDate = customerOrderDate;
	}

	public String getOrderReference() {
		return orderReference;
	}

	@XmlElement
	public void setOrderReference(String orderReference) {
		this.orderReference = orderReference;
	}

	public String getOrderType() {
		return orderType;
	}

	@XmlElement
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

}
