package com.imm.model;

import javax.xml.bind.annotation.XmlElement;

/**
 * @author georgian
 *
 */
public class PurchaseOrderInformation {

	@XmlElement(name = "purchase-order-number")
	private String purchaseOrderNumber;
	
	@XmlElement(name = "account-description")
	private String purchaseOrderDescription;
	
	@XmlElement(name = "purchase-order-amount")
	private String purchaseOrderAmount;
	
	@XmlElement(name = "currency-code")
	private String currencyCode;

	public void setPurchaseOrderNumber(String purchaseOrderNumber) {
		this.purchaseOrderNumber = purchaseOrderNumber;
	}

	public void setPurchaseOrderDescription(String purchaseOrderDescription) {
		this.purchaseOrderDescription = purchaseOrderDescription;
	}

	public void setPurchaseOrderAmount(String purchaseOrderAmount) {
		this.purchaseOrderAmount = purchaseOrderAmount;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

}
