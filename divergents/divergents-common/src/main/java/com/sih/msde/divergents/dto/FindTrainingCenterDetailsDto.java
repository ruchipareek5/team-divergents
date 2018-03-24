package com.sih.msde.divergents.dto;

import com.sih.msde.divergents.common.BaseDto;

public class FindTrainingCenterDetailsDto extends BaseDto{
	
	private String state;
	private String district;
	private String block;
	private String sector;
	private String jobrole;
	public FindTrainingCenterDetailsDto(String state, String district, String block, String sector, String jobrole) {
		super();
		this.state = state;
		this.district = district;
		this.block = block;
		this.sector = sector;
		this.jobrole = jobrole;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getBlock() {
		return block;
	}
	public void setBlock(String block) {
		this.block = block;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public String getJobrole() {
		return jobrole;
	}
	public void setJobrole(String jobrole) {
		this.jobrole = jobrole;
	}
	public FindTrainingCenterDetailsDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
