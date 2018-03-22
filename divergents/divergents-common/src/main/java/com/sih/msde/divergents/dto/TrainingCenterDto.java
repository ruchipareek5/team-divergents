package com.sih.msde.divergents.dto;

public class TrainingCenterDto {
private int trainingCenterId;
private String centerName;
private String address;
private String district;
private String state;
private long contactNumber;
private int trainingPartnerId;
private boolean isActive;
public int getTrainingCenterId() {
	return trainingCenterId;
}
public void setTrainingCenterId(int trainingCenterId) {
	this.trainingCenterId = trainingCenterId;
}
public String getCenterName() {
	return centerName;
}
public void setCenterName(String centerName) {
	this.centerName = centerName;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
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
public int getTrainingPartnerId() {
	return trainingPartnerId;
}
public void setTrainingPartnerId(int trainingPartnerId) {
	this.trainingPartnerId = trainingPartnerId;
}
public boolean isActive() {
	return isActive;
}
public void setActive(boolean isActive) {
	this.isActive = isActive;
}

/**
 * default constuctor 
 */
public TrainingCenterDto()
{
	super();
	
}
/**
 * Parameterized constructor
 * @param trainingCenterId
 * @param centerName
 * @param address
 * @param district
 * @param state
 * @param contactNumber
 * @param trainingPartnerId
 * @param isActive
 */
public TrainingCenterDto(int trainingCenterId, String centerName,
		String address, String district, String state, long contactNumber,
		int trainingPartnerId, boolean isActive) {
	super();
	this.trainingCenterId = trainingCenterId;
	this.centerName = centerName;
	this.address = address;
	this.district = district;
	this.state = state;
	this.contactNumber = contactNumber;
	this.trainingPartnerId = trainingPartnerId;
	this.isActive = isActive;
}

}
