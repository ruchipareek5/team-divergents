package com.sih.msde.divergents.service;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sih.msde.divergents.dao.JobOpeningDao;
import com.sih.msde.divergents.dto.JobOpeningsDto;

@Service
public class JobOpeningsService {
	
	@Autowired
	private JobOpeningDao jobOpeningDao;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(JobOpeningsService.class);
	
	public Collection<JobOpeningsDto> getAllJobOpenings(){
		try {
			
			LOGGER.debug("Controller has requested Service to get all the job openings ");
			
			return jobOpeningDao.getJobOpeningsAll();
			
		} catch (Exception e) {
			
			LOGGER.debug("An error occured while service process the request by Controller" + e);
			
			return null;
		}
	}
	
	public Collection<JobOpeningsDto> getJobOpeningsusingJobRoleandLocation(String jobRoleName, String location){
		try {
			
			LOGGER.debug("Controller has requested Service to get the job openings based on Job Role Name and Location");
			
			return jobOpeningDao.getJobOpeningsusingJobRoleandLocation(jobRoleName, location);
			
		} catch (Exception e) {
			
			LOGGER.debug("An error occured while service process the request by Controller" + e);
			
			return null;
		}
	}
	
	public Collection<JobOpeningsDto> getJobOpeningsusingLocation(String location){
		try {
			
			LOGGER.debug("Controller has requested Service to get the job openings based on Location");
			
			return jobOpeningDao.getJobOpeningsusingLocation(location);
			
		} catch (Exception e) {
			
			LOGGER.debug("An error occured while service process the request by Controller" + e);
			
			return null;
		}
	}
	
	public Collection<JobOpeningsDto> getJobOpeningsusingJobRole(String jobRoleName){
		try {
			
			LOGGER.debug("Controller has requested Service to get the job openings based on Job Role Name ");
			
			return jobOpeningDao.getJobOpeningsusingJobRole(jobRoleName);
			
		} catch (Exception e) {
			
			LOGGER.debug("An error occured while service process the request by Controller" + e);
			
			return null;
		}
	}

}
