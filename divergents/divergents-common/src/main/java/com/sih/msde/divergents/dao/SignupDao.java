package com.sih.msde.divergents.dao;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sih.msde.divergents.common.AbstractTransactionalDao;
import com.sih.msde.divergents.config.SignupConfigSql;
import com.sih.msde.divergents.dto.SignupDto;

@Repository
public class SignupDao extends AbstractTransactionalDao {

	private Integer newUserInsertStatus=-20;
	private Integer checkUserExistence=-15;
	private static final Logger LOGGER = LoggerFactory.getLogger(SignupDao.class);
	
	@Autowired
    private	SignupConfigSql signupConfigSql;
	
	public Integer checkUserExistence(String userId, String organizationName) {
		
		try {
		
		Map<String,Object> parameters = new HashMap<>();
		parameters.put("userId",userId);
		parameters.put("organizationName", organizationName);
		LOGGER.debug("Parameters inserted into hashmap are: " + parameters);
		LOGGER.debug(signupConfigSql.getCheckUserSql());
		checkUserExistence = getJdbcTemplate().queryForObject(signupConfigSql.getCheckUserSql(),parameters,Integer.class);
		
		}
		catch(Exception e) {
			
			LOGGER.debug("An exception was caught while checking existence of user in the database:" +e);
		}
		
		return checkUserExistence;
		
		}
	
	public Integer insertNewUser(SignupDto signupDto)
	{

		try {

			LOGGER.debug("Creating hashmap of objects to insert into database");
			Map<String,Object> userDetails = new HashMap<>();
			userDetails.put("organisationName", signupDto.getOrganizationName());
			userDetails.put("sPOCName",signupDto.getsPOCName());
			userDetails.put("userId", signupDto.getUserId());
			userDetails.put("password", signupDto.getPassword());
			userDetails.put("userRole", signupDto.getUserRole());
			
			newUserInsertStatus = getJdbcTemplate().queryForObject(signupConfigSql.getInsertSql(),userDetails,Integer.class);

		}
		catch(Exception e) {
			
			LOGGER.debug("An exception was caught while inserting credentials of new user in the database" +e);
		}
		
	return newUserInsertStatus;
}
	
}

