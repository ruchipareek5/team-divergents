package com.sih.msde.divergents.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="tpDashboard",locations="classpath:sql/tpDashboard.yml")
public class TpDashboardCongifSql {

	private String totalJobRoles;
	private String totalCandidatesTrained;
	private String totalTrainingPartners;
	private String totalSectorSkillCouncil;
	private String annualTarget;
	
	public String getTotalJobRoles() {
		return totalJobRoles;
	}
	public void setTotalJobRoles(String totalJobRoles) {
		this.totalJobRoles = totalJobRoles;
	}
	public String getTotalCandidatesTrained() {
		return totalCandidatesTrained;
	}
	public void setTotalCandidatesTrained(String totalCandidatesTrained) {
		this.totalCandidatesTrained = totalCandidatesTrained;
	}
	public String getTotalTrainingPartners() {
		return totalTrainingPartners;
	}
	public void setTotalTrainingPartners(String totalTrainingPartners) {
		this.totalTrainingPartners = totalTrainingPartners;
	}
	public String getTotalSectorSkillCouncil() {
		return totalSectorSkillCouncil;
	}
	public void setTotalSectorSkillCouncil(String totalSectorSkillCouncil) {
		this.totalSectorSkillCouncil = totalSectorSkillCouncil;
	}
	public String getAnnualTarget() {
		return annualTarget;
	}
	public void setAnnualTarget(String annualTarget) {
		this.annualTarget = annualTarget;
	}
	
	
}
