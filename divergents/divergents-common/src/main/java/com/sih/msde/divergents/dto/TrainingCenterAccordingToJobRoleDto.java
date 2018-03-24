
package com.sih.msde.divergents.dto;

import com.sih.msde.divergents.common.BaseDto;

public class TrainingCenterAccordingToJobRoleDto extends BaseDto{
	
	private String trainingCentreName;
	private String state;
	
	public String getTrainingCentreName() {
		return trainingCentreName;
	}
	
	public void setTrainingCentreName(String trainingCentreName) {
		this.trainingCentreName = trainingCentreName;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public TrainingCenterAccordingToJobRoleDto(String trainingCentreName, String state) {
		super();
		this.trainingCentreName = trainingCentreName;
		this.state = state;
	}
	

	
}
