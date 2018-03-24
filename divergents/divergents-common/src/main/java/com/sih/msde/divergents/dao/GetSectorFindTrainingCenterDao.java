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

import com.sih.msde.divergents.dto.GetSectorDto;

@Repository
public class GetSectorFindTrainingCenterDao extends AbstractTransactionalDao{
	
	@Autowired
	public FindTrainingCenterConfig findTrainingCenterConfig;	

	private static final GetSectorRowSelectRowMapper ROW_MAPPER = new GetSectorRowSelectRowMapper();
	
	public Collection<GetSectorDto> getallthesectors() {
	
		Map<String, Object> parameters = new HashMap<>();
		
         return getJdbcTemplate().query(findTrainingCenterConfig.getSelectSqlAllSector(), parameters, ROW_MAPPER);
	}


private static class GetSectorRowSelectRowMapper implements RowMapper<GetSectorDto> {

	@Override
	public GetSectorDto mapRow(ResultSet resultSet, int rowNum)
			throws SQLException {
		String sector = resultSet.getString("ssc");
		return new GetSectorDto(sector);
		
	}
		        
	}

}
