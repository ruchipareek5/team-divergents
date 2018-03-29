package com.sih.msde.divergents.dto;

import com.sih.msde.divergents.common.BaseDto;

public class TrainingMaterialDto extends BaseDto{
	
	private String trainingmaterialid;
	private String trainingtitle;
	private String trainingmaterialurl;
	public String getTrainingmaterialid() {
		return trainingmaterialid;
	}
	public void setTrainingmaterialid(String trainingmaterialid) {
		this.trainingmaterialid = trainingmaterialid;
	}
	public String getTrainingtitle() {
		return trainingtitle;
	}
	public void setTrainingtitle(String trainingtitle) {
		this.trainingtitle = trainingtitle;
	}
	public String getTrainingmaterialurl() {
		return trainingmaterialurl;
	}
	public void setTrainingmaterialurl(String trainingmaterialurl) {
		this.trainingmaterialurl = trainingmaterialurl;
	}
	
	public TrainingMaterialDto(String trainingmaterialid, String trainingtitle, String trainingmaterialurl) {
		super();
		this.trainingmaterialid = trainingmaterialid;
		this.trainingtitle = trainingtitle;
		this.trainingmaterialurl = trainingmaterialurl;
	}
	
	public TrainingMaterialDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}



