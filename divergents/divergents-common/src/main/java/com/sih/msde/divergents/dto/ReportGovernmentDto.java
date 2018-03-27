package com.sih.msde.divergents.dto;

import com.sih.msde.divergents.common.BaseDto;

public class ReportGovernmentDto extends BaseDto{
	
	private String reportgovId;
	private String reportgovNo;
	private String title;
	private String reportdocUrl;
	public String getreportgovId() {
		return reportgovId;
	}
	public void setreportgovId(String reportgovId) {
		this.reportgovId = reportgovId;
	}
	public String getreportgovNo() {
		return reportgovNo;
	}
	public void setreportgovNo(String reportgovNo) {
		this.reportgovNo = reportgovNo;
	}
	public String gettitle() {
		return title;
	}
	public void settitle(String title) {
		this.title = title;
	}
	public String getreportdocUrl() {
		return reportdocUrl;
	}
	public void setreportdocUrl(String reportdocUrl) {
		this.reportdocUrl = reportdocUrl;
	}

	public ReportGovernmentDto(String reportgovId, String reportgovNo, String title, String reportdocUrl) {
		super();
		this.reportgovId = reportgovId;
		this.reportgovNo = reportgovNo;
		this.title = title;
		this.reportdocUrl = reportdocUrl;
	}
	

}
