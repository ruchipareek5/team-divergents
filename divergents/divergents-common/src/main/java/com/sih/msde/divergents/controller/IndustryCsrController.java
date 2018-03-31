package com.sih.msde.divergents.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sih.msde.divergents.dto.IndustryCsrDto;
import com.sih.msde.divergents.service.IndustryCsrService;

@RestController
public class IndustryCsrController {

	private static final Logger LOGGER = LoggerFactory.getLogger(IndustryCsrController.class);
	@Autowired
	 private IndustryCsrService industryCsrService;
	 int submitStatus ;
	@RequestMapping(value="/submitForCsr", method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE)
	public Integer submitForCsr(@RequestBody IndustryCsrDto industryCsrDto)
	{
		try
		{
			LOGGER.debug("Request received from front end to submit the csr Contribution request" +industryCsrDto.getcontactNumber());
		    submitStatus = industryCsrService.submitForCsr(industryCsrDto);
			return  submitStatus;
		}
		catch(Exception e){
			LOGGER.debug("An exception occured while Submit for Csr" +e);
			return submitStatus;
		}
	}
}