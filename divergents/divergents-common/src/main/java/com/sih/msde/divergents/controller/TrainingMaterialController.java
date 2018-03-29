package com.sih.msde.divergents.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sih.msde.divergents.dto.JobOpeningsDto;
import com.sih.msde.divergents.dto.TrainingMaterialDto;
import com.sih.msde.divergents.service.TrainingMaterialService;

@RestController
public class TrainingMaterialController {
	
	@Autowired
	public TrainingMaterialService trainingMaterialService;
	
	@RequestMapping("/getalltrainingmaterial")
	public Collection<TrainingMaterialDto> getalltrainingMaterial(){
		return trainingMaterialService.getAllMaterial();
	}
	
	@RequestMapping(value="/gettrainingmaterialusingjobrole",method=RequestMethod.POST)
	public Collection<TrainingMaterialDto> getTrainingMaterialBasedOnJobrole(@RequestParam("jobrolename") String jobrolename) {
			return trainingMaterialService.getMaterialForJobRole(jobrolename);
		
	}

}
