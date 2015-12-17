package com.imm.model;

import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.xml.annotate.JacksonXmlProperty;

/**
 * @author georgian
 *
 */
public class LineItem {

	@JacksonXmlProperty(localName = "line-no")
	private String lineNo;

	@JacksonXmlProperty(localName = "item-code")
	private String itemCode;

	@JacksonXmlProperty(localName = "quantity")
	private String quantity;

	@JacksonXmlProperty(localName = "unit-of-measure")
	private String unitOfMeasure;

	@JacksonXmlProperty(localName = "universal-product-code")
	private String universalProductCode;

	@JacksonXmlProperty(localName = "ship-quantity")
	private String shipQuantity;

	@JacksonXmlProperty(localName = "serial-list")
	private SerialList serialList;

	@JacksonXmlProperty(localName = "line-status")
	private String lineStatus;

	@JacksonXmlProperty(localName = "base-price")
	private String basePrice;

	@JacksonXmlProperty(localName = "serial-list")
	private String billOfLanding;

	@JacksonXmlProperty(localName = "pallet-id")
	private String palletId;

	@JacksonXmlProperty(localName = "scac")
	private String scac;

	@JacksonXmlProperty(localName = "container-id")
	private String containerId;

	public String getLineNo() {
		return lineNo;
	}

	@XmlElement
	public void setLineNo(String lineNo) {
		this.lineNo = lineNo;
	}

	public String getItemCode() {
		return itemCode;
	}

	@XmlElement
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getQuantity() {
		return quantity;
	}

	@XmlElement
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getUnitOfMeasure() {
		return unitOfMeasure;
	}

	@XmlElement
	public void setUnitOfMeasure(String unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}

	public String getUniversalProductCode() {
		return universalProductCode;
	}

	@XmlElement
	public void setUniversalProductCode(String universalProductCode) {
		this.universalProductCode = universalProductCode;
	}

	public String getShipQuantity() {
		return shipQuantity;
	}

	@XmlElement
	public void setShipQuantity(String shipQuantity) {
		this.shipQuantity = shipQuantity;
	}

	public SerialList getSerialList() {
		return serialList;
	}

	@XmlElement
	public void setSerialList(SerialList serialList) {
		this.serialList = serialList;
	}

	public String getLineStatus() {
		return lineStatus;
	}

	@XmlElement
	public void setLineStatus(String lineStatus) {
		this.lineStatus = lineStatus;
	}

	public String getBasePrice() {
		return basePrice;
	}

	@XmlElement
	public void setBasePrice(String basePrice) {
		this.basePrice = basePrice;
	}

	public String getBillOfLanding() {
		return billOfLanding;
	}

	@XmlElement
	public void setBillOfLanding(String billOfLanding) {
		this.billOfLanding = billOfLanding;
	}

	public String getPalletId() {
		return palletId;
	}

	@XmlElement
	public void setPalletId(String palletId) {
		this.palletId = palletId;
	}

	public String getScac() {
		return scac;
	}

	@XmlElement
	public void setScac(String scac) {
		this.scac = scac;
	}

	public String getContainerId() {
		return containerId;
	}

	@XmlElement
	public void setContainerId(String containerId) {
		this.containerId = containerId;
	}

}
