package com.sih.msde.divergents.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="talentAcquisition",locations="classpath:sql/talentAcquisition.yml")
public class TalentAcquisitionConfig {
	
	private String selectCandidateAccordingtoJobrole;

	public String getSelectCandidateAccordingtoJobrole() {
		return selectCandidateAccordingtoJobrole;
	}

	public void setSelectCandidateAccordingtoJobrole(String selectCandidateAccordingtoJobrole) {
		this.selectCandidateAccordingtoJobrole = selectCandidateAccordingtoJobrole;
	}
	
	

}
