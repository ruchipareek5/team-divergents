package com.sih.msde.divergents.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sih.msde.divergents.dao.TpDashboardDao;

@Service
public class TpDashboardService {

	private static final Logger LOGGER = LoggerFactory.getLogger(TpDashboardService.class);
	
	@Autowired
	private TpDashboardDao tpDashboardDao;
	
	public Integer getTotalJobRoles()
	{
		return tpDashboardDao.getTotalJobRoles();
	}
	
	public Integer getTotalCandidatesTrained() 
	{
		return tpDashboardDao.getTotalCandidatesTrained();
	}
	
	public Integer getTotalTrainingPartners()
	{
		return tpDashboardDao.getTotalTrainingPartners();
	}
	
	public Integer getTotalSectorSkillCouncil()
	{
		return tpDashboardDao.getTotalSectorSkillCouncil();
	}
	
	public Integer getAnnualTarget()
	{
		return tpDashboardDao.getAnnualTarget();
	}
}
