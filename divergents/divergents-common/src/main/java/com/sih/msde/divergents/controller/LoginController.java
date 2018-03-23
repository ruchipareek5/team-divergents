package com.sih.msde.divergents.controller;

import java.security.Principal;
import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sih.msde.divergents.dto.LoginDto;
import com.sih.msde.divergents.dto.LoginReceiveDataDto;
import com.sih.msde.divergents.service.LoginService;
import com.sih.msde.divergents.utility.SessionUserUtility;

@RestController
public class LoginController {

	private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	private LoginService loginService;
	
	 @Autowired
	    private SessionUserUtility sessionUserUtility;
	
	@RequestMapping(value="/loginUrl")
	public Collection<LoginDto> getloginDto()
	{
		LOGGER.debug("Sending user Details from the controller to service to validate user with userEmail :" + sessionUserUtility
				.getSessionMangementfromSession().getUsername());
		return loginService.checkUser( sessionUserUtility
				.getSessionMangementfromSession().getUsername(), sessionUserUtility
				.getSessionMangementfromSession().getPassword() );
		
	}

	@RequestMapping("/user")
	public Principal user(Principal user) {
		LOGGER.debug("In LoginController - user");
		LOGGER.debug("Parameters Received from front end are - 'user': "+user);
		try{
		LOGGER.debug("Trying to return user to front end");
		return user;
		}
		catch(Exception e)
		{
			LOGGER.error("An exception occured while finding user details " + e );
			return null;
		}
	}
}
