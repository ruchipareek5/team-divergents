package com.sih.msde.divergents.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sih.msde.divergents.dto.RelevantDocumentsTpDto;
import com.sih.msde.divergents.service.RelevantDocumentsTpService;



@RestController
public class RelevantDocumentsTpController {

	@Autowired
	private RelevantDocumentsTpService relevantDocumentsTpService;
	
	
	
	@RequestMapping(value="/getPolicyForSelectedLetter")
	public Collection<RelevantDocumentsTpDto> getPolicyForSelectedLetter(@RequestParam("letter") String letter){
	
		return relevantDocumentsTpService.getPolicyTp(letter);
	}

	
}