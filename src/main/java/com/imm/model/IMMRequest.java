package com.imm.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.xml.annotate.JacksonXmlProperty;

/**
 * @author georgian
 *
 */
@XmlRootElement
public class IMMRequest {

	@JacksonXmlProperty(localName = "message")
	private IMMMessage message;

	public IMMMessage getMessage() {
		return message;
	}
	
	@XmlElement
	public void setMessage(IMMMessage message) {
		this.message = message;
	}

}
