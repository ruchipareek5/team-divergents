package com.sih.msde.divergents.dto;

import com.sih.msde.divergents.common.BaseDto;

public class GetJobRole extends BaseDto{
	
	private String jobrole;

	public GetJobRole(String jobrole) {
		super();
		this.jobrole = jobrole;
	}

	public GetJobRole() {
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
