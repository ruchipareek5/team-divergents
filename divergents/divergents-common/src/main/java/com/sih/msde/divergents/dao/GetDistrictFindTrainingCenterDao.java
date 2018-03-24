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
import com.sih.msde.divergents.config.FindTrainingCenterConfig;

import com.sih.msde.divergents.dto.GetDistrictsDto;

@Repository
public class GetDistrictFindTrainingCenterDao extends AbstractTransactionalDao{
	
		
	@Autowired
	public FindTrainingCenterConfig findTrainingCenterConfig;	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(GetDistrictFindTrainingCenterDao.class);

	private static final GetDistrictRowSelectRowMapper ROW_MAPPER = new GetDistrictRowSelectRowMapper();
	
	public Collection<GetDistrictsDto> getallthedistricts() {
	
		try {
			
		LOGGER.debug("Request Received from service to get all the districts");
			Map<String, Object> parameters = new HashMap<>();
			
			 return getJdbcTemplate().query(findTrainingCenterConfig.getSelectSqlAllDistrict(), parameters, ROW_MAPPER);
		} catch (Exception e) {
			LOGGER.debug("An error occured while getting all the districts" + e);
			return null;
		}
	}


private static class GetDistrictRowSelectRowMapper implements RowMapper<GetDistrictsDto> {

	@Override
	public GetDistrictsDto mapRow(ResultSet resultSet, int rowNum)
			throws SQLException {
		String district = resultSet.getString("district");
		return new GetDistrictsDto(district);
		
	}
		        
	}
	



}
