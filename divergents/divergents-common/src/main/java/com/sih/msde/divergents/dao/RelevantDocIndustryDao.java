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
import com.sih.msde.divergents.config.RelevantDocIndustryConfig;
import com.sih.msde.divergents.dto.RelevantDocIndustryDto;

@Repository
public class RelevantDocIndustryDao extends AbstractTransactionalDao{


	@Autowired
	public RelevantDocIndustryConfig relevantDocIndustryConfig;	
	

	private static final RelevantDocRowSelectRowMapper ROW_MAPPER = new RelevantDocRowSelectRowMapper();
	
	private static final Logger LOGGER = LoggerFactory.getLogger(RelevantDocIndustryDao.class);
	
	public Collection<RelevantDocIndustryDto> getRelevantDocIndustryDetails(String letter) {
	
		try {
			LOGGER.debug("Request Received from service to get Policies based on Letter selected");
			
			Map<String, Object> parameters = new HashMap<>();
			
			parameters.put("letter", letter);
			
			return getJdbcTemplate().query(relevantDocIndustryConfig.getselectDocPolicy(), parameters, ROW_MAPPER);
		} catch (Exception e) {
			
			LOGGER.debug("An error occured while getting the Policies based on selected letter" + e);
			return null;
		}
	}


private static class RelevantDocRowSelectRowMapper implements RowMapper<RelevantDocIndustryDto> {

	@Override
	public RelevantDocIndustryDto mapRow(ResultSet resultSet, int rowNum)
			throws SQLException {
		String documentId = resultSet.getString("documentId");
		String documentNo = resultSet.getString("documentNo");
		String title = resultSet.getString("title");
		String documentUrl = resultSet.getString("documentUrl");
		return new RelevantDocIndustryDto(documentId,documentNo,title,documentUrl);
		
	}
		        
	}

}
