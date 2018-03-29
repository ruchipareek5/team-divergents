package com.sih.msde.divergents.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.sih.msde.divergents.dto.TalentAcquisitionDto;
import com.sih.msde.divergents.service.TalentAcquisitionService;

@RestController
public class TalentAcquisitionController {
	
	@Autowired
	public TalentAcquisitionService talentAcquisitionService;
	
	@RequestMapping(value="/getCandidatedForEnteredJobRole")
	public Collection<TalentAcquisitionDto> getCandidatedForEnteredJobRole(@RequestParam("jobrolename") String jobrolename){
	
		return talentAcquisitionService.getCandidatesForJobRole(jobrolename);
	}

}
