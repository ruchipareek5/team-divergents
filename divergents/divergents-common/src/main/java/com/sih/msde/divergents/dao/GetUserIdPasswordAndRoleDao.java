package com.sih.msde.divergents.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.sih.msde.divergents.common.AbstractTransactionalDao;
import com.sih.msde.divergents.config.SessionManagementConfigSql;
import com.sih.msde.divergents.dto.SessionManagementDto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class GetUserIdPasswordAndRoleDao extends AbstractTransactionalDao{
	private static final Logger LOGGER = LoggerFactory.getLogger(GetUserIdPasswordAndRoleDao.class);
	
	@Autowired
	private SessionManagementConfigSql sessionManagementConfigSql; 

	
	public Integer userExistence(String userId){
		
		LOGGER.debug("Request Received from Service");
		LOGGER.debug("In GetUserIdPasswordAndRoleDao - userExistence");
		LOGGER.debug("Parameters Received from Service are - 'userId': " +userId);
		   	
		LOGGER.debug("Checking Existense of User with User Id");
		
		LOGGER.debug("Creating HashMap object");
		Map<String, Object> parameters = new HashMap<>();
		LOGGER.debug("object created successfully");
		
		LOGGER.debug("Inserting parameters to HashMap object");
		parameters.put("userId", userId);
		LOGGER.debug("Parameters inserted");
		
		LOGGER.debug("Executing SQL query and returning response");
        return getJdbcTemplate().queryForObject(sessionManagementConfigSql.getCheckUserSql(), parameters, Integer.class);
		
	}
	private static class SessionRowMapper implements RowMapper<SessionManagementDto> {

		@Override
		public SessionManagementDto mapRow(ResultSet rs, int rowNum) throws SQLException {			
			String userId=rs.getString("userId");
			String password=rs.getString("password");
			String userRole=rs.getString("userRole");
			return new SessionManagementDto(userId, password, userRole);
		}
	}
	
	private static final SessionRowMapper sessionRowMapper = new SessionRowMapper();
	
	
	public  SessionManagementDto getUserIdPasswordAndRole(String userId)
	{
		LOGGER.debug("Request Received from Service");
		LOGGER.debug("In GetUserIdPasswordAndRoleDao - getUserIdPasswordAndRole");
		LOGGER.debug("Parameters Received from Service are - 'userId': " +userId);
		   	
		LOGGER.debug("Getting UserId , UserRole and Password for User with User Id");
		
		LOGGER.debug("Creating HashMap object");
		Map<String,Object> parameters=new HashMap<String, Object>();
		LOGGER.debug("object created successfully");
		
		LOGGER.debug("Inserting parameters to HashMap object");
		parameters.put("userId",userId);
		LOGGER.debug("Parameters inserted");
		
		LOGGER.debug("Executing SQL query and returning response");
        return getJdbcTemplate().query(sessionManagementConfigSql.getGetUserIdPasswordRole(), parameters,sessionRowMapper).iterator().next();
	}
	


}
