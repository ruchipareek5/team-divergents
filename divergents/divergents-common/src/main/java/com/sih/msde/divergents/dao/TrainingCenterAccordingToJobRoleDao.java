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
import com.sih.msde.divergents.dto.TrainingCenterAccordingToJobRoleDto;

@Repository
public class TrainingCenterAccordingToJobRoleDao extends AbstractTransactionalDao{
	
	@Autowired
	public JobRoleConfig jobRoleConfig;	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TrainingCenterAccordingToJobRoleDao.class);
	
	private static final TrainingCenterAccordingToJobRoleSelectRowMapper ROW_MAPPER = new TrainingCenterAccordingToJobRoleSelectRowMapper();
	
	public Collection<TrainingCenterAccordingToJobRoleDto> getTrainingCentreDetails(String jobRoleId) {
	
		try {
			
			LOGGER.debug("Request received from service to get the details of training centres corresponding to the Job Role");
			
			Map<String, Object> parameters = new HashMap<>();
			
			parameters.put("jobRoleId", jobRoleId);
			
			return getJdbcTemplate().query(jobRoleConfig.getTrainingcentreforJobRole(), parameters, ROW_MAPPER);
		} catch (Exception e) {
			LOGGER.debug("An error occurd while getting the details of training centres corresponding to the Job Role" + e);
			return null;
			
		}
		
	}


private static class TrainingCenterAccordingToJobRoleSelectRowMapper implements RowMapper<TrainingCenterAccordingToJobRoleDto> {

	@Override
	public TrainingCenterAccordingToJobRoleDto mapRow(ResultSet resultSet, int rowNum)
			throws SQLException {
		String centreName = resultSet.getString("centreName");
		String state = resultSet.getString("state");
		return new TrainingCenterAccordingToJobRoleDto(centreName, state);
		
	}
		        
	}

}
