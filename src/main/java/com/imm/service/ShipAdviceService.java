package com.imm.service;

import com.imm.model.IMMRequest;
import com.imm.model.IMMResponse;

/**
 * @author george
 *
 */
public interface ShipAdviceService {

	public IMMResponse advice(IMMRequest shipAdviceRequest);
	
}
