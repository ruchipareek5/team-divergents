package com.sih.msde.divergents.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sih.msde.divergents.dto.RplInterestExpressionDto;
import com.sih.msde.divergents.service.RplInterestExpressionService;

@RestController
public class RplInterestExpressionController {

	private static final Logger LOGGER = LoggerFactory.getLogger(RplInterestExpressionController.class);
	@Autowired
	 private RplInterestExpressionService rplInterestExpressionService;
	 int submitStatus = -5;
	@RequestMapping(value="/registerForRpl", method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE)
	public Integer registerForRpl(@RequestBody RplInterestExpressionDto rplInterestExpressionDto)
	{
		try
		{
			LOGGER.debug("Request received from front end to submit the rpl registration request");
			submitStatus = rplInterestExpressionService.registerForRpl(rplInterestExpressionDto);
			return submitStatus;
		}
		catch(Exception e){
			LOGGER.debug("An exception occured while registring for RPL" +e);
			return submitStatus;
		}
	}
}
