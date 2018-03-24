package com.sih.msde.divergents.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sih.msde.divergents.service.IndustryDashboardService;

@RestController
public class IndustryDashboardController {

	private static final Logger LOGGER = LoggerFactory.getLogger(IndustryDashboardController.class);
	
	@Autowired
	private IndustryDashboardService industryDashboardService;
	
	@RequestMapping("/getTotalPartnerships")
	public Integer getTotalPartnerships()
	{
		return industryDashboardService.getTotalPartnerships();
	}
	
	@RequestMapping("/getTotalCsrFunds")
	public Integer getTotalCsrFunds()
	{
		return industryDashboardService.getTotalCsrFunds();
	}
	
	@RequestMapping("/getTotalCandidatesCertified")
	public Integer getTotalCandidatesCertified()
	{
		return industryDashboardService.getTotalCandidatesCertified();
	}
	
	@RequestMapping("/getTotalJobRolesIndustry")
	public Integer getTotalJobRoles()
	{
		return industryDashboardService.getTotalJobRoles();
	}
	
	@RequestMapping("/getTotalTrainingPartnersIndustry")
	public Integer getTotalTrainingPartners()
	{
		return industryDashboardService.getTotalTrainingPartners();
	}
	
}
