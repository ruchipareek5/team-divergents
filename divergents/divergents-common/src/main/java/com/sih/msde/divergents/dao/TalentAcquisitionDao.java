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
import com.sih.msde.divergents.config.TalentAcquisitionConfig;
import com.sih.msde.divergents.dto.TalentAcquisitionDto;

@Repository
public class TalentAcquisitionDao extends AbstractTransactionalDao{
	
	@Autowired
	public TalentAcquisitionConfig talentAcquisitionConfig;
	
	private static final TalentAcquisitionRowSelectRowMapper ROW_MAPPER = new TalentAcquisitionRowSelectRowMapper();
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TalentAcquisitionDao.class);
	
	public Collection<TalentAcquisitionDto> getCandidateDetailsaccordingtoJobRole(String jobRoleName) {
	
		try {
			LOGGER.debug("Request Received from service to get candidates based on job Role name entered");
			
			Map<String, Object> parameters = new HashMap<>();
			
			parameters.put("jobRoleName", jobRoleName);
			
			return getJdbcTemplate().query(talentAcquisitionConfig.getSelectCandidateAccordingtoJobrole(), parameters, ROW_MAPPER);
		} catch (Exception e) {
			
			LOGGER.debug("An error occured while getting the candidates based on job Role name entered" + e);
			return null;
		}
	}


private static class TalentAcquisitionRowSelectRowMapper implements RowMapper<TalentAcquisitionDto> {

	@Override
	public TalentAcquisitionDto mapRow(ResultSet resultSet, int rowNum)
			throws SQLException {
		String candidateDetailsId = resultSet.getString("candidateDetailsId");
		String candidateName = resultSet.getString("candidateName");
		String candidateAge = resultSet.getString("candidateAge");
		String candidateLocation = resultSet.getString("candidateLocation");
		String candidateMail = resultSet.getString("emailId");
		return new TalentAcquisitionDto(candidateDetailsId,candidateName,candidateAge,candidateLocation,candidateMail);
		
		
	}
		        
	}

	

}
