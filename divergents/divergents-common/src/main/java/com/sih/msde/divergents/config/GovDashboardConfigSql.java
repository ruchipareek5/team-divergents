package com.sih.msde.divergents.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="govDashboard",locations="classpath:sql/govDashboard.yml")
public class GovDashboardConfigSql {

	private String totalTrainingCenters;

	public String getTotalTrainingCenters() {
		return totalTrainingCenters;
	}

	public void setTotalTrainingCenters(String totalTrainingCenters) {
		this.totalTrainingCenters = totalTrainingCenters;
	}
	
}
