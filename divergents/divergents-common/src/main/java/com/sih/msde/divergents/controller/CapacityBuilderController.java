package com.sih.msde.divergents.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sih.msde.divergents.dto.CapacityBuilderDto;
import com.sih.msde.divergents.service.CapacityBuilderService;

@RestController
public class CapacityBuilderController {
	
	@Autowired
	private CapacityBuilderService capacityBuilderService;
	
	@RequestMapping("/getallUpcomingTrainingsForTrainingPartner")
	public Collection<CapacityBuilderDto> getallUpcomingTrainingsForTrainingPartner(){
		return capacityBuilderService.getAllTrainingsForTrainingPartner();
	}
	
	@RequestMapping("/getallUpcomingTrainingsForAssessmentBody")
	public Collection<CapacityBuilderDto> getallUpcomingTrainingsForAssessmentBody(){
		return capacityBuilderService.getAllTrainingsForAssessmentBody();
	}

}
