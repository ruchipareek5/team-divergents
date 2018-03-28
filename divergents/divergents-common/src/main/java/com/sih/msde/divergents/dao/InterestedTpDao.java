package com.sih.msde.divergents.dao;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sih.msde.divergents.common.AbstractTransactionalDao;
import com.sih.msde.divergents.config.InterestedTpRegistrationConfigSql;
import com.sih.msde.divergents.dto.InterestedTpRegistrationDto;

@Repository
public class InterestedTpDao extends AbstractTransactionalDao {

	private static final Logger LOGGER = LoggerFactory.getLogger(InterestedTpDao.class);
	@Autowired
	private InterestedTpRegistrationConfigSql interestedTpRegistrationConfigSql;

	int registrationStatus=-4;
	int registrationCheckStatus=-20;
	public Integer registerInterestedTp(InterestedTpRegistrationDto interestedTpRegistrationdto)
	{
		try {
			LOGGER.debug("Request received from service to register interested TP");
			Map<String,Object> parameters = new HashMap<>();
			LOGGER.debug("Hashmap of object created");
			parameters.put("organisationName",interestedTpRegistrationdto.getOrganisationName() );
			parameters.put("location",interestedTpRegistrationdto.getLocation());
			parameters.put("jobRole", interestedTpRegistrationdto.getJobRole());
			parameters.put("pocName", interestedTpRegistrationdto.getPocName());
			parameters.put("pocEmail",interestedTpRegistrationdto.getPocEmail());
			LOGGER.debug("Trying to insert the parameters into the database");
			registrationStatus = getJdbcTemplate().update(interestedTpRegistrationConfigSql.getInterestedTpRegistration(), parameters);
			return registrationStatus;
		}
		catch(Exception e) {
		
			LOGGER.debug("An exception occured while inserting records into the database" +e);
			return registrationStatus;
		}
		
	}
	
	public Integer checkTpRegistrationStatus(InterestedTpRegistrationDto interestedTpRegistrationdto)
	{
		try {
			LOGGER.debug("Request received from service to check registration status of user against a job role");
			Map<String,Object> credentials = new HashMap<>();
			credentials.put("organisationName",interestedTpRegistrationdto.getOrganisationName());
			credentials.put("jobRole", interestedTpRegistrationdto.getJobRole());
			LOGGER.debug("Trying to insert credentials into database to check registration status of user against a job role");
			
			LOGGER.debug("The organisation name inserted is" +credentials);
			registrationCheckStatus = getJdbcTemplate().queryForObject(interestedTpRegistrationConfigSql.getInterestedTpCheckStatus(),credentials,Integer.class);
			return registrationCheckStatus;
		}
		catch(Exception e) {
			LOGGER.debug("An exception occured while checking for TP registration status against a job role:" +e);
			return registrationCheckStatus;
		}
	}
	
	
}
