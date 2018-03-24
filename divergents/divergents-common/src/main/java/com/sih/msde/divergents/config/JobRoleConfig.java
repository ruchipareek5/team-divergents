package com.sih.msde.divergents.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="jobRole",locations="classpath:sql/jobRole.yml")
public class JobRoleConfig {

	private String selectJobRole;
	private String trainingcentreforJobRole;
	public String getSelectJobRole() {
		return selectJobRole;
	}
	public void setSelectJobRole(String selectJobRole) {
		this.selectJobRole = selectJobRole;
	}
	public String getTrainingcentreforJobRole() {
		return trainingcentreforJobRole;
	}
	public void setTrainingcentreforJobRole(String trainingcentreforJobRole) {
		this.trainingcentreforJobRole = trainingcentreforJobRole;
	}
	
	
}
