package com.sih.msde.divergents.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sih.msde.divergents.dao.IndustryCsrDao;
import com.sih.msde.divergents.dto.IndustryCsrDto;

@Service
public class IndustryCsrService {

	
	private static final Logger LOGGER = LoggerFactory.getLogger(IndustryCsrService.class);
	@Autowired
	private IndustryCsrDao  industryCsrDao;
	
	public int submitForCsr(IndustryCsrDto industryCsrDto)
	{
		int submitStatus;
		LOGGER.debug("Request received from controller to submit data from frontend");
		 submitStatus = industryCsrDao.submitForCsr(industryCsrDto);
		return submitStatus;
	}
}

