package com.imm.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

/**
 * @author george
 *
 */
public class ShipAdvice {

	@XmlElement(name = "header")
	private ShipmentHeader shipmentHeader;

	@XmlElement(name = "detail")
	private List<Detail> detail;

	public void setShipmentHeader(ShipmentHeader shipmentHeader) {
		this.shipmentHeader = shipmentHeader;
	}

	public void setDetail(List<Detail> detail) {
		this.detail = detail;
	}

}
