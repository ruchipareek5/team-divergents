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
import com.sih.msde.divergents.dto.FindSpecifiedTrainingCenterDto;
import com.sih.msde.divergents.dto.PlacementPercentageOfTopFiveTpDto;

@Repository
public class PlacementPercentageOfTopFiveTp extends AbstractTransactionalDao{

	@Autowired
    private IndustryDashboardConfigSql industryDashboardConfigSql;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PlacementPercentageOfTopFiveTp.class);
	private static final PlacementPercentageOfTopFiveTpRowMapper ROW_MAPPER = new PlacementPercentageOfTopFiveTpRowMapper();
	
	

	public Collection<PlacementPercentageOfTopFiveTpDto> getPlacementPercentageOfTopFiveTp() {
		// TODO Auto-generated method stub
		try {
			LOGGER.debug("Request received from service to get top 5 training partners");
			Map<String,Object> parameters = new HashMap<>();
			return getJdbcTemplate().query(industryDashboardConfigSql.gettopFiveTrainingPartnersWithMaximumPlacementsAccordingToJobRole() ,parameters, ROW_MAPPER);
		}
		catch(Exception e) {
			return null;	
		}
		
	}
	
	private static class PlacementPercentageOfTopFiveTpRowMapper implements RowMapper<PlacementPercentageOfTopFiveTpDto> {

		@Override
		public PlacementPercentageOfTopFiveTpDto mapRow(ResultSet resultSet, int rowNum)throws SQLException {
			
			String trainingPartnerName = resultSet.getString("trainingPartnerName");
			long totalPlacements = resultSet.getLong("totalPlacements");
			return new PlacementPercentageOfTopFiveTpDto(trainingPartnerName,totalPlacements);
		}
			        
		}
}
