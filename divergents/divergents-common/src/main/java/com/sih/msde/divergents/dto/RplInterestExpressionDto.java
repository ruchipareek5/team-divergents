package com.sih.msde.divergents.dto;

public class RplInterestExpressionDto {

	private String organisationName;
	private String areaOfOperation;
	private String numberOfEmployeesToBeCertified;
	private long companyIncorporationNumber;
	private String hrPocEmail;
	
	
	
	public String getOrganisationName() {
		return organisationName;
	}
	public void setOrganisationName(String organisationName) {
		this.organisationName = organisationName;
	}
	public String getAreaOfOperation() {
		return areaOfOperation;
	}
	public void setAreaOfOperation(String areaOfOperation) {
		this.areaOfOperation = areaOfOperation;
	}
	public String getNumberOfEmployeesToBeCertified() {
		return numberOfEmployeesToBeCertified;
	}
	public void setNumberOfEmployeesToBeCertified(String numberOfEmployeesToBeCertified) {
		this.numberOfEmployeesToBeCertified = numberOfEmployeesToBeCertified;
	}
	public long getCompanyIncorporationNumber() {
		return companyIncorporationNumber;
	}
	public void setCompanyIncorporationNumber(long companyIncorporationNumber) {
		this.companyIncorporationNumber = companyIncorporationNumber;
	}
	public String getHrPocEmail() {
		return hrPocEmail;
	}
	public void setHrPocEmail(String hrPocEmail) {
		this.hrPocEmail = hrPocEmail;
	}
	public RplInterestExpressionDto(String organisationName, String areaOfOperation,
			String numberOfEmployeesToBeCertified, long companyIncorporationNumber, String hrPocEmail) {
		super();
		this.organisationName = organisationName;
		this.areaOfOperation = areaOfOperation;
		this.numberOfEmployeesToBeCertified = numberOfEmployeesToBeCertified;
		this.companyIncorporationNumber = companyIncorporationNumber;
		this.hrPocEmail = hrPocEmail;
	}
	public RplInterestExpressionDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
