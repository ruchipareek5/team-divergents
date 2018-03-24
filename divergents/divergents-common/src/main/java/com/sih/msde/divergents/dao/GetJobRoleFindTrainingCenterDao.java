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

import com.sih.msde.divergents.dto.GetJobRoleDto;
import com.sih.msde.divergents.dto.GetSectorDto;

@Repository
public class GetJobRoleFindTrainingCenterDao extends AbstractTransactionalDao{

	@Autowired
	public FindTrainingCenterConfig findTrainingCenterConfig;	

	private static final GetJobRoleRowSelectRowMapper ROW_MAPPER = new GetJobRoleRowSelectRowMapper();
	
	public Collection<GetJobRoleDto> getallthejobroles() {
	
		Map<String, Object> parameters = new HashMap<>();
		
         return getJdbcTemplate().query(findTrainingCenterConfig.getSelectSqlAllJobrole(), parameters, ROW_MAPPER);
	}


private static class GetJobRoleRowSelectRowMapper implements RowMapper<GetJobRoleDto> {

	@Override
	public GetJobRoleDto mapRow(ResultSet resultSet, int rowNum)
			throws SQLException {
		String jobrolename = resultSet.getString("jobRoleName");
		return new GetJobRoleDto(jobrolename);
		
	}
		        
	}

	
}
