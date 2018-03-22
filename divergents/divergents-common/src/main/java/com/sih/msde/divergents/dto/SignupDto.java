package com.sih.msde.divergents.dto;

public class SignupDto {

	private String organizationName;
	private String sPOCName;
	private String userId;
	private String password;
	private String userRole;
	public String getOrganizationName() {
		return organizationName;
	}
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}
	public String getsPOCName() {
		return sPOCName;
	}
	public void setsPOCName(String sPOCName) {
		this.sPOCName = sPOCName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public SignupDto(String organizationName, String sPOCName, String userId, String password, String userRole) {
		super();
		this.organizationName = organizationName;
		this.sPOCName = sPOCName;
		this.userId =   userId;
		this.password = password;
		this.userRole = userRole;
	}
	
	public SignupDto() {
		super();
	}
	
	
}
