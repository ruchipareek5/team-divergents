package com.sih.msde.divergents.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sih.msde.divergents.dto.InterestedTpRegistrationDto;
import com.sih.msde.divergents.service.InterestedTpRegistrationService;


@RestController
public class InterestedTpRegistrationController {

	@Autowired
	private InterestedTpRegistrationService interestedTpRegistrationService;
	
	int registrationStatus = -5;
	@RequestMapping(value="/registerInterestedTp",method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE)
	public Integer registerInterestedTp(@RequestBody InterestedTpRegistrationDto interestedTpRegistrationDto){
	
		registrationStatus = interestedTpRegistrationService.registerInterestedTp(interestedTpRegistrationDto);
		
		return registrationStatus;
	}
	
}
