package com.sih.msde.divergents.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

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

	private static final GetStateRowSelectRowMapper ROW_MAPPER = new GetStateRowSelectRowMapper();
	
	public Collection<GetStatesDto> getallthestates() {
	
		Map<String, Object> parameters = new HashMap<>();
		
         return getJdbcTemplate().query(findTrainingCenterConfig.getSelectSqlAllStates(), parameters, ROW_MAPPER);
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
