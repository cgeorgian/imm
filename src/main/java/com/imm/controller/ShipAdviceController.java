package com.imm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.imm.model.IMMRequest;
import com.imm.model.IMMResponse;
import com.imm.service.ShipAdviceService;

/**
 * Created by george
 */
@RestController
public class ShipAdviceController {
	
	@Autowired
	private ShipAdviceService service;
	
	@RequestMapping(value = "/shipadvice", method = RequestMethod.POST, produces = "application/xml")
	public IMMResponse getShipAdvice(IMMRequest shipAdviceRequest){
		return service.advice(shipAdviceRequest);
	}
	
}
