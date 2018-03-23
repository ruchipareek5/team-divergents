package com.sih.msde.divergents.service;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sih.msde.divergents.dao.LoginDao;
import com.sih.msde.divergents.dto.LoginDto;
import com.sih.msde.divergents.dto.LoginReceiveDataDto;


@Service
public class LoginService {
	private static final Logger LOGGER = LoggerFactory.getLogger(LoginService.class);
	
	@Autowired
	private LoginDao loginDao;
	private int validUserExistence = -1;
	Collection<LoginDto> login;
	public Collection<LoginDto> checkUser(String userId , String password)
	{
		validUserExistence = loginDao.userExistsStatus(userId,password);
		if(validUserExistence == 1)
		{
			LOGGER.debug("User exists in the database");
		    login = loginDao.getUserDetails(userId,password);
			LOGGER.debug("Response received from DAO and stored in the collection");
			LOGGER.debug("Data captured in LoginDto");
			}
			
		else {
			LOGGER.debug("Wrong Credentials");
		
			//	login = new LoginDto(null,null,null);	
		}
		
			LOGGER.debug("Returning Response back to the controller");
			return login;
	}
}
