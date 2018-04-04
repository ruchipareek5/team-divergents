package com.sih.msde.divergents.dto;

import com.sih.msde.divergents.common.BaseDto;

public class CapacityBuilderDto extends BaseDto{
	
	private String trainingid;
	private String trainingtitle;
	private String ssc;
	private String startdate;
	private String enddate;
	private String curriculum;
	
		
	public CapacityBuilderDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CapacityBuilderDto(String trainingid, String trainingtitle, String ssc, String startdate, String enddate,
			String curriculum) {
		super();
		this.trainingid = trainingid;
		this.trainingtitle = trainingtitle;
		this.ssc = ssc;
		this.startdate = startdate;
		this.enddate = enddate;
		this.curriculum = curriculum;
	}
	public String getTrainingid() {
		return trainingid;
	}
	public void setTrainingid(String trainingid) {
		this.trainingid = trainingid;
	}
	public String getTrainingtitle() {
		return trainingtitle;
	}
	public void setTrainingtitle(String trainingtitle) {
		this.trainingtitle = trainingtitle;
	}
	public String getSsc() {
		return ssc;
	}
	public void setSsc(String ssc) {
		this.ssc = ssc;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public String getCurriculum() {
		return curriculum;
	}
	public void setCurriculum(String curriculum) {
		this.curriculum = curriculum;
	}

}
