package com.sih.msde.divergents.dto;

import com.sih.msde.divergents.common.BaseDto;

public class TopFiveCorporatesWithMaxCsrContributionsDto extends BaseDto {

	private String organisationName;
	private long csrFunds;
	
	public String getOrganisationName() {
		return organisationName;
	}
	public void setOrganisationName(String organisationName) {
		this.organisationName = organisationName;
	}
	public long getCsrFunds() {
		return csrFunds;
	}
	public void setCsrFunds(long csrFunds) {
		this.csrFunds = csrFunds;
	}
	
	public TopFiveCorporatesWithMaxCsrContributionsDto(String organisationName, long csrFunds) {
		super();
		this.organisationName = organisationName;
		this.csrFunds = csrFunds;
	}
	public TopFiveCorporatesWithMaxCsrContributionsDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
