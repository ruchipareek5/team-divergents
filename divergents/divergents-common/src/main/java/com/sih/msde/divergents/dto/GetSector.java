package com.sih.msde.divergents.dto;

import com.sih.msde.divergents.common.BaseDto;

public class GetSector extends BaseDto{
	
	private String sector;

	public GetSector(String sector) {
		super();
		this.sector = sector;
	}

	public GetSector() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}
	
	

}
