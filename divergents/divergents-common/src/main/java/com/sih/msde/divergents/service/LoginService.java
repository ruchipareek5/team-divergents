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
	
	private LoginDto loginDto;
	
	public LoginDto checkUser(LoginReceiveDataDto loginReceiveDataDto)
	{
		validUserExistence = loginDao.userExistsStatus(loginReceiveDataDto.getUserId(),loginReceiveDataDto.getPassword());
		if(validUserExistence == 1)
		{
			LOGGER.debug("User exists in the database");
			Collection<LoginDto> login= loginDao.getUserDetails(loginReceiveDataDto.getUserId(),loginReceiveDataDto.getPassword());
			LOGGER.debug("Response receivd from DAO and stored in the collection");
			LOGGER.debug("Data captured in LoginDto");
			}
			
		else {
			LOGGER.debug("Wrong Credentials");
			loginDto = new LoginDto(null,null, null, null);	
		}
		
			LOGGER.debug("Returning Response back to the controller");
			return loginDto;
	}
}
