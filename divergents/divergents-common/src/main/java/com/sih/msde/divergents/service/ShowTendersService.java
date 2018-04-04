package com.sih.msde.divergents.service;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sih.msde.divergents.dao.ShowTendersDao;
import com.sih.msde.divergents.dto.ShowTendersDto;

@Service
public class ShowTendersService {

	@Autowired
	private ShowTendersDao showTendersDao;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ShowTendersService.class);
	
	public Collection<ShowTendersDto> getShowTenders(String tenderNumber, String tenderTitle, String tenderCategory,  String tenderDepartment)
	{
		LOGGER.debug("Request received in the service from controllers to get active tenders");
		return showTendersDao.getShowTenders(tenderNumber, tenderTitle, tenderCategory, tenderDepartment);
	}
	
	public Collection<ShowTendersDto> getshowTendersUsingTenderNumberTenderTitle(String tenderNumber,String tenderTitle)
	{
		LOGGER.debug("Parameters received from controller to get active tenders");
		return showTendersDao.getshowTendersUsingTenderNumberTenderTitle(tenderNumber, tenderTitle);
	}
	
	public Collection<ShowTendersDto> getshowTendersUsingTenderNumberTenderTitleTenderDepartment(String tenderNumber,String tenderTitle,String tenderDepartment)
	{
		LOGGER.debug("Parameters received from controller to get active tenders");
		return showTendersDao.getshowTendersUsingTenderNumberTenderTitleTenderDepartment(tenderNumber, tenderTitle, tenderDepartment);
	}
	
	public Collection<ShowTendersDto> getshowTendersUsingTenderNumberTenderTitleTenderCategory(String tenderNumber,String tenderTitle,String tenderCategory)
	{
		LOGGER.debug("Parameters received from controller to get active tenders");
		return showTendersDao.getshowTendersUsingTenderNumberTenderTitleTenderCategory(tenderNumber, tenderTitle, tenderCategory);
	}
	
	public Collection<ShowTendersDto> getshowActiveTender()
	{
		LOGGER.debug("Request received in the service from controllers to get active tenders");
		return showTendersDao.getshowActiveTender();
	}
}
