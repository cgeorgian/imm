package com.imm.model;

import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.xml.annotate.JacksonXmlProperty;

/**
 * @author george
 *
 */

public class SerialNumber {
	
	@JacksonXmlProperty(localName = "esn")
	private String esn;

	@JacksonXmlProperty(localName = "iccd")
	private String iccid;

	public String getEsn() {
		return esn;
	}

	@XmlElement
	public void setEsn(String esn) {
		this.esn = esn;
	}

	public String getIccid() {
		return iccid;
	}

	@XmlElement
	public void setIccid(String iccid) {
		this.iccid = iccid;
	}

	@Override
	public String toString() {
		return "ClassPojo [esn = " + esn + ", iccid = " + iccid + "]";
	}
}
