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

import com.sih.msde.divergents.dto.GetJobRoleDto;


@Repository
public class GetJobRoleFindTrainingCenterDao extends AbstractTransactionalDao{

	@Autowired
	public FindTrainingCenterConfig findTrainingCenterConfig;	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(GetJobRoleFindTrainingCenterDao.class);

	private static final GetJobRoleRowSelectRowMapper ROW_MAPPER = new GetJobRoleRowSelectRowMapper();
	
	public Collection<GetJobRoleDto> getallthejobroles() {
	
		try {
			Map<String, Object> parameters = new HashMap<>();
			
			LOGGER.debug("Request Received from the service to get all the job roles");
			
			 return getJdbcTemplate().query(findTrainingCenterConfig.getSelectSqlAllJobrole(), parameters, ROW_MAPPER);
		} catch (Exception e) {
			LOGGER.debug("An error occured while getting the Job Roles " + e);
			return null;
		}
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
