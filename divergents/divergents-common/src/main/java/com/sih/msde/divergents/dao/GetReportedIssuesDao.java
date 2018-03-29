package com.sih.msde.divergents.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.sih.msde.divergents.common.AbstractTransactionalDao;
import com.sih.msde.divergents.config.ReportIssuesConfigSql;
import com.sih.msde.divergents.dto.ReportIssuesDto;


@Repository
public class GetReportedIssuesDao extends AbstractTransactionalDao {

	@Autowired
	private ReportIssuesConfigSql reportIssuesConfigSql;
	private static final Logger LOGGER = LoggerFactory.getLogger(GetReportedIssuesDao.class);
	private static final GetReportedIssuesRowMapper ROW_MAPPER = new GetReportedIssuesRowMapper();

	public Collection<ReportIssuesDto> getSubmittedIssues(String institutionName, String institutionId)
	{
		try {
			LOGGER.debug("Request received from service to get the submitted issues");
			Map<String,Object> parameters = new HashMap<>();
			parameters.put("institutionName", institutionName);
			parameters.put("institutionId",institutionId);
			LOGGER.debug("Parameters are" + parameters);
			return getJdbcTemplate().query(reportIssuesConfigSql.getViewReportedIssues(), parameters, ROW_MAPPER);
		}
		catch(Exception e)
		{
			LOGGER.debug("An exception occured while fetching the submitted issues" +e);
			return null;
		}
	}
	

private static class GetReportedIssuesRowMapper implements RowMapper<ReportIssuesDto> {

	@Override
	public ReportIssuesDto mapRow(ResultSet resultSet, int rowNum)
			throws SQLException {
	
				
					
				String 	issueWith = resultSet.getString("issueWith");
				String 	reporteeName = resultSet.getString("reporteeName");
				String 	reporteeId = resultSet.getString("reporteeId");
				String 	institutionName = resultSet.getString("institutionName");
				String 	institutionId = resultSet.getString("institutionId");
				String 	issueType = resultSet.getString("issueType");
				String 	issueDescription = resultSet.getString("issueDescription");
				Date 	issueReportDate = resultSet.getDate("issueReportDate");
				
				return new ReportIssuesDto(issueWith,reporteeName, reporteeId, institutionName, institutionId, issueType, issueDescription, issueReportDate);
		
	}

		        
	}
	

}
