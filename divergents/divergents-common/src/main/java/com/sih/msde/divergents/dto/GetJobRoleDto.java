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
		
	}

	public String getJobrole() {
		return jobrole;
	}

	public void setJobrole(String jobrole) {
		this.jobrole = jobrole;
	}

	

}
