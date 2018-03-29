package com.sih.msde.divergents.service;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sih.msde.divergents.dao.GetReportedIssuesDao;
import com.sih.msde.divergents.dao.ReportIssuesDao;
import com.sih.msde.divergents.dto.ReportIssuesDto;

@Service
public class ReportIssuesService {

	Integer issueSubmitStatus=-5;
	@Autowired
	private ReportIssuesDao reportIssuesDao;
	
	@Autowired
	private GetReportedIssuesDao getReportedIssuesDao;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ReportIssuesService.class);
	
	public Integer submitReportedIssue(ReportIssuesDto reportIssuesDto)
	{
		LOGGER.debug("Request received from controller to submit records into the database");
		issueSubmitStatus = reportIssuesDao.submitReportedIssue(reportIssuesDto);
		return issueSubmitStatus;
	}
	
	public Collection<ReportIssuesDto> getSubmittedIssues(String institutionName, String institutionId)
	{
		LOGGER.debug("Request received in getSubmittedIssues function with params institutionName and institutionId to get the reported issues");
		return getReportedIssuesDao.getSubmittedIssues(institutionName, institutionId);
		
	}
}
