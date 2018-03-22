package com.sih.msde.divergents.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sih.msde.divergents.dao.SignupDao;
import com.sih.msde.divergents.dto.SignupDto;

@Service
public class SignupService {

	private static final Logger LOGGER = LoggerFactory.getLogger(SignupService.class);
	@Autowired
	private SignupDao signupDao;
	int userExistenceStatus = -20;
	int insertNewUser = -10;
	
	public int checkUserExistence(SignupDto signupDto) {
		LOGGER.debug("Request received from controller to check existence of user with userId: " + signupDto.getUserId());
		userExistenceStatus = signupDao.checkUserExistence(signupDto.getUserId(), signupDto.getOrganizationName());
		if(userExistenceStatus == 0) 
		{
			//User does not exists in the database
			insertNewUser = signupDao.insertNewUser(signupDto);
			return insertNewUser;
		}
		else if(userExistenceStatus == 1) {
			//User already exists in the database
			LOGGER.debug("User with userId: " +signupDto.getUserId() + "already exists in the database");
		   }
		return userExistenceStatus;
	}
			
	}
	

