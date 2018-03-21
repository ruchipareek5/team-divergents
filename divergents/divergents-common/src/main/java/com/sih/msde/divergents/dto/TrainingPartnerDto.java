package com.sih.msde.divergents.dto;

public class TrainingPartnerDto {
private long trainingPartnerId;
private String organisationName;
private String sPOCName;
private String address;
private String website;
private String district;
private String state;
private long contactNumber;
private int applicationId;
private String undertakingPath;

public TrainingPartnerDto()
{
	super();
}
public TrainingPartnerDto(long trainingPartnerId, String organisationName,String sPOCName,
		String address,String website,String district,String state,long contactNumber, int applicationId, String undertakingPath)
		{
	super();
	this.trainingPartnerId = trainingPartnerId;
	this.organisationName = organisationName;
	this.sPOCName = sPOCName;
	this.address = address;
	this.website = website;
	this.district = district;
	this.state = state;
	this.contactNumber = contactNumber;
	this.applicationId = applicationId;
	this.undertakingPath = undertakingPath;
		}

public long getTrainingPartnerId() {
	return trainingPartnerId;
}
public void setTrainingPartnerId(long trainingPartnerId) {
	this.trainingPartnerId = trainingPartnerId;
}
public String getOrganisationName() {
	return organisationName;
}
public void setOrganisationName(String organisationName) {
	this.organisationName = organisationName;
}
public String getsPOCName() {
	return sPOCName;
}
public void setsPOCName(String sPOCName) {
	this.sPOCName = sPOCName;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getWebsite() {
	return website;
}
public void setWebsite(String website) {
	this.website = website;
}
public String getDistrict() {
	return district;
}
public void setDistrict(String district) {
	this.district = district;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public long getContactNumber() {
	return contactNumber;
}
public void setContactNumber(long contactNumber) {
	this.contactNumber = contactNumber;
}
public int getApplicationId() {
	return applicationId;
}
public void setApplicationId(int applicationId) {
	this.applicationId = applicationId;
}
public String getUndertakingPath() {
	return undertakingPath;
}
public void setUndertakingPath(String undertakingPath) {
	this.undertakingPath = undertakingPath;
}

}
