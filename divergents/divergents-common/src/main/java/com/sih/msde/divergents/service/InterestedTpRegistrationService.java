package com.sih.msde.divergents.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sih.msde.divergents.dao.InterestedTpDao;
import com.sih.msde.divergents.dto.InterestedTpRegistrationDto;

@Service
public class InterestedTpRegistrationService {

	private static final Logger LOGGER = LoggerFactory.getLogger(InterestedTpRegistrationService.class);
	@Autowired
	private InterestedTpDao interestedTpDao;
	int registrationCheckStatus = -20;
	int registrationStatus = -5 ;
	
	public Integer registerInterestedTp(InterestedTpRegistrationDto interestedTpRegistrationDto){
	
		LOGGER.debug("Request received from controller to check the existence of training partner against a job role");
		LOGGER.debug("Checking existence of training partner against the job role: " +interestedTpRegistrationDto.getJobRole());
		registrationCheckStatus = interestedTpDao.checkTpRegistrationStatus(interestedTpRegistrationDto);
		
	    if(registrationCheckStatus == 0)
		{
			LOGGER.debug("TP with selected job role does not exists in the database");
			LOGGER.debug("Inserting interested TP in the database");
			registrationStatus = interestedTpDao.registerInterestedTp(interestedTpRegistrationDto);
			
		}
	    else if (registrationCheckStatus == 1)
	    {
			LOGGER.debug("TP with the selected job role already exists in the database");
			 registrationCheckStatus = -1;
			 return registrationCheckStatus;
		}
		return registrationStatus;
	}
	
}
