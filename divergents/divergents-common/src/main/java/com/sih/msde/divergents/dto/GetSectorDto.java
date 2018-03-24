package com.sih.msde.divergents.dto;

import com.sih.msde.divergents.common.BaseDto;

public class GetSectorDto extends BaseDto{
	
	private String sector;

	public GetSectorDto(String sector) {
		super();
		this.sector = sector;
	}

	public GetSectorDto() {
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
