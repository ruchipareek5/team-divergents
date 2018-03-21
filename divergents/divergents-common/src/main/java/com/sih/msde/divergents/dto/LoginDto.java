package com.sih.msde.divergents.dto;

import com.sih.msde.divergents.common.BaseDto;

public class LoginDto extends BaseDto{

	private String userId;
	//private String password;
	private String sPOCName;
	private String userStatus;
	private String userRole;

	
	
	
	public String getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
	public String getsPOCName() {
		return sPOCName;
	}
	public void setsPOCName(String sPOCName) {
		this.sPOCName = sPOCName;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	
	
	public LoginDto(String userId, String sPOCName, String userRole, String id) {
		super();
		this.userId = userId;
		//this.password = password;
		this.sPOCName = sPOCName;
		this.userRole = userRole;
		
	}
	
}
