package com.imm.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author george
 *
 */
@XmlRootElement(name = "message")
public class ShipAdviceRequest {

	@XmlElement(name = "message-header")
	private IMMMessageHeader messageHeader;
	
	@XmlElement(name ="ship-advice")
	private ShipAdvice shipAdvice;
	
	@XmlElement(name="transaction-info")
	private TransactionInfo transactionInfo;

}
