package com.sih.msde.divergents.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.sih.msde.divergents.dto.JobRoleDto;
import com.sih.msde.divergents.dto.TrainingCenterAccordingToJobRoleDto;
import com.sih.msde.divergents.service.JobRoleService;

@RestController
public class JobRoleController {

	@Autowired
	private JobRoleService jobRoleService;
	
	
	
	@RequestMapping(value="/getJobRoleForSelectedLetter")
	public Collection<JobRoleDto> getJobRolesForSelectedLetter(@RequestParam("letter") String letter){
	
		return jobRoleService.getJobRoles(letter);
	}
	
	@RequestMapping(value="/getTrainingCenterforJobRole",method=RequestMethod.POST)
	public Collection<TrainingCenterAccordingToJobRoleDto> getTrainingCenterforJobRole(@RequestParam("jobroleId") String jobroleId){
		return jobRoleService.gettrainingCenters(jobroleId);
	}
	
}
