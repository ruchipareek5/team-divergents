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
import com.sih.msde.divergents.config.IndustryDashboardConfigSql;
import com.sih.msde.divergents.dto.TopFiveCorporatesWithMaxCsrContributionsDto;

@Repository

public class TopFiveCorporatesWithMaxCsrContributions extends AbstractTransactionalDao {

	private static final Logger LOGGER = LoggerFactory.getLogger(TopFiveCorporatesWithMaxCsrContributions.class);
	private static final TopFiveCorporatesWithMaxCsrContributionsRowMapper ROW_MAPPER = new TopFiveCorporatesWithMaxCsrContributionsRowMapper(); 
	@Autowired
	private IndustryDashboardConfigSql industryDashboardConfigSql;
	
	public Collection<TopFiveCorporatesWithMaxCsrContributionsDto> getTopFiveCorporates()
	{
		try {
		 
		   LOGGER.debug("Received request from service to get top 5 corporates with maximum csr contributions");
		   Map<String,Object> parameters = new HashMap<>();
		   return getJdbcTemplate().query(industryDashboardConfigSql.getTopFiveCorporatesWithMaxCsrContributions(), parameters, ROW_MAPPER);
		   }
		catch(Exception e)
		{
			LOGGER.debug("An exception was caught while fetching top five corporates with maximum csr contributions" +e);
			return null;
		}
		
		}
	
	private static class TopFiveCorporatesWithMaxCsrContributionsRowMapper implements RowMapper<TopFiveCorporatesWithMaxCsrContributionsDto>
	{
		@Override
		public TopFiveCorporatesWithMaxCsrContributionsDto mapRow(ResultSet resultSet,int rowNum) throws SQLException
		{
			String organisationName = resultSet.getString("organisationName");
			long csrFunds = resultSet.getLong("totalCsrFunds");
			return new TopFiveCorporatesWithMaxCsrContributionsDto(organisationName, csrFunds);
			
		}
	}
}

