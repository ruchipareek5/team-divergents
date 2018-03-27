package com.sih.msde.divergents.dto;

import com.sih.msde.divergents.common.BaseDto;

public class RelevantDocumentsTpDto extends BaseDto{

	private String policyId;
	private String policyNo;
	private String title;
	private String policyDocUrl;
	public String getpolicyId() {
		return policyId;
	}
	public void setpolicyId(String policyId) {
		this.policyId = policyId;
	}
	public String getpolicyNo() {
		return policyNo;
	}
	public void setpolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String gettitle() {
		return title;
	}
	public void settitle(String title) {
		this.title = title;
	}
	public String getpolicyDocUrl() {
		return policyDocUrl;
	}
	public void setpolicyDocUrl(String policyDocUrl) {
		this.policyDocUrl = policyDocUrl;
	}

	public RelevantDocumentsTpDto(String policyId, String policyNo, String title, String policyDocUrl) {
		super();
		this.policyId = policyId;
		this.policyNo = policyNo;
		this.title = title;
		this.policyDocUrl = policyDocUrl;
	}
	

}
