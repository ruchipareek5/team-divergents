package com.sih.msde.divergents.dao;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sih.msde.divergents.common.AbstractTransactionalDao;
import com.sih.msde.divergents.config.TpDashboardCongifSql;

@Repository
public class TpDashboardDao extends AbstractTransactionalDao {

	private static final Logger LOGGER = LoggerFactory.getLogger(TpDashboardDao.class);
	
	@Autowired
	private TpDashboardCongifSql tpDashboardConfigSql;
	
	public Integer getTotalJobRoles()
	{
		try {
			
			LOGGER.debug("Request Received from service to get the total number of Job Roles");
			Map<String,Object> parameters = new HashMap<>();
			return getJdbcTemplate().queryForObject(tpDashboardConfigSql.getTotalJobRoles(), parameters, Integer.class);
		}
		
		catch(Exception e) {
		
			LOGGER.debug("An Exception occured while getting total number of Job Roles " +e);
			return null;
		}
	}
	
	public Integer getTotalCandidatesTrained()
	{
		try {
			
			LOGGER.debug("Request Received from service to get the total number of candidates trained");
			Map<String,Object> parameters = new HashMap<>();
			return getJdbcTemplate().queryForObject(tpDashboardConfigSql.getTotalCandidatesTrained(), parameters, Integer.class);
		}
		
		catch(Exception e) {
		
			LOGGER.debug("An Exception occured while getting total number of candidates trained " +e);
			return null;
		}
	}
	
	public Integer getTotalTrainingPartners()
	{
		try {
			
			LOGGER.debug("Request Received from service to get the total number of training partners");
			Map<String,Object> parameters = new HashMap<>();
			return getJdbcTemplate().queryForObject(tpDashboardConfigSql.getTotalTrainingPartners(), parameters, Integer.class);
		}
		
		catch(Exception e) {
		
			LOGGER.debug("An Exception occured while getting total number of training partners " +e);
			return null;
		}
	}
	
	public Integer getTotalSectorSkillCouncil()
	{
		try {
			
			LOGGER.debug("Request Received from service to get the total number of sector skill councils");
			Map<String,Object> parameters = new HashMap<>();
			return getJdbcTemplate().queryForObject(tpDashboardConfigSql.getTotalSectorSkillCouncil(), parameters, Integer.class);
		}
		
		catch(Exception e) {
		
			LOGGER.debug("An Exception occured while getting total number of sector skill councils " +e);
			return null;
		}
	}
	
	public Integer getAnnualTarget()
	{
		try {
			
			LOGGER.debug("Request Received from service to get the total annual budget");
			Map<String,Object> parameters = new HashMap<>();
			return getJdbcTemplate().queryForObject(tpDashboardConfigSql.getAnnualTarget(), parameters, Integer.class);
		}
		
		catch(Exception e) {
		
			LOGGER.debug("An Exception occured while getting total number of sector skill councils " +e);
			return null;
		}
	}
	
	
}
