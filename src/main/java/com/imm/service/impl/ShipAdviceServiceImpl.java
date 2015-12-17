package com.imm.service.impl;

import org.springframework.stereotype.Service;

import com.imm.model.IMMRequest;
import com.imm.model.IMMResponse;
import com.imm.service.ShipAdviceService;

/**
 * @author george
 *
 */
@Service
public class ShipAdviceServiceImpl implements ShipAdviceService{

	@Override
	public IMMResponse advice(IMMRequest shipAdviceRequest) {
		IMMResponse response = new IMMResponse();
		response.setMessageHeader(DummyResponseBuilder.addMessageHeader());
		response.setMessageStatus(DummyResponseBuilder.addMessageStatus());
		response.setTransactionInfo(DummyResponseBuilder.addTransactionInfo());
		return response ;
	}

}
