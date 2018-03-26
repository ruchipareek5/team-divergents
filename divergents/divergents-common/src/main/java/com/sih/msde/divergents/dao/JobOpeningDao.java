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
import com.sih.msde.divergents.config.JobOpeningsConfig;
import com.sih.msde.divergents.dto.JobOpeningsDto;

@Repository
public class JobOpeningDao extends AbstractTransactionalDao{
	
	@Autowired
	private JobOpeningsConfig jobOpeningsConfig;
	
	
private static final JobOpeningsRowSelectRowMapper ROW_MAPPER = new JobOpeningsRowSelectRowMapper();
	
	private static final Logger LOGGER = LoggerFactory.getLogger(JobOpeningDao.class);
	
	public Collection<JobOpeningsDto> getJobOpeningsAll() {
		
		try {
			LOGGER.debug("Request Received from service to get all Job Opening ");
			
			Map<String, Object> parameters = new HashMap<>();
			
			return getJdbcTemplate().query(jobOpeningsConfig.getSelectJobsAll(), parameters, ROW_MAPPER);
		} catch (Exception e) {
			
			LOGGER.debug("An error occured while getting all the Job Opening" + e);
			return null;
		}
	}
	
	
	public Collection<JobOpeningsDto> getJobOpeningsusingJobRoleandLocation(String jobRoleName, String location) {
	
		try {
			LOGGER.debug("Request Received from service to get Job Opening based on Job role and location selected");
			
			Map<String, Object> parameters = new HashMap<>();
			
			parameters.put("jobRoleName", jobRoleName);
			parameters.put("location", location);
			
			return getJdbcTemplate().query(jobOpeningsConfig.getSelectJobswithNameAndLocation(), parameters, ROW_MAPPER);
		} catch (Exception e) {
			
			LOGGER.debug("An error occured while getting the Jobe roles based on selected Job role and location" + e);
			return null;
		}
	}
	
	
	public Collection<JobOpeningsDto> getJobOpeningsusingLocation(String location) {
		
		try {
			LOGGER.debug("Request Received from service to get Job Opening based on location selected");
			
			Map<String, Object> parameters = new HashMap<>();
			
			
			parameters.put("location", location);
			
			return getJdbcTemplate().query(jobOpeningsConfig.getSelectJobswithLocation(), parameters, ROW_MAPPER);
		} catch (Exception e) {
			
			LOGGER.debug("An error occured while getting the Jobe roles based on selected location" + e);
			return null;
		}
	}
	
	
	public Collection<JobOpeningsDto> getJobOpeningsusingJobRole(String jobRoleName) {
		
		try {
			LOGGER.debug("Request Received from service to get Job Opening based on Job role");
			
			Map<String, Object> parameters = new HashMap<>();
			
			parameters.put("jobRoleName", jobRoleName);
			
			
			return getJdbcTemplate().query(jobOpeningsConfig.getSelectJobswithName(), parameters, ROW_MAPPER);
		} catch (Exception e) {
			
			LOGGER.debug("An error occured while getting the Jobe roles based on selected Job role" + e);
			return null;
		}
	}
	
	


private static class JobOpeningsRowSelectRowMapper implements RowMapper<JobOpeningsDto> {

	@Override
	public JobOpeningsDto mapRow(ResultSet resultSet, int rowNum)
			throws SQLException {
		String jobId = resultSet.getString("jobId");
		String jobTitle = resultSet.getString("jobTitle");
		String organization = resultSet.getString("organization");
		String location = resultSet.getString("location");
		String ctc = resultSet.getString("ctc");
		String jobDescription = resultSet.getString("jobDescription");
		return new JobOpeningsDto(jobId,jobTitle,organization,location,ctc,jobDescription);
		
	}
		        
	}

}
