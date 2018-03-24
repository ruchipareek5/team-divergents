package com.sih.msde.divergents.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sih.msde.divergents.common.AbstractTransactionalDao;
import com.sih.msde.divergents.config.FindTrainingCenterConfig;
import com.sih.msde.divergents.dto.FindSpecifiedTrainingCenterDto;


import org.springframework.jdbc.core.RowMapper;



@Repository
public class FindTrainingCenterDao extends AbstractTransactionalDao{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(FindTrainingCenterDao.class);
	
	@Autowired
	public FindTrainingCenterConfig findTrainingCenterConfig;	
	

	private static final FindTrainingCenterRowSelectRowMapper ROW_MAPPER = new FindTrainingCenterRowSelectRowMapper();
	
	public Collection<FindSpecifiedTrainingCenterDto> getTrainingCenterwithSpecifiedDetails(String state, String district, String block, String ssc, String jobrole) {
	
		Map<String, Object> parameters = new HashMap<>();
		
		parameters.put("state", state);
		parameters.put("district", district);
		parameters.put("block", block);
		parameters.put("ssc", ssc);
		parameters.put("jobrole", jobrole);
		
        return getJdbcTemplate().query(findTrainingCenterConfig.getSelectSqlSpecfiedTrainingCenter1(), parameters, ROW_MAPPER);
	}


private static class FindTrainingCenterRowSelectRowMapper implements RowMapper<FindSpecifiedTrainingCenterDto> {

	@Override
	public FindSpecifiedTrainingCenterDto mapRow(ResultSet resultSet, int rowNum)
			throws SQLException {
		String trainingCenterName = resultSet.getString("centreName");
		String address = resultSet.getString("centreAddress");
		String contactNumber = resultSet.getString("contact");
		return new FindSpecifiedTrainingCenterDto(trainingCenterName, address, contactNumber);
		
	}
		        
	}
	
}