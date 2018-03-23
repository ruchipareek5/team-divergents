//package com.sih.msde.divergents.controller;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.sih.msde.divergents.dto.SignupDto;
//import com.sih.msde.divergents.service.SignupService;
//
//@RestController
//public class SignupController {
//
//	private static final Logger LOGGER = LoggerFactory.getLogger(SignupController.class);
//	
//	int status;
//	@Autowired
//	SignupService signupService;
//	
//
//	@RequestMapping(value="/skillIndiaSignup",method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE)
//		public Integer signUp(@RequestBody SignupDto signupDto) {
//		
//		LOGGER.debug("Request received in the controller to register user with userId:" +signupDto.getUserId());
//			status = signupService.checkUserExistence(signupDto);
//				
//			return status;
//	}
//	}
//
