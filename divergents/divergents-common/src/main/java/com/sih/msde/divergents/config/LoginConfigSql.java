package com.sih.msde.divergents.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="login",locations="classpath:sql/login.yml")
public class LoginConfigSql {

	private String checkUserSql;
	private String selectUserDetails;
	
	public String getCheckUserSql() {
		return checkUserSql;
	}
	public void setCheckUserSql(String checkUserSql) {
		this.checkUserSql = checkUserSql;
	}
	public String getSelectUserDetails() {
		return selectUserDetails;
	}
	public void setSelectUserDetails(String selectUserDetails) {
		this.selectUserDetails = selectUserDetails;
	}
	
}
