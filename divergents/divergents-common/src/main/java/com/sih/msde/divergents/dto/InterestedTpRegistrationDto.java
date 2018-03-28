package com.sih.msde.divergents.dto;

public class InterestedTpRegistrationDto {

	private String organisationName;
	private String location;
	private String jobRole;
	private String pocName;
	private String pocEmail;
	
	public String getOrganisationName() {
		return organisationName;
	}
	public void setOrganisationName(String organisationName) {
		this.organisationName = organisationName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getJobRole() {
		return jobRole;
	}
	public void setJobRole(String jobRole) {
		this.jobRole = jobRole;
	}
	public String getPocName() {
		return pocName;
	}
	public void setPocName(String pocName) {
		this.pocName = pocName;
	}
	public String getPocEmail() {
		return pocEmail;
	}
	public void setPocEmail(String pocEmail) {
		this.pocEmail = pocEmail;
	}
	public InterestedTpRegistrationDto(String organisationName, String location, String jobRole, String pocName,
			String pocEmail) {
		super();
		this.organisationName = organisationName;
		this.location = location;
		this.jobRole = jobRole;
		this.pocName = pocName;
		this.pocEmail = pocEmail;
	}
	public InterestedTpRegistrationDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
