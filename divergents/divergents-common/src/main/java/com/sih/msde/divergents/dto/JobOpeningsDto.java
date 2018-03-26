package com.sih.msde.divergents.dto;

import com.sih.msde.divergents.common.BaseDto;

public class JobOpeningsDto extends BaseDto{
	
	private String jobId;
	private String jobTitle;
	private String organization;
	private String location;
	private String ctc;
	private String jobDescription;
	
	
	public JobOpeningsDto(String jobId, String jobTitle, String organization, String location, String ctc,
			String jobDescription) {
		super();
		this.jobId = jobId;
		this.jobTitle = jobTitle;
		this.organization = organization;
		this.location = location;
		this.ctc = ctc;
		this.jobDescription = jobDescription;
	}
	
	
	public JobOpeningsDto() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCtc() {
		return ctc;
	}
	public void setCtc(String ctc) {
		this.ctc = ctc;
	}
	public String getJobDescription() {
		return jobDescription;
	}
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

}
