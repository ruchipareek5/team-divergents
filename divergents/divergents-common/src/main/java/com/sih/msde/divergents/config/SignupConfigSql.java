package com.sih.msde.divergents.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="register",locations="classpath:sql/signup.yml")
public class SignupConfigSql {

	private String insertSql;
	private String checkUserSql;
	public String getInsertSql() {
		return insertSql;
	}
	public void setInsertSql(String insertSql) {
		this.insertSql = insertSql;
	}
	public String getCheckUserSql() {
		return checkUserSql;
	}
	public void setCheckUserSql(String checkUserSql, String insertSql) {
		this.checkUserSql = checkUserSql;
		this.insertSql = insertSql;
	}
	
	
	
}
