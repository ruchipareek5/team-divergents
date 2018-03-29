package com.sih.msde.divergents.service;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sih.msde.divergents.dao.TalentAcquisitionDao;
import com.sih.msde.divergents.dto.TalentAcquisitionDto;

@Service
public class TalentAcquisitionService {
	
	@Autowired
	public TalentAcquisitionDao talentAcquisitionDao;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TalentAcquisitionService.class);
	
	public Collection<TalentAcquisitionDto> getCandidatesForJobRole(String jobRoleName){
		try {
			
			LOGGER.debug("Controller has requested Service to get to get candidates based on job Role name entered");
			
			return talentAcquisitionDao.getCandidateDetailsaccordingtoJobRole(jobRoleName);
		} catch (Exception e) {
			
			LOGGER.debug("An error occured while service process the request by Controller to get candidates based on job Role name entered" + e);
			
			return null;
		}
	}

}
