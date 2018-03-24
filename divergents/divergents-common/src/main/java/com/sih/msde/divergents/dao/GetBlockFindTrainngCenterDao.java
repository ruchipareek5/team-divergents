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

import com.sih.msde.divergents.dto.GetBlockDto;

@Repository
public class GetBlockFindTrainngCenterDao extends AbstractTransactionalDao{
	
	@Autowired
	public FindTrainingCenterConfig findTrainingCenterConfig;	
	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(GetBlockFindTrainngCenterDao.class);
	
	private static final GetBlockRowSelectRowMapper ROW_MAPPER = new GetBlockRowSelectRowMapper();
	
	public Collection<GetBlockDto> getalltheblocks() {
	
	try {
			LOGGER.debug("Request Received from Service to get all the bloacks where Training Centers exist");
			Map<String, Object> parameters = new HashMap<>();
			return getJdbcTemplate().query(findTrainingCenterConfig.getSelectSqlAllBlock(), parameters, ROW_MAPPER);
		
		} catch (Exception e) {

			LOGGER.debug("An error occured while getting the blocks" + e);
			return null;
		}
	}


private static class GetBlockRowSelectRowMapper implements RowMapper<GetBlockDto> {

	@Override
	public GetBlockDto mapRow(ResultSet resultSet, int rowNum)
			throws SQLException {
		String block = resultSet.getString("block");
		return new GetBlockDto(block);
		
	}
		        
	}
	

}
