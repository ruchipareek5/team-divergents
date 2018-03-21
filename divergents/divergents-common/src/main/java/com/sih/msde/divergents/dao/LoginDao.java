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
import com.sih.msde.divergents.config.LoginConfigSql;
import com.sih.msde.divergents.dto.LoginDto;

@Repository
public class LoginDao extends AbstractTransactionalDao {
	
	private static final LoginRowSelectRow ROW_MAPPER = new LoginRowSelectRow();
	@Autowired
	private LoginConfigSql loginConfigSql;

	private static final Logger LOGGER = LoggerFactory.getLogger(LoginDao.class);

	public Integer userExistsStatus(String userId, String password) {
		LOGGER.debug("Request received from Service");
		LOGGER.debug("Checking existence of user with userId: " + userId);
		Map<String,Object> parameters = new HashMap<>();
		parameters.put("userId", userId);
		parameters.put("password", password);
		LOGGER.debug("Parameters inserted into hashmap");
	   
		return getJdbcTemplate().queryForObject(loginConfigSql.getCheckUserSql(),parameters,Integer.class);
	}
	
	public  Collection<LoginDto> getUserDetails(String userId, String password) {
		// TODO Auto-generated method stub
		LOGGER.debug("In method getUserDetails to get user details for user with userId:" +userId);
		Map<String,Object> userCredentials = new HashMap<>();
		userCredentials.put("userId", userId);
		userCredentials.put("password", password);
		LOGGER.debug("Arguments inserted into hashmap for getting user details with userId: " +userId);
		
		return getJdbcTemplate().query(loginConfigSql.getSelectUserDetails(),userCredentials,ROW_MAPPER);
	}

	private static class LoginRowSelectRow implements RowMapper<LoginDto> {

		@Override
		public LoginDto mapRow(ResultSet resultSet, int rowNum)
				throws SQLException {
			        String userId = resultSet.getString("userId");
					String userRole = resultSet.getString("userRole");
					String userStatus = resultSet.getString("userStatus");
					String sPOCName = resultSet.getString("sPOCName");
					
					return new LoginDto(userId,userRole,userStatus,sPOCName);
		}
	}

}
