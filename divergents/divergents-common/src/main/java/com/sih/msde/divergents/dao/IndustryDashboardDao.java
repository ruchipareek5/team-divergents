package com.sih.msde.divergents.dao;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sih.msde.divergents.common.AbstractTransactionalDao;
import com.sih.msde.divergents.config.IndustryDashboardConfigSql;

@Repository
public class IndustryDashboardDao extends AbstractTransactionalDao {

	private static final Logger LOGGER = LoggerFactory.getLogger(IndustryDashboardDao.class);
	
	@Autowired
	private IndustryDashboardConfigSql industryDashboardConfigSql;
	
	public Integer getTotalPartnerships()
	{
		try
		{
			LOGGER.debug("Request received from service to get total number of partneships");
			Map<String,Object>parameters = new HashMap<>();
			return getJdbcTemplate().queryForObject(industryDashboardConfigSql.getTotalPartnerships(), parameters, Integer.class);
		}
		catch(Exception e)
		{
			LOGGER.debug("An exception was caught while fetching the total number of partnerships " +e);
			return null;
		}
	}
	
	
	public Integer getTotalCsrFunds()
	{
		try
		{
			LOGGER.debug("Request received from service to get total CSR Funds");
			Map<String,Object>parameters = new HashMap<>();
			return getJdbcTemplate().queryForObject(industryDashboardConfigSql.getTotalCsrFunds(), parameters, Integer.class);
		}
		catch(Exception e)
		{
			LOGGER.debug("An exception was caught while fetching the total CSR Funds " +e);
			return null;
		}
	}
	
	
	public Integer getTotalCandidatesCertified()
	{
		try
		{
			LOGGER.debug("Request received from service to get total number of candidates certified");
			Map<String,Object>parameters = new HashMap<>();
			return getJdbcTemplate().queryForObject(industryDashboardConfigSql.getTotalCandidatesCertified(), parameters, Integer.class);
		}
		catch(Exception e)
		{
			LOGGER.debug("An exception was caught while fetching the total number of candidates certified " +e);
			return null;
		}
	}
	
	
	public Integer getTotalJobRoles()
	{
		try
		{
			LOGGER.debug("Request received from service to get total number of job roles");
			Map<String,Object>parameters = new HashMap<>();
			return getJdbcTemplate().queryForObject(industryDashboardConfigSql.getTotalJobRoles(), parameters, Integer.class);
		}
		catch(Exception e)
		{
			LOGGER.debug("An exception was caught while fetching the total number of job roles " +e);
			return null;
		}
	}
	
	public Integer getTotalTrainingPartners()
	{
		try
		{
			LOGGER.debug("Request received from service to get total number of Training Partners");
			Map<String,Object>parameters = new HashMap<>();
			return getJdbcTemplate().queryForObject(industryDashboardConfigSql.getTotalTrainingPartners(), parameters, Integer.class);
		}
		catch(Exception e)
		{
			LOGGER.debug("An exception was caught while fetching the total number of Training Partners " +e);
			return null;
		}
	}
	
}
