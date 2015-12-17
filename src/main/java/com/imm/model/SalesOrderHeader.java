package com.imm.model;

import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.xml.annotate.JacksonXmlProperty;

/**
 * @author georgian
 *
 */
public class SalesOrderHeader {
	
	@JacksonXmlProperty(localName = "customer-id")
	private String customerId;
	
	@JacksonXmlProperty(localName = "business-name")
	private String businessName;
	
	@JacksonXmlProperty(localName = "shipment-information")
	private ShipmentInformation shipmentInformation;
	
	@JacksonXmlProperty(localName = "purchase-order-information")
	private PurchaseOrderInformation purchaseOrderInformation;
	
	@JacksonXmlProperty(localName = "order-header")
	private OrderHeader orderHeader;
	
	public String getCustomerId() {
		return customerId;
	}
	
	@XmlElement
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	
	public String getBusinessName() {
		return businessName;
	}
	
	@XmlElement
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	
	public ShipmentInformation getShipmentInformation() {
		return shipmentInformation;
	}
	
	@XmlElement
	public void setShipmentInformation(ShipmentInformation shipmentInformation) {
		this.shipmentInformation = shipmentInformation;
	}
	
	public PurchaseOrderInformation getPurchaseOrderInformation() {
		return purchaseOrderInformation;
	}
	
	@XmlElement
	public void setPurchaseOrderInformation(PurchaseOrderInformation purchaseOrderInformation) {
		this.purchaseOrderInformation = purchaseOrderInformation;
	}
	
	public OrderHeader getOrderHeader() {
		return orderHeader;
	}
	
	@XmlElement
	public void setOrderHeader(OrderHeader orderHeader) {
		this.orderHeader = orderHeader;
	}
	
	
}
