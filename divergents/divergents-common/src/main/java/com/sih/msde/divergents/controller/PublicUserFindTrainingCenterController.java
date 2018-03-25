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
import com.sih.msde.divergents.dto.GetBlockDto;
import com.sih.msde.divergents.dto.GetDistrictsDto;
import com.sih.msde.divergents.dto.GetJobRoleDto;
import com.sih.msde.divergents.dto.GetSectorDto;
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
	
	@RequestMapping("/getallDistrict")
	public Collection<GetDistrictsDto> getalltheDistrict(){
		return findTrainingCenterService.getDistrictsData();
	}
	
	@RequestMapping("/getallBlocks")
	public Collection<GetBlockDto> getalltheBlock(){
		return findTrainingCenterService.getBlockData();
	}
	
	@RequestMapping("/getallSectors")
	public Collection<GetSectorDto> getalltheSector(){
		return findTrainingCenterService.getSectorData();
	}
	
	@RequestMapping("/getallJobRoles")
	public Collection<GetJobRoleDto> getalltheJobRoles(){
		return findTrainingCenterService.getJobRoleData();
	}
	
	@RequestMapping(value="/findTC",method=RequestMethod.POST,consumes=MediaType.ALL_VALUE)
	public Collection<FindSpecifiedTrainingCenterDto> findtrainingcentercontrol(@RequestBody FindTrainingCenterDetailsDto findTrainingCenterDetailsDto){
		return findTrainingCenterService.findtrainingCenterwithSpecifiedDetails(findTrainingCenterDetailsDto);
	}

}
