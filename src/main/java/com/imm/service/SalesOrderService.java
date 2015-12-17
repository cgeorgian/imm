package com.imm.service;

import com.imm.model.IMMRequest;
import com.imm.model.IMMResponse;

/**
 * @author george
 *
 */
public interface SalesOrderService {

	public IMMResponse salesOrderSubmission(IMMRequest request);
	
	public IMMResponse salesOrderSuccess(IMMRequest request);
	
	public IMMResponse salesOrderRejection(IMMRequest request);
	
}
