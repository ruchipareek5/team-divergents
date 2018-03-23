package com.sih.msde.divergents.dao;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Repository;

import com.sih.msde.divergents.common.AbstractTransactionalDao;
import com.sih.msde.divergents.config.UserIdtoApplicationIdConfigSql;

@Repository
public class UserIdtoApplicationIdDao extends AbstractTransactionalDao{
	@Autowired
	private UserIdtoApplicationIdConfigSql userIdtoApplicationIdConfigSql;
	private static final Logger LOGGER = LoggerFactory.getLogger(UserIdtoApplicationIdDao.class);
	
	public Integer getApplicationId(String userId){
		try
		{
			Map<String, Object> parameters = new HashMap<>();
			
			
			LOGGER.debug("Inserting parameters to HashMap object");
			parameters.put("userId", userId);
			
			
			LOGGER.debug("Executing SQL query and returning response to fetch applicatio Id");
	        return getJdbcTemplate().queryForObject(userIdtoApplicationIdConfigSql.getSelectSql(), parameters, Integer.class);
		}
		catch(EmptyResultDataAccessException e)
		{
			/*
			 * Application id doesn't exist i.e. no app id is returned corresponding to userId
			 */
					
			LOGGER.error("ERROR: Encountered Exception - "+e);
			
			LOGGER.error("No Application Id found corresponding to UserId sent");
			return -1;
		}
		catch(DataAccessException ex)
		{
			LOGGER.error("An exception occured while accessing data to get application Id from user Id " + ex);
			return -3;
		}
		catch(Exception e)
		{
			LOGGER.error("An exception occured while fetching application Id corresonding to userId " + e);
			return -2;
		}
	}

}
