package com.sih.msde.divergents.controller;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sih.msde.divergents.dto.ReportIssuesDto;
import com.sih.msde.divergents.service.ReportIssuesService;


@RestController
public class ReportIssuesController {

	private static final Logger LOGGER = LoggerFactory.getLogger(ReportIssuesController.class);
	@Autowired
	private ReportIssuesService reportIssuesService;
	Integer issueSubmitStatus=-5;
	@RequestMapping(value="/reportIssues",method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE)
	public Integer submitReportedIssue(@RequestBody ReportIssuesDto reportIssuesDto)
	{
		try {
			LOGGER.debug("Received JSON Object from front-end to submit records");
			issueSubmitStatus = reportIssuesService.submitReportedIssue(reportIssuesDto);
			return issueSubmitStatus;
		}
		catch(Exception e)
		{
			LOGGER.debug("An exception occured in the controller while receiving data from front-end" +e);
			return issueSubmitStatus;
		}
		
	}
	
	@RequestMapping("/getReportedIssues")
	public Collection<ReportIssuesDto> getSubmittedIssues(@RequestParam("institutionName") String institutionName,@RequestParam("institutionId") String institutionId)
	{
		try
		{
			LOGGER.debug("Received the parameters from front end");
			return reportIssuesService.getSubmittedIssues(institutionName, institutionId);
		}
		catch(Exception e)
		{
			LOGGER.debug("An exception occured in the controller " +e);
			return null;
		}
	}
}
