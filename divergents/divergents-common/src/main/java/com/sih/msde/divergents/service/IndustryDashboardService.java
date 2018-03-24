package com.sih.msde.divergents.service;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sih.msde.divergents.dao.IndustryDashboardDao;
import com.sih.msde.divergents.dao.PlacementPercentageOfTopFiveTp;
import com.sih.msde.divergents.dao.TopFiveCorporatesWithMaxCsrContributions;
import com.sih.msde.divergents.dto.PlacementPercentageOfTopFiveTpDto;
import com.sih.msde.divergents.dto.TopFiveCorporatesWithMaxCsrContributionsDto;

@Service
public class IndustryDashboardService {

	private static final Logger LOGGER = LoggerFactory.getLogger(IndustryDashboardService.class);
	@Autowired
	private IndustryDashboardDao industryDashboardDao;
	
	@Autowired
	private TopFiveCorporatesWithMaxCsrContributions topFiveCorporatesWithMaxCsrContributions;
	
	@Autowired
	private PlacementPercentageOfTopFiveTp placementPercentageOfTopFiveTp;
	
	public Integer getTotalPartnerships()
	{
		return industryDashboardDao.getTotalPartnerships();				
	}
	
	public Integer getTotalCsrFunds()
	{
		return industryDashboardDao.getTotalCsrFunds();
	}
	
	public Integer getTotalCandidatesCertified()
	{
		return industryDashboardDao.getTotalCandidatesCertified();
	}
	
	public Integer getTotalJobRoles()
	{
		return industryDashboardDao.getTotalJobRoles();
	}
	
	public Integer getTotalTrainingPartners()
	{
		return industryDashboardDao.getTotalTrainingPartners();
	}
	
	public Collection<TopFiveCorporatesWithMaxCsrContributionsDto> getTopFiveCorporates()
	{
		return topFiveCorporatesWithMaxCsrContributions.getTopFiveCorporates();
	}
	
	public Collection<PlacementPercentageOfTopFiveTpDto> getPlacementPercentageOfTopFiveTp(String jobRole){
		try {
			LOGGER.debug("Received request parameter jobRole from controller " +jobRole);
			return placementPercentageOfTopFiveTp.getPlacementPercentageOfTopFiveTp(jobRole);
		}
		catch(Exception e)
		{
			LOGGER.debug("An exception occured while fetching top 5 training partners according to job role");
			return null;
		}
	}
}
