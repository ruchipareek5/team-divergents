package com.sih.msde.divergents.dto;

public class ShowTendersDto {

	
	private String tenderNumber;
	private String tenderTitle;
	private String tenderCategory;
	private String tenderDepartment;
	public String getTenderNumber() {
		return tenderNumber;
	}
	public void setTenderNumber(String tenderNumber) {
		this.tenderNumber = tenderNumber;
	}
	public String getTenderTitle() {
		return tenderTitle;
	}
	public void setTenderTitle(String tenderTitle) {
		this.tenderTitle = tenderTitle;
	}
	public String getTenderCategory() {
		return tenderCategory;
	}
	public void setTenderCategory(String tenderCategory) {
		this.tenderCategory = tenderCategory;
	}
	public String getTenderDepartment() {
		return tenderDepartment;
	}
	public void setTenderDepartment(String tenderDepartment) {
		this.tenderDepartment = tenderDepartment;
	}
	public ShowTendersDto(String tenderNumber, String tenderTitle, String tenderCategory, String tenderDepartment) {
		super();
		this.tenderNumber = tenderNumber;
		this.tenderTitle = tenderTitle;
		this.tenderCategory = tenderCategory;
		this.tenderDepartment = tenderDepartment;
	}
	public ShowTendersDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
		
	
}
