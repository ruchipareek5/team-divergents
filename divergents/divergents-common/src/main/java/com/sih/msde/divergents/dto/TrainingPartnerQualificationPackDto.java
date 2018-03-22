package com.sih.msde.divergents.dto;

public class TrainingPartnerQualificationPackDto {
private int trainingPartnerQualificationPackId;
private int trainingPartnerId;
private String qualificationPack;
private String jobRole;
private String scheme;
private boolean isActive;
public int getTrainingPartnerQualificationPackId() {
	return trainingPartnerQualificationPackId;
}
public void setTrainingPartnerQualificationPackId(
		int trainingPartnerQualificationPackId) {
	this.trainingPartnerQualificationPackId = trainingPartnerQualificationPackId;
}
public int getTrainingPartnerId() {
	return trainingPartnerId;
}
public void setTrainingPartnerId(int trainingPartnerId) {
	this.trainingPartnerId = trainingPartnerId;
}
public String getQualificationPack() {
	return qualificationPack;
}
public TrainingPartnerQualificationPackDto() {
	super();
}

public TrainingPartnerQualificationPackDto(
		int trainingPartnerQualificationPackId, int trainingPartnerId,
		String qualificationPack, String jobRole, String scheme,
		boolean isActive) {
	super();
	this.trainingPartnerQualificationPackId = trainingPartnerQualificationPackId;
	this.trainingPartnerId = trainingPartnerId;
	this.qualificationPack = qualificationPack;
	this.jobRole = jobRole;
	this.scheme = scheme;
	this.isActive = isActive;
}
public void setQualificationPack(String qualificationPack) {
	this.qualificationPack = qualificationPack;
}
public String getJobRole() {
	return jobRole;
}
public void setJobRole(String jobRole) {
	this.jobRole = jobRole;
}
public String getScheme() {
	return scheme;
}
public void setScheme(String scheme) {
	this.scheme = scheme;
}
public boolean isActive() {
	return isActive;
}
public void setActive(boolean isActive) {
	this.isActive = isActive;
}


}
