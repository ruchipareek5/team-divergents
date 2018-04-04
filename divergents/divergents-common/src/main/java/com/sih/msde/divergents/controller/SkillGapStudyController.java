package com.sih.msde.divergents.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sih.msde.divergents.dto.RecommendedCoursesDto;
import com.sih.msde.divergents.dto.SkillGapStudyDto;
import com.sih.msde.divergents.service.SkillGapStudyService;

@RestController
public class SkillGapStudyController {
	
	/*
	 * 
	 * Controller to get Skill Gap Study Analysis including Recommended Courses and skill gap report on the basis of state or district
	 * 
	 */	
	
	@Autowired
	private SkillGapStudyService skillGapStudyService;
	
	
	@RequestMapping(value="/getSkillGapStudyUsingStateandDistrict",method=RequestMethod.POST)
	public Collection<SkillGapStudyDto> getSkillGapStudyUsingStateandDistrict(@RequestParam("state") String state, @RequestParam("district") String district) {
			return skillGapStudyService.getSkillGapStudyusingStateandDistrict(state, district);
	}
	
	@RequestMapping(value="/getRecommendedCoursesUsingStateandDistrict")
	public Collection<RecommendedCoursesDto> getRecommendedCoursesUsingStateandDistrict(@RequestParam("state") String state, @RequestParam("district") String district) {
			return skillGapStudyService.getRecommendedCourseusingStateandDistrict(state, district);
	}
	
	
	@RequestMapping(value="/getSkillGapStudyUsingState",method=RequestMethod.POST)
	public Collection<SkillGapStudyDto> getSkillGapStudyUsingState(@RequestParam("state") String state) {
			return skillGapStudyService.getSkillGapStudyusingState(state);
	}
	
	@RequestMapping(value="/getRecommendedCourseUsingState")
	public Collection<RecommendedCoursesDto> getRecommendedCourseUsingState(@RequestParam("state") String state) {
			return skillGapStudyService.getRecommendedCourseusingState(state);
	}
	
	
	@RequestMapping(value="/getSkillGapStudyUsingDistrict",method=RequestMethod.POST)
	public Collection<SkillGapStudyDto> getSkillGapStudyUsingDistrict(@RequestParam("district") String district) {
		return skillGapStudyService.getSkillGapStudyusingDistrict(district);
	}
	
	@RequestMapping(value="/getRecommendedCourseUsingDistrict")
	public Collection<RecommendedCoursesDto> getRecommendedCourseUsingDistrict(@RequestParam("district") String district) {
		return skillGapStudyService.getRecommendedCourseusingDistrict(district);
	}

}
