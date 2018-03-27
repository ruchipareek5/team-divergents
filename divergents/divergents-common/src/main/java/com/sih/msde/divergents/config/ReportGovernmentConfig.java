package com.sih.msde.divergents.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="govReport",locations="classpath:sql/govReport.yml")
public class ReportGovernmentConfig {

	private String selectGovReport;
	
	public String getselectGovReport() {
		return selectGovReport;
	}
	public void setselectGovReport(String selectGovReport) {
		this.selectGovReport = selectGovReport;
	}
	
	
	
}

