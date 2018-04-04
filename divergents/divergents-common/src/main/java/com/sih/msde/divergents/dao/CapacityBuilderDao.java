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
import com.sih.msde.divergents.config.CapacityBuilderConfig;
import com.sih.msde.divergents.dto.CapacityBuilderDto;

@Repository
public class CapacityBuilderDao extends AbstractTransactionalDao{
	
	@Autowired
	private CapacityBuilderConfig capacityBuilderConfig;
	
	private static final CapacityBuilderRowSelectRowMapper ROW_MAPPER = new CapacityBuilderRowSelectRowMapper();
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CapacityBuilderDao.class);
	
	public Collection<CapacityBuilderDto> getTrainingForTrainingPartner() {
	
		try {
			LOGGER.debug("Request Received from service to get training detail for training partner");
			
			Map<String, Object> parameters = new HashMap<>();
			
			return getJdbcTemplate().query(capacityBuilderConfig.getTrainingsfortrainingpartner(), parameters, ROW_MAPPER);
		} catch (Exception e) {
			
			LOGGER.debug("An error occured while getting the training detail for training partner" + e);
			return null;
		}
	}
	
	
	public Collection<CapacityBuilderDto> getTrainingForAssessmentBody() {
		
		try {
			LOGGER.debug("Request Received from service to get training detail for Assessment Body");
			
			Map<String, Object> parameters = new HashMap<>();
			
			return getJdbcTemplate().query(capacityBuilderConfig.getTrainingsforassessmentbody(), parameters, ROW_MAPPER);
		} catch (Exception e) {
			
			LOGGER.debug("An error occured while getting the training detail for Assessment Body" + e);
			return null;
		}
	}


	


private static class CapacityBuilderRowSelectRowMapper implements RowMapper<CapacityBuilderDto> {

	@Override
	public CapacityBuilderDto mapRow(ResultSet resultSet, int rowNum)
			throws SQLException {
		String trainingid = resultSet.getString("trainingid");
		String trainingtitle = resultSet.getString("trainingtitle");
		String ssc = resultSet.getString("ssc");
		String startdate = resultSet.getString("startdate");
		String enddate = resultSet.getString("enddate");
		String curriculum = resultSet.getString("curriculum");
		return new CapacityBuilderDto(trainingid, trainingtitle, ssc,startdate, enddate, curriculum);

		
	}
		        
	}



}
