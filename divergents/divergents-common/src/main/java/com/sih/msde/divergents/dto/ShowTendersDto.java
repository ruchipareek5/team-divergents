package com.sih.msde.divergents.dto;

public class ShowTendersDto {

	
	private String tenderNumber;
	private String tenderTitle;
	private String tenderCategory;
	private String tenderDepartment;
	private String tenderDocument;
	private String bidStartDate;
	private String bidSubmissionDate;
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
	public String getTenderDocument() {
		return tenderDocument;
	}
	public void setTenderDocument(String tenderDocument) {
		this.tenderDocument = tenderDocument;
	}
	public String getBidStartDate() {
		return bidStartDate;
	}
	public void setBidStartDate(String bidStartDate) {
		this.bidStartDate = bidStartDate;
	}
	public String getBidSubmissionDate() {
		return bidSubmissionDate;
	}
	public void setBidSubmissionDate(String bidSubmissionDate) {
		this.bidSubmissionDate= bidSubmissionDate;
	}
	public ShowTendersDto(String tenderNumber, String tenderTitle, String tenderCategory, String tenderDepartment, String tenderDocument, String bidStartDate,String bidSubmissionDate) {
		super();
		this.tenderNumber = tenderNumber;
		this.tenderTitle = tenderTitle;
		this.tenderCategory = tenderCategory;
		this.tenderDepartment = tenderDepartment;
		this.tenderDocument = tenderDocument;
		this.bidStartDate = bidStartDate;
		this.bidSubmissionDate= bidSubmissionDate;
	}
	public ShowTendersDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
		
	
}
