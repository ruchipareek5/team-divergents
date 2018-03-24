package com.sih.msde.divergents.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sih.msde.divergents.service.TpDashboardService;

@RestController
public class TpDashboardController {

	@Autowired
	private TpDashboardService tpDashboardService;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TpDashboardController.class);
	
	@RequestMapping("/getTotalJobRoles")
	public Integer getTotalJobRoles()
	{
		return tpDashboardService.getTotalJobRoles();
	}
	
	@RequestMapping("/getTotalCandidatesTrained")
	public Integer getTotalCandidatesTrained()
	{
		return tpDashboardService.getTotalCandidatesTrained();
	}
	
	@RequestMapping("/getTotalTrainingPartners")
	public Integer getTotalTrainingPartners()
	{
		return tpDashboardService.getTotalTrainingPartners();
	}
	
	@RequestMapping("/getTotalSectorSkillCouncil")
	public Integer getTotalSectorSkillCouncil()
	{
		return tpDashboardService.getTotalSectorSkillCouncil();
	}
	
	@RequestMapping("/getAnnualTarget")
	public Integer getAnnualTarget()
	{
		return tpDashboardService.getAnnualTarget();
	}
	
	
}
