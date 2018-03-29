package com.sih.msde.divergents.service;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sih.msde.divergents.dao.TrainingMaterialDao;
import com.sih.msde.divergents.dto.TrainingMaterialDto;

@Service
public class TrainingMaterialService {
	
	@Autowired
	public TrainingMaterialDao trainingMaterialDao;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TrainingMaterialService.class);
	
	public Collection<TrainingMaterialDto> getMaterialForJobRole(String jobRoleName){
		try {
			
			LOGGER.debug("Controller has requested Service to get to get material based on job Role name entered");
			
			return trainingMaterialDao.getTrainingMaterialusingJobRole(jobRoleName);
		} catch (Exception e) {
			
			LOGGER.debug("An error occured while service process the request by Controller to get material based on job Role name entered" + e);
			
			return null;
		}
	}

	
	public Collection<TrainingMaterialDto> getAllMaterial(){
		try {
			
			LOGGER.debug("Controller has requested Service to get to get material based on job Role name entered");
			
			return trainingMaterialDao.getAllTrainingMaterial();
		} catch (Exception e) {
			
			LOGGER.debug("An error occured while service process the request by Controller to get material based on job Role name entered" + e);
			
			return null;
		}
	}

}
