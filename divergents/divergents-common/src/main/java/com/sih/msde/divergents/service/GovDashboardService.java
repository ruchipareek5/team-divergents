package com.sih.msde.divergents.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sih.msde.divergents.dao.GovDashboardDao;

@Service
public class GovDashboardService {

	private static final Logger LOGGER = LoggerFactory.getLogger(GovDashboardService.class);
	
	@Autowired
	private GovDashboardDao govDashboardDao;
	
	public Integer getTotalTrainingCenters()
	{
		LOGGER.debug("Request received from controller to get total training centers in India");
		return govDashboardDao.getTotalTrainingCenters();	
	}
}
