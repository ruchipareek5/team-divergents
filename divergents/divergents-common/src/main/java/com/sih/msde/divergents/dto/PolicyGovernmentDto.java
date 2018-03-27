package com.sih.msde.divergents.dto;

import com.sih.msde.divergents.common.BaseDto;

public class PolicyGovernmentDto extends BaseDto{
	
	private String policygovId;
	private String policygovNo;
	private String title;
	private String policydocUrl;
	public String getpolicygovId() {
		return policygovId;
	}
	public void setpolicygovId(String policygovId) {
		this.policygovId = policygovId;
	}
	public String getpolicygovNo() {
		return policygovNo;
	}
	public void setpolicygovNo(String policygovNo) {
		this.policygovNo = policygovNo;
	}
	public String gettitle() {
		return title;
	}
	public void settitle(String title) {
		this.title = title;
	}
	public String getpolicydocUrl() {
		return policydocUrl;
	}
	public void setpolicydocUrl(String policydocUrl) {
		this.policydocUrl = policydocUrl;
	}
	
	public PolicyGovernmentDto(String policygovId, String policygovNo, String title, String policydocUrl) {
		super();
		this.policygovId = policygovId;
		this.policygovNo = policygovNo;
		this.title = title;
		this.policydocUrl = policydocUrl;
	}
	
	

}

