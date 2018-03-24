package com.sih.msde.divergents.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sih.msde.divergents.dto.FindSpecifiedTrainingCenterDto;
import com.sih.msde.divergents.dto.FindTrainingCenterDetailsDto;
import com.sih.msde.divergents.dto.GetStatesDto;
import com.sih.msde.divergents.service.FindTrainingCenterService;

@RestController
public class PublicUserFindTrainingCenterController {
	
	@Autowired
	private FindTrainingCenterService findTrainingCenterService;

	
	@RequestMapping("/getallStates")
	public Collection<GetStatesDto> getalltheStates(){
		return findTrainingCenterService.getstatesData();
	}
	
	
	@RequestMapping(value="/findTC",method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE)
	public Collection<FindSpecifiedTrainingCenterDto> findtrainingcentercontrol(@RequestBody FindTrainingCenterDetailsDto findTrainingCenterDetailsDto){
		return findTrainingCenterService.findtrainingCenterwithSpecifiedDetails(findTrainingCenterDetailsDto);
	}

}
