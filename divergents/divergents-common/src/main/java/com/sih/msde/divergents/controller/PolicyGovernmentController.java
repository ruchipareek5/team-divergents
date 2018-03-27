package com.sih.msde.divergents.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sih.msde.divergents.dto.PolicyGovernmentDto;
import com.sih.msde.divergents.service.PolicyGovernmentService;

@RestController
public class PolicyGovernmentController {

	@Autowired
	private PolicyGovernmentService policyGovernmentService;
	
	
	
	@RequestMapping(value="/getPolicyforGovt")
	public Collection<PolicyGovernmentDto> getPolicyforGovt(@RequestParam("letter") String letter){
	
		return policyGovernmentService.getPolicy(letter);
	}
}
