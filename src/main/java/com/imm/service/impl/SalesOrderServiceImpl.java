package com.imm.service.impl;

import org.springframework.stereotype.Service;

import com.imm.model.IMMRequest;
import com.imm.model.IMMResponse;
import com.imm.service.SalesOrderService;

/**
 * @author george
 *
 */
@Service
public class SalesOrderServiceImpl implements SalesOrderService {

	@Override
	public IMMResponse salesOrderSubmission(IMMRequest request) {
		IMMResponse response = new IMMResponse();
		response.setMessageHeader(DummyResponseBuilder.addMessageHeader());
		response.setMessageStatus(DummyResponseBuilder.addMessageStatus());
		response.setTransactionInfo(DummyResponseBuilder.addTransactionInfo());
		return response;
	}

	@Override
	public IMMResponse salesOrderSuccess(IMMRequest request) {
		IMMResponse response = new IMMResponse();
		response.setMessageHeader(DummyResponseBuilder.addMessageHeader());
		response.setMessageStatus(DummyResponseBuilder.addMessageStatus());
		response.setTransactionInfo(DummyResponseBuilder.addTransactionInfo());
		return response;
	}

	@Override
	public IMMResponse salesOrderRejection(IMMRequest request) {
		IMMResponse response = new IMMResponse();
		response.setMessageHeader(DummyResponseBuilder.addMessageHeader());
		response.setMessageStatus(DummyResponseBuilder.addMessageStatus());
		response.setTransactionInfo(DummyResponseBuilder.addTransactionInfo());
		return response;
	}

}
