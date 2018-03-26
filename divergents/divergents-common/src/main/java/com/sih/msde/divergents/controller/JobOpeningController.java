package com.sih.msde.divergents.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sih.msde.divergents.dto.GetStatesDto;
import com.sih.msde.divergents.dto.JobOpeningsDto;
import com.sih.msde.divergents.service.JobOpeningsService;

@RestController
public class JobOpeningController {
	
	@Autowired
	private JobOpeningsService jobOpeningsService;
	
	@RequestMapping("/getallJobOpenings")
	public Collection<JobOpeningsDto> getallJobOpenings(){
		return jobOpeningsService.getAllJobOpenings();
	}
	
	@RequestMapping(value="/getJobOpeningsUsingJobRoleandLocation",method=RequestMethod.POST)
	public Collection<JobOpeningsDto> getJobOpeningsUsingJobRoleandLocation(@RequestParam("jobrolename") String jobrolename, @RequestParam("location") String location) {
			return jobOpeningsService.getJobOpeningsusingJobRoleandLocation(jobrolename, location);
		
	}
	
	@RequestMapping(value="/getJobOpeningsUsingLocation",method=RequestMethod.POST)
	public Collection<JobOpeningsDto> getJobOpeningsUsingLocation(@RequestParam("location") String location) {
		
			return jobOpeningsService.getJobOpeningsusingLocation(location);
		
	}
	
	@RequestMapping(value="/getJobOpeningsUsingJobRole",method=RequestMethod.POST)
	public Collection<JobOpeningsDto> getJobOpeningsUsingJobRole(@RequestParam("jobrolename") String jobrolename) {
		
			return jobOpeningsService.getJobOpeningsusingJobRole(jobrolename);
		
	}

}
