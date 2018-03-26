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
import com.sih.msde.divergents.config.RelevantDocumentsTpConfig;
import com.sih.msde.divergents.dto.RelevantDocumentsTpDto;

@Repository
public class RelevantDocumentsTpDao extends AbstractTransactionalDao{


	@Autowired
	public RelevantDocumentsTpConfig relevantDocumentsTpConfig;	
	

	private static final RelevantDocRowSelectRowMapper ROW_MAPPER = new RelevantDocRowSelectRowMapper();
	
	private static final Logger LOGGER = LoggerFactory.getLogger(RelevantDocumentsTpDao.class);
	
	public Collection<RelevantDocumentsTpDto> getRelevantDocumentsTpDetails(String letter) {
	
		try {
			LOGGER.debug("Request Received from service to get Policies based on Letter selected");
			
			Map<String, Object> parameters = new HashMap<>();
			
			parameters.put("letter", letter);
			
			return getJdbcTemplate().query(relevantDocumentsTpConfig.getselectDocument(), parameters, ROW_MAPPER);
		} catch (Exception e) {
			
			LOGGER.debug("An error occured while getting the Policies based on selected letter" + e);
			return null;
		}
	}


private static class RelevantDocRowSelectRowMapper implements RowMapper<RelevantDocumentsTpDto> {

	@Override
	public RelevantDocumentsTpDto mapRow(ResultSet resultSet, int rowNum)
			throws SQLException {
		String policyId = resultSet.getString("policyId");
		String policyNo = resultSet.getString("policyNo");
		String title = resultSet.getString("title");
		String policyDocUrl = resultSet.getString("policyDocUrl");
		return new RelevantDocumentsTpDto(policyId,policyNo,title,policyDocUrl);
		
	}
		        
	}

}
