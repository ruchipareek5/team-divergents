package com.sih.msde.divergents.dao;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sih.msde.divergents.common.AbstractTransactionalDao;
import com.sih.msde.divergents.config.ReportIssuesConfigSql;
import com.sih.msde.divergents.dto.ReportIssuesDto;

@Repository
public class ReportIssuesDao extends AbstractTransactionalDao{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ReportIssuesDao.class);
	@Autowired
	private ReportIssuesConfigSql reportIssuesConfigSql;
	
	
	public Integer submitReportedIssue(ReportIssuesDto reportIssuesDto) {
		Integer issueSubmitStatus=-5;
		
		try {
			LOGGER.debug("Request received in DAO from service to submit reported issue from front end");
			Map<String,Object> issueDetails = new HashMap<>();
			issueDetails.put("issueWith", reportIssuesDto.getIssueWith());
			issueDetails.put("reporteeName", reportIssuesDto.getReporteeName());
			issueDetails.put("reporteeId", reportIssuesDto.getReporteeId());
			issueDetails.put("institutionName",  reportIssuesDto.getInstitutionName());
			issueDetails.put("institutionId", reportIssuesDto.getInstitutionId());
			issueDetails.put("issueType", reportIssuesDto.getIssueType());
			issueDetails.put("issueDescription", reportIssuesDto.getIssueDescription());
			
			issueSubmitStatus = getJdbcTemplate().update(reportIssuesConfigSql.getInsertReportedIssues(),issueDetails);
			return issueSubmitStatus;
		}
		catch(Exception e){
			
			LOGGER.debug("An exception occured while inserting records into the database" +e);
			LOGGER.debug("ERROR! , Returning the default value of issueSubmitStatus back to the service");
			return issueSubmitStatus;	
		}
	}
}
