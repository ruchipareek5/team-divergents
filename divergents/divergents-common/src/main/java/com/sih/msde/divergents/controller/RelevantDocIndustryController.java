package com.sih.msde.divergents.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sih.msde.divergents.dto.RelevantDocIndustryDto;
import com.sih.msde.divergents.service.RelevantDocIndustryService;

@RestController
public class RelevantDocIndustryController {
	
	@Autowired
	private RelevantDocIndustryService relevantDocIndustryService;
	
	@RequestMapping(value="/getIndustryDocuments")
	public Collection<RelevantDocIndustryDto> getIndustryDocuments(@RequestParam("letter") String letter){
	    
		return relevantDocIndustryService.getRelevantDocIndustry(letter);
	}

}