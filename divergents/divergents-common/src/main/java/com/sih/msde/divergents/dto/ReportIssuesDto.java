package com.sih.msde.divergents.dto;

import java.sql.Date;

public class ReportIssuesDto {

	private String issueWith;
	private String reporteeName;
	private String reporteeId;
	private String institutionName;
	private String institutionId;
	private String issueType;
	private String issueDescription;
	private Date issueReportDate;
	public String getIssueWith() {
		return issueWith;
	}
	public void setIssueWith(String issueWith) {
		this.issueWith = issueWith;
	}
	public String getReporteeName() {
		return reporteeName;
	}
	public void setReporteeName(String reporteeName) {
		this.reporteeName = reporteeName;
	}
	public String getReporteeId() {
		return reporteeId;
	}
	public void setReporteeId(String reporteeId) {
		this.reporteeId = reporteeId;
	}
	public String getInstitutionName() {
		return institutionName;
	}
	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}
	public String getInstitutionId() {
		return institutionId;
	}
	public void setInstitutionId(String institutionId) {
		this.institutionId = institutionId;
	}
	public String getIssueType() {
		return issueType;
	}
	public void setIssueType(String issueType) {
		this.issueType = issueType;
	}
	public String getIssueDescription() {
		return issueDescription;
	}
	public void setIssueDescription(String issueDescription) {
		this.issueDescription = issueDescription;
	}
	public Date getIssueReportDate() {
		return issueReportDate;
	}
	public void setIssueReportDate(Date issueReportDate) {
		this.issueReportDate = issueReportDate;
	}
	public ReportIssuesDto(String issueWith, String reporteeName, String reporteeId, String institutionName,
			String institutionId, String issueType, String issueDescription, Date issueReportDate) {
		super();
		this.issueWith = issueWith;
		this.reporteeName = reporteeName;
		this.reporteeId = reporteeId;
		this.institutionName = institutionName;
		this.institutionId = institutionId;
		this.issueType = issueType;
		this.issueDescription = issueDescription;
		this.issueReportDate = issueReportDate;
	}
	public ReportIssuesDto() {
		super();
		// TODO Auto-generated constructor stub
	}
//	
	
	
	
	
}
