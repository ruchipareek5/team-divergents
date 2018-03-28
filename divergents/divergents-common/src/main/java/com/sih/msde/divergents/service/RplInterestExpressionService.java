package com.sih.msde.divergents.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sih.msde.divergents.dao.RplInterestExpressionDao;
import com.sih.msde.divergents.dto.RplInterestExpressionDto;

@Service
public class RplInterestExpressionService {

	
	private static final Logger LOGGER = LoggerFactory.getLogger(RplInterestExpressionService.class);
	@Autowired
	private RplInterestExpressionDao  rplInterestExpressionDao;
	
	public int registerForRpl(RplInterestExpressionDto rplInterestExpressionDto)
	{
		int submitStatus;
		LOGGER.debug("Request received from controller to submit data from frontend");
		 submitStatus = rplInterestExpressionDao.registerForRpl(rplInterestExpressionDto);
		return submitStatus;
	}
}
