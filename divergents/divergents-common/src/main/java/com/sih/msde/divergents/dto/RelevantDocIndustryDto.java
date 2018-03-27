package com.sih.msde.divergents.dto;

import com.sih.msde.divergents.common.BaseDto;

public class RelevantDocIndustryDto extends BaseDto{

	private String documentId;
	private String documentNo;
	private String title;
	private String documentUrl;
	public String getdocumentId() {
		return documentId;
	}
	public void setdocumentId(String documentId) {
		this.documentId = documentId;
	}
	public String getdocumentNo() {
		return documentNo;
	}
	public void setdocumentNo(String documentNo) {
		this.documentNo = documentNo;
	}
	public String gettitle() {
		return title;
	}
	public void settitle(String title) {
		this.title = title;
	}
	public String getdocumentUrl() {
		return documentUrl;
	}
	public void setdocumentUrl(String documentUrl) {
		this.documentUrl = documentUrl;
	}

	public RelevantDocIndustryDto(String documentId, String documentNo, String title, String documentUrl) {
		super();
		this.documentId = documentId;
		this.documentNo = documentNo;
		this.title = title;
		this.documentUrl = documentUrl;
	}
	

}

