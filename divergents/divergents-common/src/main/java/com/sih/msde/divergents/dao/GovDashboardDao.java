package com.sih.msde.divergents.dao;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sih.msde.divergents.common.AbstractTransactionalDao;
import com.sih.msde.divergents.config.GovDashboardConfigSql;

@Repository
public class GovDashboardDao extends AbstractTransactionalDao {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(GovDashboardDao.class);
	
	@Autowired
	private GovDashboardConfigSql govDashboardConfigSql;
	
	public Integer getTotalTrainingCenters()
	{
		try {
			
			LOGGER.debug("Request received from service to get total training partners");
			Map<String,Object> parameters = new HashMap<>();
			LOGGER.debug("Trying to fetch the total number of training centers in India");
			return getJdbcTemplate().queryForObject(govDashboardConfigSql.getTotalTrainingCenters(),parameters ,Integer.class);
			
		}
		catch(Exception e) {
			LOGGER.debug("An exception occured while fetching the total number of training centers" +e);
			LOGGER.debug("Returning NULL as a response");
			return null;
		}
	}
	
	public Integer getTotalCandidatesPlaced()
	{
		try {
			
			LOGGER.debug("Received request from service to get total candidates placed");
			Map<String,Object> parameters = new HashMap<>();
			LOGGER.debug("Trying to get total candidares placed in India");
			return getJdbcTemplate().queryForObject(govDashboardConfigSql.getTotalCandidatesPlaced(), parameters, Integer.class);
		}
		catch(Exception e)
		{
			LOGGER.debug("An exception occured while fetching total candidates placed " +e);
			LOGGER.debug("Returning Null");
			return null;
		}
	}
}	
