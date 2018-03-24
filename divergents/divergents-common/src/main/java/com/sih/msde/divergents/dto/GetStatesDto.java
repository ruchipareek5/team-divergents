package com.sih.msde.divergents.dto;

import com.sih.msde.divergents.common.BaseDto;

public class GetStatesDto extends BaseDto{
	
	private String State;

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public GetStatesDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GetStatesDto(String state) {
		super();
		State = state;
	}
	

}
