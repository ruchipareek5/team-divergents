package com.sih.msde.divergents.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="govDashboard",locations="classpath:sql/govDashboard.yml")
public class GovDashboardConfigSql {

	private String totalTrainingCenters;
	private String totalCandidatesPlaced;
	
	

	public String getTotalCandidatesPlaced() {
		return totalCandidatesPlaced;
	}

	public void setTotalCandidatesPlaced(String totalCandidatesPlaced) {
		this.totalCandidatesPlaced = totalCandidatesPlaced;
	}

	public String getTotalTrainingCenters() {
		return totalTrainingCenters;
	}

	public void setTotalTrainingCenters(String totalTrainingCenters) {
		this.totalTrainingCenters = totalTrainingCenters;
	}
	
}
