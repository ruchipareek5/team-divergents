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
import com.sih.msde.divergents.dto.FAQCandidatesEnrolledAssessedCertifiedMonthWiseDto;


@Repository
public class FAQCandidatesEnrolledAssessedCertifiedMonthWiseDao extends AbstractTransactionalDao {

	@Autowired
	private FAQConfigSql fAQConfigSql;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(FAQCandidatesEnrolledAssessedCertifiedMonthWiseDao.class);
	
	private static final FAQCandidatesEnrolledAssessedCertifiedMonthWiseRowMapper ROW_MAPPER = new FAQCandidatesEnrolledAssessedCertifiedMonthWiseRowMapper(); 
	
	public Collection<FAQCandidatesEnrolledAssessedCertifiedMonthWiseDto> getCountTotalCandidatesEnrolledMonthWise(int year){
		LOGGER.debug("Request Received from Service");
		LOGGER.debug("In FAQCandidatesEnrolledAssessedCertifiedMonthWiseDao - getCountTotalCandidatesEnrolledMonthWise");
		LOGGER.debug("Parameters Received from Service are - 'year': " +year);
				   	
		LOGGER.debug("getting total candidates enrolled month wise");
		
		try
		{
			LOGGER.debug("Inside TRY block");
			
			LOGGER.debug("Creating HashMap object");
			Map<String, Object> parameters = new HashMap<>();
			LOGGER.debug("object created successfully");
			
			LOGGER.debug("Inserting parameters to HashMap object");
			parameters.put("year", year);
			LOGGER.debug("Parameters inserted");
			
			LOGGER.debug("Executing SQL query and returning response");
	        return getJdbcTemplate().query(fAQConfigSql.getSelectSqlCountTotalCandidatesEnrolledMonthWise(), parameters, ROW_MAPPER);
		}
		catch(Exception ex)
		{
			LOGGER.debug("Inside CATCH block");
			
			LOGGER.error("ERROR: Encountered Exception - "+ex);
			
			LOGGER.debug("Returning NULL");
			return null;
		}
	}
	
	public Collection<FAQCandidatesEnrolledAssessedCertifiedMonthWiseDto> getCountTotalCandidatesCertifiedMonthWise(int year){
		LOGGER.debug("Request Received from Service");
		LOGGER.debug("In FAQCandidatesEnrolledAssessedCertifiedMonthWiseDao - getCountTotalCandidatesCertifiedMonthWise");
		LOGGER.debug("Parameters Received from Service are - 'year': " +year);
				   	
		LOGGER.debug("getting total candidates certified month wise");
		
		try
		{
			LOGGER.debug("Inside TRY block");
			
			LOGGER.debug("Creating HashMap object");
			Map<String, Object> parameters = new HashMap<>();
			LOGGER.debug("object created successfully");
			
			LOGGER.debug("Inserting parameters to HashMap object");
			parameters.put("year", year);
			LOGGER.debug("Parameters inserted");
			
			LOGGER.debug("Executing SQL query and returning response");
	        return getJdbcTemplate().query(fAQConfigSql.getSelectSqlCountTotalCandidatesCertifiedMonthWise(), parameters, ROW_MAPPER);
		}
		catch(Exception ex)
		{
			LOGGER.debug("Inside CATCH block");
			
			LOGGER.error("ERROR: Encountered Exception - "+ex);
			
			LOGGER.debug("Returning NULL");
			return null;
		}
		
	}
	
	public Collection<FAQCandidatesEnrolledAssessedCertifiedMonthWiseDto> getCountTotalCandidatesAssessedMonthWise(int year){
		LOGGER.debug("Request Received from Service");
		LOGGER.debug("In FAQCandidatesEnrolledAssessedCertifiedMonthWiseDao - getCountTotalCandidatesAssessedMonthWise");
		LOGGER.debug("Parameters Received from Service are - 'year': " +year);
				   	
		LOGGER.debug("getting total candidates assessed month wise");
		
		try
		{
			LOGGER.debug("Inside TRY block");
			
			LOGGER.debug("Creating HashMap object");
			Map<String, Object> parameters = new HashMap<>();
			LOGGER.debug("object created successfully");
			
			LOGGER.debug("Inserting parameters to HashMap object");
			parameters.put("year", year);
			LOGGER.debug("Parameters inserted");
			
			LOGGER.debug("Executing SQL query and returning response");
	        return getJdbcTemplate().query(fAQConfigSql.getSelectSqlCountTotalCandidatesAssessedMonthWise(), parameters, ROW_MAPPER);
		}
		catch(Exception e)
		{
			LOGGER.debug("Inside CATCH block");
			
			LOGGER.error("ERROR: Encountered Exception - "+e);
			
			LOGGER.debug("Returning NULL");
			return null;
			
		}
		
	}
	
