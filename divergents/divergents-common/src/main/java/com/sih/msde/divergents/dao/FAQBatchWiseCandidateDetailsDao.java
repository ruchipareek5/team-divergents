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
import com.sih.msde.divergents.config.FAQConfigSql;
import com.sih.msde.divergents.dto.FAQBatchWiseCandidateDetailsDto;


@Repository
public class FAQBatchWiseCandidateDetailsDao extends AbstractTransactionalDao {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(FAQBatchWiseCandidateDetailsDao.class);
	
	@Autowired
	private FAQConfigSql fAQConfigSql;
	
	private static BatchWiseCandidateDetailsDaoRowMapper ROW_MAPPER = new BatchWiseCandidateDetailsDaoRowMapper(); 
	
	public Collection<FAQBatchWiseCandidateDetailsDto> getBatchWiseCandidatesDetails(Integer batchId) {
		LOGGER.debug("Request Received from Service");
		LOGGER.debug("In FAQBatchWiseCandidateDetailsDao - getBatchWiseCandidatesDetails");
		LOGGER.debug("Parameters Received from Service are - 'batchId': " +batchId);
				   	
		LOGGER.debug("getting candidate details of a particular batch");
		
		LOGGER.debug("Creating HashMap object");
		Map<String, Object> parameters = new HashMap<>();
		LOGGER.debug("object created successfully");
		
		LOGGER.debug("Inserting parameters to HashMap object");
		parameters.put("batchId", batchId);
		LOGGER.debug("Parameters inserted");
		
		LOGGER.debug("Executing SQL query and returning response");
		return getJdbcTemplate().query(fAQConfigSql.getSelectSqlBatchWiseCandidatesDetails(), parameters,ROW_MAPPER);
	}

	private static class BatchWiseCandidateDetailsDaoRowMapper implements RowMapper<FAQBatchWiseCandidateDetailsDto> {

		@Override
		public FAQBatchWiseCandidateDetailsDto mapRow(ResultSet rs, int rowNum)
				throws SQLException {

			String candidateName = rs.getString("candidateName");
			String mobileNumber =rs.getString("mobileNumber");
			String eMailId = rs.getString("emailId");
			String traineeAddress = rs.getString("traineeAddress");
			String trainingPartnerName = rs.getString("trainingPartnerName");
			Integer batchId = rs.getInt("batchId");
			String batchStartDate = rs.getString("batchStartDate");
			String batchEndDate = rs.getString("batchEndDate");

			return new FAQBatchWiseCandidateDetailsDto(candidateName, mobileNumber, eMailId, traineeAddress, trainingPartnerName, batchId, batchStartDate, batchEndDate);
		}
		
		
	}
}
