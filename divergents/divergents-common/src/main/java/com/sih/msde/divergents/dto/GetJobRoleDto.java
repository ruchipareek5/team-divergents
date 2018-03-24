package com.sih.msde.divergents.dto;

import com.sih.msde.divergents.common.BaseDto;

public class GetJobRoleDto extends BaseDto{
	
	private String jobrole;

	public GetJobRoleDto(String jobrole) {
		super();
		this.jobrole = jobrole;
	}

	public GetJobRoleDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getDistricts() {
		return jobrole;
	}

	public void setDistricts(String districts) {
		this.jobrole = districts;
	}
	

}
