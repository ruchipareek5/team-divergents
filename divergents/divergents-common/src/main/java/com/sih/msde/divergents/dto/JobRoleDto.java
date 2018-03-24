package com.sih.msde.divergents.dto;

import com.sih.msde.divergents.common.BaseDto;

public class JobRoleDto extends BaseDto{
	
	private String jobRoleId;
	private String jobRoleName;
	private String jobRoleDescription;
	private String jobRoleUrl;
	private String ssc;
	public String getJobRoleId() {
		return jobRoleId;
	}
	public void setJobRoleId(String jobRoleId) {
		this.jobRoleId = jobRoleId;
	}
	public String getJobRoleName() {
		return jobRoleName;
	}
	public void setJobRoleName(String jobRoleName) {
		this.jobRoleName = jobRoleName;
	}
	public String getJobRoleDescription() {
		return jobRoleDescription;
	}
	public void setJobRoleDescription(String jobRoleDescription) {
		this.jobRoleDescription = jobRoleDescription;
	}
	public String getJobRoleUrl() {
		return jobRoleUrl;
	}
	public void setJobRoleUrl(String jobRoleUrl) {
		this.jobRoleUrl = jobRoleUrl;
	}
	public String getSsc() {
		return ssc;
	}
	public void setSsc(String ssc) {
		this.ssc = ssc;
	}
	public JobRoleDto(String jobRoleId, String jobRoleName, String jobRoleDescription, String jobRoleUrl, String ssc) {
		super();
		this.jobRoleId = jobRoleId;
		this.jobRoleName = jobRoleName;
		this.jobRoleDescription = jobRoleDescription;
		this.jobRoleUrl = jobRoleUrl;
		this.ssc = ssc;
	}
	
	

}
