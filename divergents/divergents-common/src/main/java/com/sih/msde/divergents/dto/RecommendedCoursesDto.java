package com.sih.msde.divergents.dto;

import com.sih.msde.divergents.common.BaseDto;

public class RecommendedCoursesDto extends BaseDto{
	
	/*
	 * This is the DTO for getting recommended courses information based on state or district*
	 */
	
	private String trainingmaterialid;
	private String trainingmaterialurl;
	private String trainingtitle;
	private String trainingmaterialcol;
	
	public RecommendedCoursesDto(String trainingmaterialid, String trainingmaterialurl, String trainingtitle,
			String trainingmaterialcol) {
		super();
		this.trainingmaterialid = trainingmaterialid;
		this.trainingmaterialurl = trainingmaterialurl;
		this.trainingtitle = trainingtitle;
		this.trainingmaterialcol = trainingmaterialcol;
	}
	public String getTrainingmaterialid() {
		return trainingmaterialid;
	}
	public void setTrainingmaterialid(String trainingmaterialid) {
		this.trainingmaterialid = trainingmaterialid;
	}
	public String getTrainingmaterialurl() {
		return trainingmaterialurl;
	}
	public void setTrainingmaterialurl(String trainingmaterialurl) {
		this.trainingmaterialurl = trainingmaterialurl;
	}
	public String getTrainingtitle() {
		return trainingtitle;
	}
	public void setTrainingtitle(String trainingtitle) {
		this.trainingtitle = trainingtitle;
	}
	public String getTrainingmaterialcol() {
		return trainingmaterialcol;
	}
	public void setTrainingmaterialcol(String trainingmaterialcol) {
		this.trainingmaterialcol = trainingmaterialcol;
	}

}
