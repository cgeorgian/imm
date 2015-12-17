package com.imm.model;

import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.xml.annotate.JacksonXmlProperty;

/**
 * @author george
 *
 */
public class SerialList
{
	
	@JacksonXmlProperty(localName = "serial-numbers")
    private SerialNumber serialnumber;

	public SerialNumber getSerialnumber() {
		return serialnumber;
	}

	@XmlElement
	public void setSerialnumber(SerialNumber serialnumber) {
		this.serialnumber = serialnumber;
	}

}
