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
import com.sih.msde.divergents.config.ReportGovernmentConfig;
import com.sih.msde.divergents.dto.ReportGovernmentDto;

@Repository
public class ReportGovernmentDao extends AbstractTransactionalDao{
	
	@Autowired
	public ReportGovernmentConfig reportGovernmentConfig;
	
	private static final GovReportRowSelectRowMapper ROW_MAPPER = new GovReportRowSelectRowMapper();
	
private static final Logger LOGGER = LoggerFactory.getLogger(JobRoleDao.class);
	
	public Collection<ReportGovernmentDto> getGovReportDetails(String letter) {
	
		try {
			LOGGER.debug("Request Received from service to get Reports based on Letter selected");
			
			Map<String, Object> parameters = new HashMap<>();
			
			parameters.put("letter", letter);
			
			return getJdbcTemplate().query(reportGovernmentConfig.getselectGovReport(), parameters, ROW_MAPPER);
		} catch (Exception e) {
			
			LOGGER.debug("An error occured while getting the Reports based on selected letter" + e);
			return null;
		}
	}

private static class GovReportRowSelectRowMapper implements RowMapper<ReportGovernmentDto> {

	@Override
	public ReportGovernmentDto mapRow(ResultSet resultSet, int rowNum)
			throws SQLException {
		String reportgovId = resultSet.getString("reportgovId");
		String reportgovNo = resultSet.getString("reportgovNo");
		String title = resultSet.getString("title");
		String reportdocUrl = resultSet.getString("reportdocUrl");
		return new ReportGovernmentDto(reportgovId,reportgovNo,title,reportdocUrl);
		
	}
		        
	}
}
