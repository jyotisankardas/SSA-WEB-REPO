package com.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.exception.StatecodeNotFoundException;
import com.nit.service.SSARegistrationService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api("This Rest Controller Finds StateCode For Corresponding SSN Number")
@RestController
public class PersonRestController {

	@Autowired
	private SSARegistrationService service;
	
	@ApiResponses({
		@ApiResponse(code = 200,message = "Success"),
		@ApiResponse(code = 400,message = "BadRequest"),
		@ApiResponse(code = 500, message = "Server Problem") 
	})

	@ApiOperation(value = "This method is given returns give State Code")
	@RequestMapping(value = "/getstatestatename/{ssnum}", produces = "application/json")
	public String getStateCode(@ApiParam(value = "give SSA Number",required =true)@PathVariable(value = "ssnum") String ssnum) throws StatecodeNotFoundException {

		String stateName = service.getStateName(ssnum);
		//return (stateName!=null)?stateName:throw new StatecodeNotFoundException("State Not Found");
	if(stateName!=null) {
		return stateName;
	}else {
		throw new StatecodeNotFoundException("State Not Found");
	}
	
	}

}
