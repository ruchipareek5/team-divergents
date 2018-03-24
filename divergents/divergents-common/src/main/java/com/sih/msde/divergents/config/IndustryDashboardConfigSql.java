package com.sih.msde.divergents.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="industryDashboard",locations="classpath:sql/industryDashboard.yml")
public class IndustryDashboardConfigSql {


	private String totalPartnerships;
	private String totalCsrFunds;
	private String totalCandidatesCertified;
	private String totalJobRoles;
	private String totalTrainingPartners;
	private String topFiveCorporatesWithMaxCsrContributions;
	private String topFiveTrainingPartnersWithMaximumPlacementsAccordingToJobRole;

	public String getTotalPartnerships() {
		return totalPartnerships;
	}
	public void setTotalPartnerships(String totalPartnerships) {
		this.totalPartnerships = totalPartnerships;
	}
	public String getTotalCsrFunds() {
		return totalCsrFunds;
	}
	public void setTotalCsrFunds(String totalCsrFunds) {
		this.totalCsrFunds = totalCsrFunds;
	}
	public String getTotalCandidatesCertified() {
		return totalCandidatesCertified;
	}
	public void setTotalCandidatesCertified(String totalCandidatesCertified) {
		this.totalCandidatesCertified = totalCandidatesCertified;
	}
	public String getTotalJobRoles() {
		return totalJobRoles;
	}
	public void setTotalJobRoles(String totalJobRoles) {
		this.totalJobRoles = totalJobRoles;
	}
	public String getTotalTrainingPartners() {
		return totalTrainingPartners;
	}
	public void setTotalTrainingPartners(String totalTrainingPartners) {
		this.totalTrainingPartners = totalTrainingPartners;
	}
	
	public String getTopFiveCorporatesWithMaxCsrContributions() {
		return topFiveCorporatesWithMaxCsrContributions;
	}
	public void setTopFiveCorporatesWithMaxCsrContributions(String topFiveCorporatesWithMaxCsrContributions) {
		this.topFiveCorporatesWithMaxCsrContributions = topFiveCorporatesWithMaxCsrContributions;
	}
	public String gettopFiveTrainingPartnersWithMaximumPlacementsAccordingToJobRole() {
		return topFiveTrainingPartnersWithMaximumPlacementsAccordingToJobRole;
	}
	
	public void settopFiveTrainingPartnersWithMaximumPlacementsAccordingToJobRole(
			String topFiveTrainingPartnersWithMaximumPlacementsAccordingToJobRole) {
		this.topFiveTrainingPartnersWithMaximumPlacementsAccordingToJobRole = topFiveTrainingPartnersWithMaximumPlacementsAccordingToJobRole;
	}
	
	
	
}
