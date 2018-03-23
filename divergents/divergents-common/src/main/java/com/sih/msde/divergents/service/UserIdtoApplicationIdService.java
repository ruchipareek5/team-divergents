package com.sih.msde.divergents.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sih.msde.divergents.dao.UserIdtoApplicationIdDao;

@Service
public class UserIdtoApplicationIdService {
	private static final Logger LOGGER = LoggerFactory.getLogger(UserIdtoApplicationIdService.class);
	@Autowired
	private UserIdtoApplicationIdDao userIdtoApplicationIdDao;
	
	public int getApplicationId(String userId){
		
		LOGGER.debug("Calling service to get Application Id corresponding to userId");
		return userIdtoApplicationIdDao.getApplicationId(userId);
	}
}
