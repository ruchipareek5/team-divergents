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
import com.sih.msde.divergents.dto.GetStatesDto;

@Repository
public class GetstateFindTrainingCenterDao extends AbstractTransactionalDao{
	
	@Autowired
	public FindTrainingCenterConfig findTrainingCenterConfig;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(GetstateFindTrainingCenterDao.class);

	private static final GetStateRowSelectRowMapper ROW_MAPPER = new GetStateRowSelectRowMapper();
	
	public Collection<GetStatesDto> getallthestates() {
	
		try {
			
			LOGGER.debug("Request received to get all the states where training centers exist");
			Map<String, Object> parameters = new HashMap<>();
			
			 return getJdbcTemplate().query(findTrainingCenterConfig.getSelectSqlAllStates(), parameters, ROW_MAPPER);
		} catch (Exception e) {
			
			LOGGER.debug("An error occured while getting the states" + e);
			return null;
		}
	}


private static class GetStateRowSelectRowMapper implements RowMapper<GetStatesDto> {

	@Override
	public GetStatesDto mapRow(ResultSet resultSet, int rowNum)
			throws SQLException {
		String state = resultSet.getString("state");
		return new GetStatesDto(state);
		
	}
		        
	}
	

}
