package com.sih.msde.divergents.dto;

import com.sih.msde.divergents.common.BaseDto;

public class GetDistricts extends BaseDto{
	
	private String district;

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public GetDistricts(String district) {
		super();
		this.district = district;
	}

	public GetDistricts() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
