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
import com.sih.msde.divergents.config.TrainingMaterialConfig;
import com.sih.msde.divergents.dto.TrainingMaterialDto;

@Repository
public class TrainingMaterialDao extends AbstractTransactionalDao{
	
	@Autowired
	public TrainingMaterialConfig trainingMaterialConfig;
	
private static final TrainingMaterialRowSelectRowMapper ROW_MAPPER = new TrainingMaterialRowSelectRowMapper();
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TalentAcquisitionDao.class);
	
	public Collection<TrainingMaterialDto> getTrainingMaterialusingJobRole(String jobRoleName) {
	
		try {
			LOGGER.debug("Request Received from service to get material based on job Role name entered");
			
			Map<String, Object> parameters = new HashMap<>();
			
			parameters.put("jobRoleName", jobRoleName);
			
			return getJdbcTemplate().query(trainingMaterialConfig.getSelectTrainingMaterial(), parameters, ROW_MAPPER);
		} catch (Exception e) {
			
			LOGGER.debug("An error occured while getting the material based on job Role name entered" + e);
			return null;
		}
	}

	
	public Collection<TrainingMaterialDto> getAllTrainingMaterial() {
		
		try {
			LOGGER.debug("Request Received from service to get all material");
			
			Map<String, Object> parameters = new HashMap<>();
			
			return getJdbcTemplate().query(trainingMaterialConfig.getSelectAllTrainingMaterial(), parameters, ROW_MAPPER);
		} catch (Exception e) {
			
			LOGGER.debug("An error occured while getting all the material " + e);
			return null;
		}
	}


private static class TrainingMaterialRowSelectRowMapper implements RowMapper<TrainingMaterialDto> {

	@Override
	public TrainingMaterialDto mapRow(ResultSet resultSet, int rowNum)
			throws SQLException {
		String trainingmaterialid = resultSet.getString("trainingmaterialid");
		String trainingtitle = resultSet.getString("trainingtitle");
		String trainingmaterialurl = resultSet.getString("trainingmaterialurl");
		return new TrainingMaterialDto(trainingmaterialid,trainingtitle,trainingmaterialurl);
		
		
	}
		        
	}


}
