package com.sih.msde.divergents.dto;

import com.sih.msde.divergents.common.BaseDto;

public class LoginReceiveDataDto extends BaseDto {

	private String userId;
	private String password;
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
	public LoginReceiveDataDto(String userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}
	
   public LoginReceiveDataDto() {
	   super();
   }
	

	
}
