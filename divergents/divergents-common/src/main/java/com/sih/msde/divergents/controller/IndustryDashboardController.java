package com.sih.msde.divergents.controller;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sih.msde.divergents.dto.PlacementPercentageOfTopFiveTpDto;
import com.sih.msde.divergents.dto.TopFiveCorporatesWithMaxCsrContributionsDto;
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
	
	@RequestMapping("/getTopFiveCorporates")
	public Collection <TopFiveCorporatesWithMaxCsrContributionsDto> getTopFiveCorporates()
	{
		return industryDashboardService.getTopFiveCorporates();
	}
	
	@RequestMapping("/PlacementPercentageOfTopFiveTp")
	public Collection<PlacementPercentageOfTopFiveTpDto> getPlacementPercentageOfTopFiveTp()
	{
		try {
			
			LOGGER.debug("Received request in the controller to get training partners with maximum placement percentage in two years");
			LOGGER.debug("Sending the request to service");
			return industryDashboardService.getPlacementPercentageOfTopFiveTp();
		}
		
		catch(Exception e) {
			LOGGER.debug("An error occured while fetching the top five training partners");
			LOGGER.debug("Error:" +e);
			LOGGER.debug("Returning Null");
			return null;
		}
		
	}
}

