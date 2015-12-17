package com.imm.model;

import javax.xml.bind.annotation.XmlElement;

/**
 * @author george
 *
 */
public class ShipmentHeader {
	
	@XmlElement(name="purchase-order-information")
	private PurchaseOrderInformation purchaseOrderInformation;

	@XmlElement(name="customer-id")
    private String customerId;

	@XmlElement(name="shipment-information")
    private ShipmentInformation shipmentInformation;

	@XmlElement(name="order-header")
    private OrderHeader orderHeader;

	public PurchaseOrderInformation getPurchaseOrderInformation() {
		return purchaseOrderInformation;
	}

	public void setPurchaseOrderInformation(PurchaseOrderInformation purchaseOrderInformation) {
		this.purchaseOrderInformation = purchaseOrderInformation;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public ShipmentInformation getShipmentInformation() {
		return shipmentInformation;
	}

	public void setShipmentInformation(ShipmentInformation shipmentInformation) {
		this.shipmentInformation = shipmentInformation;
	}

	public OrderHeader getOrderHeader() {
		return orderHeader;
	}

	public void setOrderHeader(OrderHeader orderHeader) {
		this.orderHeader = orderHeader;
	}

}
