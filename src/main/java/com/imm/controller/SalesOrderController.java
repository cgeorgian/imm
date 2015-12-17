package com.imm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.imm.model.IMMRequest;
import com.imm.model.IMMResponse;
import com.imm.service.SalesOrderService;

/**
 * Created by george.
 */

@RestController
@RequestMapping("/salesorder")
public class SalesOrderController {

	@Autowired
	private SalesOrderService service;

	@RequestMapping(value = "/submission", method = RequestMethod.POST, produces = "application/xml")
	public @ResponseBody IMMResponse submission(IMMRequest immRequest) {
		return service.salesOrderSubmission(immRequest);
	}

	@RequestMapping(value = "/success", method = RequestMethod.POST, produces = "application/xml")
	public @ResponseBody IMMResponse success(IMMRequest immRequest) {
		return service.salesOrderSuccess(immRequest);
	}

	@RequestMapping(value = "/rejection", method = RequestMethod.POST, produces = "application/xml")
	public @ResponseBody IMMResponse rejection(IMMRequest immRequest) {
		return service.salesOrderRejection(immRequest);
	}
}
