package com.sih.msde.divergents.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sih.msde.divergents.dto.FeedbackDto;
import com.sih.msde.divergents.service.FeedbackService;

import ch.qos.logback.classic.Logger;

@RestController
public class FeedbackController {
	
	@Autowired
	private FeedbackService feedbackService;
	
	
	
	
	
	
	@RequestMapping(value="/submitFeedback",method=RequestMethod.POST,consumes=MediaType.ALL_VALUE)
	public Integer submitthefeedback(@RequestParam("name") String name, @RequestParam("aadharnumber") String aadharnumber, @RequestParam("email") String email, @RequestParam("suggestion") String suggestion){
		FeedbackDto feedbackDto = new FeedbackDto(name,aadharnumber,email,suggestion);
		feedbackDto.setName(name);
		feedbackDto.setAadharnumber(aadharnumber);
		feedbackDto.setEmail(email);
		feedbackDto.setSuggestion(suggestion);
		return feedbackService.submitFeedback(feedbackDto);
	}
	
	
	
	

}
