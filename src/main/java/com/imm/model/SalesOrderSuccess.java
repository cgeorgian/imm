package com.imm.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

/**
 * @author georgian
 *
 */
public class SalesOrderSuccess {

	@XmlElement(name = "header")
	private SalesOrderHeader header;

	@XmlElement(name = "detail")
	private List<SalesOrderDetail> detail;

	public void setHeader(SalesOrderHeader header) {
		this.header = header;
	}

	public void setDetail(List<SalesOrderDetail> detail) {
		this.detail = detail;
	}

	
}
