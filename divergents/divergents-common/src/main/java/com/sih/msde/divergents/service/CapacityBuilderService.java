package com.sih.msde.divergents.service;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sih.msde.divergents.dao.CapacityBuilderDao;
import com.sih.msde.divergents.dto.CapacityBuilderDto;

@Service
public class CapacityBuilderService {
	
	@Autowired
	private CapacityBuilderDao capacityBuilderDao;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CapacityBuilderService.class);
	
	
	
	public Collection<CapacityBuilderDto> getAllTrainingsForTrainingPartner(){
		try {
			
			LOGGER.debug("Controller has requested Service to get all the trainings for Training Partner ");
			
			return capacityBuilderDao.getTrainingForTrainingPartner();
			
		} catch (Exception e) {
			
			LOGGER.debug("An error occured while service process the request by Controller to get all the trainings for Training Partner" + e);
			
			return null;
		}
	}

	
	
	public Collection<CapacityBuilderDto> getAllTrainingsForAssessmentBody(){
		try {
			
			LOGGER.debug("Controller has requested Service to get all the trainings for Assessment Body ");
			
			return capacityBuilderDao.getTrainingForAssessmentBody();
			
		} catch (Exception e) {
			
			LOGGER.debug("An error occured while service process the request by Controller to get all the trainings for Assessment Body" + e);
			
			return null;
		}
	}
	
	
}
