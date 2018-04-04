package com.sih.msde.divergents.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sih.msde.divergents.dto.SkillcompetitionDto;
import com.sih.msde.divergents.service.SkillcompetitionService;


@RestController
public class SkillcompetitionController {
	private static final Logger LOGGER = LoggerFactory.getLogger(RplInterestExpressionController.class);

	@Autowired
	private SkillcompetitionService skillcompetitionService;
	 int skillcompetitionsubmitStatus ;
	
	@RequestMapping(value="/submitSkillcompetition",method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE)
	public Integer submittheskillcompetition(@RequestBody SkillcompetitionDto skillCompetitionDto){
		
		try {
			LOGGER.debug("Request received from front end to submit  the skill competition form" +SkillcompetitionDto());
			skillcompetitionsubmitStatus = skillcompetitionService.Skillcompetitionforsubmit(skillCompetitionDto);
			
			System.out.println(skillCompetitionDto.getparticipantName());
			
			return skillcompetitionsubmitStatus;
		} catch (Exception e) {
			// TODO Auto-generated catch block
		
		

		LOGGER.debug("An exception occurs in the form" +e);
		return skillcompetitionsubmitStatus;
	}

	}

	private String SkillcompetitionDto() {
		// TODO Auto-generated method stub
		return null;
	}
	}


