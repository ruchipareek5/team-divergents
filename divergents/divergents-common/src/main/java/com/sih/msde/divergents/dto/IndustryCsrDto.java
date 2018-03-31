package com.sih.msde.divergents.dto;

public class IndustryCsrDto {

	private String orgName;
	private String pocName;
	private String contactNumber;
	private String selectedModel;
	private String amount;
	
	
	
	public String getorgName() {
		return orgName;
	}
	public void setorgName(String orgName) {
		this.orgName = orgName;
	}
	public String getpocName() {
		return pocName;
	}
	public void setpocName(String pocName) {
		this.pocName = pocName;
	}
	public String getcontactNumber() {
		return contactNumber;
	}
	public void setcontactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getselectedModel() {
		return selectedModel;
	}
	public void setselectedModel(String selectedModel) {
		this.selectedModel = selectedModel;
	}
	public String getamount() {
		return amount;
	}
	public void setamount(String amount) {
		this.amount = amount;
	}
	public IndustryCsrDto(String orgName, String pocName,
			String contactNumber, String selectedModel, String amount) {
		super();
		this.orgName = orgName;
		this.pocName = pocName;
		this.contactNumber = contactNumber;
		this.selectedModel = selectedModel;
		this.amount = amount;
	}
	public IndustryCsrDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}

