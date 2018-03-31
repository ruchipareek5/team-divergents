package com.sih.msde.divergents.controller;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sih.msde.divergents.dto.ShowTendersDto;
import com.sih.msde.divergents.service.ShowTendersService;

@RestController
public class ShowTendersController {

	@Autowired
	private ShowTendersService showTendersService;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ShowTendersController.class);
	
	@RequestMapping("/getShowTenders")
	public Collection<ShowTendersDto> getShowTenders(@RequestParam("tenderNumber") String tenderNumber,@RequestParam("tenderTitle") String tenderTitle,@RequestParam("tenderCategory") String tenderCategory,@RequestParam("tenderDepartment") String tenderDepartment )
	{
		LOGGER.debug("Parameters received in the controller for fetching active tenders");
		return showTendersService.getShowTenders(tenderNumber, tenderTitle, tenderCategory, tenderDepartment);
	}
	
	@RequestMapping("/getshowTendersUsingTenderNumberTenderTitle")
	public Collection<ShowTendersDto> getshowTendersUsingTenderNumberTenderTitle(@RequestParam("tenderNumber") String tenderNumber,@RequestParam("tenderTitle") String tenderTitle)
	{
		LOGGER.debug("Parameters received in the controller to fetch Active Tenders");
		return showTendersService.getshowTendersUsingTenderNumberTenderTitle(tenderNumber, tenderTitle);
	}
	
	@RequestMapping("/getshowTendersUsingTenderNumberTenderTitleTenderDepartment")
	public Collection<ShowTendersDto> getshowTendersUsingTenderNumberTenderTitleTenderDepartment(@RequestParam("tenderNumber") String tenderNumber,@RequestParam("tenderTitle") String tenderTitle,@RequestParam("tenderDepartment") String tenderDepartment)
	{
		LOGGER.debug("Parameters received in controller to get the total active tenders");
		return showTendersService.getshowTendersUsingTenderNumberTenderTitleTenderDepartment(tenderNumber, tenderTitle, tenderDepartment);
	}
	
	@RequestMapping("/getshowTendersUsingTenderNumberTenderTitleTenderCategory")
	public Collection<ShowTendersDto> getshowTendersUsingTenderNumberTenderTitleTenderCategory(@RequestParam("tenderNumber") String tenderNumber,@RequestParam("tenderTitle") String tenderTitle,@RequestParam("tenderCategory") String tenderCategory)
	{
		LOGGER.debug("Parameters received in controller to get the total active tenders");
		return showTendersService.getshowTendersUsingTenderNumberTenderTitleTenderCategory(tenderNumber, tenderTitle, tenderCategory);
	}
}
