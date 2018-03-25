package com.sih.msde.divergents.service;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sih.msde.divergents.dao.JobRoleDao;
import com.sih.msde.divergents.dao.TrainingCenterAccordingToJobRoleDao;
import com.sih.msde.divergents.dto.JobRoleDto;
import com.sih.msde.divergents.dto.TrainingCenterAccordingToJobRoleDto;


@Service
public class JobRoleService {
	
	@Autowired
	private JobRoleDao jobRoleDao;
	
	@Autowired
	private TrainingCenterAccordingToJobRoleDao trainingCenterAccordingToJobRoleDao;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(JobRoleService.class);
	
	public Collection<TrainingCenterAccordingToJobRoleDto> gettrainingCenters(String jobRoleId){
		try {
			
			LOGGER.debug("Controller has requested Service to get the Training centre details according to Job Role");
			
			return trainingCenterAccordingToJobRoleDao.getTrainingCentreDetails(jobRoleId);
		} catch (Exception e) {
			
			LOGGER.debug("An error occured while service process the request by Controller" + e);
			
			return null;
		}
	}
	
	public Collection<JobRoleDto> getJobRoles(String letter){
		 return jobRoleDao.getJobRoleDetails(letter);
	}

}
