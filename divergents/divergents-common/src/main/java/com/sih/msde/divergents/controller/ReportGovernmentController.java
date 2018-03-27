package com.sih.msde.divergents.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sih.msde.divergents.dto.ReportGovernmentDto;
import com.sih.msde.divergents.service.ReportGovernmentService;

@RestController
public class ReportGovernmentController {

	@Autowired
	private ReportGovernmentService reportGovernmentService;
	
	@RequestMapping(value="/getGovReports")
	public Collection<ReportGovernmentDto> getJobRolesForSelectedLetter(@RequestParam("letter") String letter){
	
		return reportGovernmentService.getgovReport(letter);
	}
	
}
