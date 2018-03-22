package com.sih.msde.divergents.controller;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sih.msde.divergents.dto.LoginDto;
import com.sih.msde.divergents.dto.LoginReceiveDataDto;
import com.sih.msde.divergents.service.LoginService;

@RestController
public class LoginController {

	private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value="/loginUrl",method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE)
	public Collection<LoginDto> getloginDto(@RequestBody LoginReceiveDataDto loginReceiveDataDto)
	{
		LOGGER.debug("Sending user Details from the controller to service to validate user with userEmail :" + loginReceiveDataDto.getUserId());
		return loginService.checkUser( loginReceiveDataDto );
		
	}
}
