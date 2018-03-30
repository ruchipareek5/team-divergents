package com.sih.msde.divergents.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.sih.msde.divergents.common.AbstractTransactionalDao;
import com.sih.msde.divergents.config.JobRoleConfig;

import com.sih.msde.divergents.dto.JobRoleDto;

@Repository
public class JobRoleDao extends AbstractTransactionalDao{

	
	@Autowired
	public JobRoleConfig jobRoleConfig;	
	

	private static final JobRoleRowSelectRowMapper ROW_MAPPER = new JobRoleRowSelectRowMapper();
	
	private static final Logger LOGGER = LoggerFactory.getLogger(JobRoleDao.class);
	
	public Collection<JobRoleDto> getJobRoleDetails(String letter) {
	
		try {
			LOGGER.debug("Request Received from service to get Job Roles based on Letter selected");
			
			Map<String, Object> parameters = new HashMap<>();
			
			parameters.put("letter", letter);
			
			return getJdbcTemplate().query(jobRoleConfig.getSelectJobRole(), parameters, ROW_MAPPER);
		} catch (Exception e) {
			
			LOGGER.debug("An error occured while getting the Jobe roles based on selected letter" + e);
			return null;
		}
	}
	
	public Collection<JobRoleDto> getAllJobRoleDetails() {
		
		try {
			LOGGER.debug("Request Received from service to get all Job Roles ");
			
			Map<String, Object> parameters = new HashMap<>();
			
			return getJdbcTemplate().query(jobRoleConfig.getSelectAllJobRole(), parameters, ROW_MAPPER);
		} catch (Exception e) {
			
			LOGGER.debug("An error occured while getting all the Job roles " + e);
			return null;
		}
	}


private static class JobRoleRowSelectRowMapper implements RowMapper<JobRoleDto> {

	@Override
	public JobRoleDto mapRow(ResultSet resultSet, int rowNum)
			throws SQLException {
		String jobRoleId = resultSet.getString("jobRoleId");
		String jobRoleName = resultSet.getString("jobRoleName");
		String jobRoleDescription = resultSet.getString("jobRoleDescription");
		String jobRoleUrl = resultSet.getString("jobRoleUrl");
		String ssc = resultSet.getString("ssc");
		return new JobRoleDto(jobRoleId,jobRoleName,jobRoleDescription,jobRoleUrl,ssc);
		
	}
		        
	}

}
