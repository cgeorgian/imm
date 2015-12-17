package com.imm.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.xml.annotate.JacksonXmlProperty;

/**
 * @author georgian
 *
 */
public class SalesOrderDetail {
	
	@JacksonXmlProperty(localName = "line-item")
	private List<LineItem> lineItem;

	public List<LineItem> getLineItem() {
		return lineItem;
	}
	
	@XmlElement
	public void setLineItem(List<LineItem> lineItem) {
		this.lineItem = lineItem;
	}

	
}
