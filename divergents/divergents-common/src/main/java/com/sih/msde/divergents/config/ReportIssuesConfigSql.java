package com.sih.msde.divergents.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="reportIssues",locations="classpath:sql/reportIssues.yml")
public class ReportIssuesConfigSql {

	private String insertReportedIssues;
	private String viewReportedIssues;

	public String getViewReportedIssues() {
		return viewReportedIssues;
	}

	public void setViewReportedIssues(String viewReportedIssues) {
		this.viewReportedIssues = viewReportedIssues;
	}

	public String getInsertReportedIssues() {
		return insertReportedIssues;
	}

	public void setInsertReportedIssues(String insertReportedIssues) {
		this.insertReportedIssues = insertReportedIssues;
	}
	
	
	
}