	public Collection<FAQCandidatesEnrolledAssessedCertifiedMonthWiseDto> getCountTotalCandidatesEnrolledMonthAndSchemeWise(int year,String batchType) {
		LOGGER.debug("Request Received from Service");
		LOGGER.debug("In FAQCandidatesEnrolledAssessedCertifiedMonthWiseDao - getCountTotalCandidatesEnrolledMonthAndSchemeWise");
		LOGGER.debug("Parameters Received from Service are - 'year': " +year+" 'batchType': "+batchType);
				   	
		LOGGER.debug("getting total candidates enrolled month wise and scheme wise");
		
		try
		{
			LOGGER.debug("Inside TRY block");
			
			LOGGER.debug("Creating HashMap object");
			Map<String, Object> parameters = new HashMap<>();
			LOGGER.debug("object created successfully");
			
			LOGGER.debug("Inserting parameters to HashMap object");
			parameters.put("year", year);
			parameters.put("batchType", batchType);
			LOGGER.debug("Parameters inserted");
			
			LOGGER.debug("Executing SQL query and returning response");
	        return getJdbcTemplate().query(fAQConfigSql.getSelectSqlCountTotalCandidatesEnrolledMonthAndSchemeWise(), parameters, ROW_MAPPER);
		}
		catch(Exception ex)
		{
			LOGGER.debug("Inside CATCH block");
			
			LOGGER.error("ERROR: Encountered Exception - "+ex);
			
			LOGGER.debug("Returning NULL");
			return null;
		}
	}
	
	public Collection<FAQCandidatesEnrolledAssessedCertifiedMonthWiseDto> getCountTotalCandidatesAssessedMonthAndSchemeWise(int year,String batchType) {
		LOGGER.debug("Request Received from Service");
		LOGGER.debug("In FAQCandidatesEnrolledAssessedCertifiedMonthWiseDao - getCountTotalCandidatesAssessedMonthAndSchemeWise");
		LOGGER.debug("Parameters Received from Service are - 'year': " +year+" 'batchType': "+batchType);
				   	
		LOGGER.debug("getting total candidates assessed month wise and scheme wise");
		
		try
		{
			LOGGER.debug("Inside TRY block");
			
			LOGGER.debug("Creating HashMap object");
			Map<String, Object> parameters = new HashMap<>();
			LOGGER.debug("object created successfully");
			
			LOGGER.debug("Inserting parameters to HashMap object");
			parameters.put("year", year);
			parameters.put("batchType", batchType);
			LOGGER.debug("Parameters inserted");
			
			LOGGER.debug("Executing SQL query and returning response");
	        return getJdbcTemplate().query(fAQConfigSql.getSelectSqlCountTotalCandidatesAssessedMonthAndSchemeWise(), parameters, ROW_MAPPER);
		}
		catch(Exception ex)
		{
			LOGGER.debug("Inside CATCH block");
			
			LOGGER.error("ERROR: Encountered Exception - "+ex);
			
			LOGGER.debug("Returning NULL");
			return null;
		}
	}
	
	public Collection<FAQCandidatesEnrolledAssessedCertifiedMonthWiseDto> getCountTotalCandidatesCertifiedMonthAndSchemeWise(int year,String batchType) {
		LOGGER.debug("Request Received from Service");
		LOGGER.debug("In FAQCandidatesEnrolledAssessedCertifiedMonthWiseDao - getCountTotalCandidatesCertifiedMonthAndSchemeWise");
		LOGGER.debug("Parameters Received from Service are - 'year': " +year+" 'batchType': "+batchType);
				   	
		LOGGER.debug("getting total candidates certified month wise and scheme wise");
		
		try
		{
			LOGGER.debug("Inside TRY block");
			
			LOGGER.debug("Creating HashMap object");
			Map<String, Object> parameters = new HashMap<>();
			LOGGER.debug("object created successfully");
			
			LOGGER.debug("Inserting parameters to HashMap object");
			parameters.put("year", year);
			parameters.put("batchType", batchType);
			LOGGER.debug("Parameters inserted");
			
			LOGGER.debug("Executing SQL query and returning response");
	        return getJdbcTemplate().query(fAQConfigSql.getSelectSqlCountTotalCandidatesCertifiedMonthAndSchemeWise(), parameters, ROW_MAPPER);
		}
		catch(Exception ex)
		{
			LOGGER.debug("Inside CATCH block");
			
			LOGGER.error("ERROR: Encountered Exception - "+ex);
			
			LOGGER.debug("Returning NULL");
			return null;
		}
	}
	
	private static class FAQCandidatesEnrolledAssessedCertifiedMonthWiseRowMapper implements RowMapper<FAQCandidatesEnrolledAssessedCertifiedMonthWiseDto> {

		@Override
		public FAQCandidatesEnrolledAssessedCertifiedMonthWiseDto mapRow(
				ResultSet rs, int rowNum) throws SQLException {
			
			String month = rs.getString("MONTHS");
			Integer numberOfCandidates = rs.getInt("CANDIDATES");
			
			return new FAQCandidatesEnrolledAssessedCertifiedMonthWiseDto(month, numberOfCandidates);
		}
	}
}
