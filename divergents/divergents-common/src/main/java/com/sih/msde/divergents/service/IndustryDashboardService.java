package com.sih.msde.divergents.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sih.msde.divergents.dao.IndustryDashboardDao;

@Service
public class IndustryDashboardService {

	private static final Logger LOGGER = LoggerFactory.getLogger(IndustryDashboardService.class);
	@Autowired
	private IndustryDashboardDao industryDashboardDao;
	
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
}
