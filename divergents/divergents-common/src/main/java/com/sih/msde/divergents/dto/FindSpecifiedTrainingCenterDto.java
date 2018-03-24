package com.sih.msde.divergents.dto;

import com.sih.msde.divergents.common.BaseDto;

public class FindSpecifiedTrainingCenterDto extends BaseDto{
	
	private String trainingCenterName;
	private String address;
	private String contactNumber;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public FindSpecifiedTrainingCenterDto(String trainingCenterName, String address, String contactNumber) {
		super();
		this.trainingCenterName = trainingCenterName;
		this.address = address;
		this.contactNumber = contactNumber;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getTrainingCenterName() {
		return trainingCenterName;
	}

	public void setTrainingCenterName(String trainingCenterName) {
		this.trainingCenterName = trainingCenterName;
	}
	
	

}
