//package com.sih.msde.divergents.utility;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.stereotype.Service;
//
//import com.sih.msde.divergents.dto.SessionManagementDto;
//import com.sih.msde.divergents.service.UserIdtoApplicationIdService;
//
//@Service
//public class SessionUserUtility {
//	private static final Logger LOGGER = LoggerFactory.getLogger(SessionUserUtility.class);
//	@Autowired
//	private UserIdtoApplicationIdService userIdtoApplicationIdService;
//	 public int getApplicationId(String userId) 
//		{	
//		 	LOGGER.debug("Calling User id to application Id service");
//			return userIdtoApplicationIdService.getApplicationId(userId);
//		}	
//	 
//	 public SessionManagementDto getSessionMangementfromSession(){
//		 	LOGGER.debug("Request Received to get Session");
//		 	
//		 	LOGGER.debug("Sending Request to get SessionManagementDto");
//		 return (SessionManagementDto)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//	 }
//}
