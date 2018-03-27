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
import com.sih.msde.divergents.config.PolicyGovernmentConfig;
import com.sih.msde.divergents.dto.PolicyGovernmentDto;

@Repository
public class PolicyGovernmentDao extends AbstractTransactionalDao{
	
	@Autowired
	public PolicyGovernmentConfig policyGovernmentConfig;
	
	private static final GovtPolicyRowSelectRowMapper ROW_MAPPER = new GovtPolicyRowSelectRowMapper();
	
	private static final Logger LOGGER = LoggerFactory.getLogger(JobRoleDao.class);

	public Collection<PolicyGovernmentDto> getPolicyDetails(String letter) {
		try {
			LOGGER.debug("Request Received from service to get Government Policies based on Letter selected");
			
			Map<String, Object> parameters = new HashMap<>();
			
			parameters.put("letter", letter);
			
			return getJdbcTemplate().query(policyGovernmentConfig.getselectGovPolicy(), parameters, ROW_MAPPER);
		} catch (Exception e) {
			
			LOGGER.debug("An error occured while getting the Jobe roles based on selected letter" + e);
			return null;
		}
	}
	
	private static class GovtPolicyRowSelectRowMapper implements RowMapper<PolicyGovernmentDto> {

		@Override
		public PolicyGovernmentDto mapRow(ResultSet resultSet, int rowNum)
				throws SQLException {
			String policygovId = resultSet.getString("policygovId");
			String policygovNo = resultSet.getString("policygovNo");
			String title = resultSet.getString("title");
			String policydocUrl = resultSet.getString("policydocUrl");
			return new PolicyGovernmentDto(policygovId,policygovNo,title,policydocUrl);
			
		}
			        
		}

}
