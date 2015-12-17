package com.imm.model;

import javax.xml.bind.annotation.XmlElement;

/**
 * @author georgian
 *
 */
public class ShipmentInformation {

	@XmlElement(name = "ship-first-name")
	private String shipFirstName;

	@XmlElement(name = "ship-last-name")
	private String shipLastName;

	@XmlElement(name = "ship-address1")
	private String shipAddressOne;

	@XmlElement(name = "ship-address2")
	private String shipAddressTwo;

	@XmlElement(name = "ship-city")
	private String shipCity;

	@XmlElement(name = "ship-state")
	private String shipState;

	@XmlElement(name = "ship-post-code")
	private String shipPostCode;

	@XmlElement(name = "ship-country-code")
	private String shipCountryCode;

	@XmlElement(name = "ship-phone")
	private String shipPhone;

	@XmlElement(name = "ship-email")
	private String shipEmail;

	@XmlElement(name = "ship-via")
	private String shipVia;

	@XmlElement(name = "ship-request-date")
	private String shipRequestDate;

	public void setShipFirstName(String shipFirstName) {
		this.shipFirstName = shipFirstName;
	}

	public void setShipLastName(String shipLastName) {
		this.shipLastName = shipLastName;
	}

	public void setShipAddressOne(String shipAddressOne) {
		this.shipAddressOne = shipAddressOne;
	}

	public void setShipAddressTwo(String shipAddressTwo) {
		this.shipAddressTwo = shipAddressTwo;
	}

	public void setShipCity(String shipCity) {
		this.shipCity = shipCity;
	}

	public void setShipState(String shipState) {
		this.shipState = shipState;
	}

	public void setShipPostCode(String shipPostCode) {
		this.shipPostCode = shipPostCode;
	}

	public void setShipCountryCode(String shipCountryCode) {
		this.shipCountryCode = shipCountryCode;
	}

	public void setShipPhone(String shipPhone) {
		this.shipPhone = shipPhone;
	}

	public void setShipEmail(String shipEmail) {
		this.shipEmail = shipEmail;
	}

	public void setShipVia(String shipVia) {
		this.shipVia = shipVia;
	}

	public void setShipRequestDate(String shipRequestDate) {
		this.shipRequestDate = shipRequestDate;
	}

}
