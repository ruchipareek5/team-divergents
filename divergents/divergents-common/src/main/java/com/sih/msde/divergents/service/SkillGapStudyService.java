package com.sih.msde.divergents.service;

import java.util.Collection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sih.msde.divergents.dao.SkillGapStudyDao;
import com.sih.msde.divergents.dto.SkillGapStudyDto;

@Service
public class SkillGapStudyService {
	
	@Autowired
	private SkillGapStudyDao skillGapStudyDao;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SkillGapStudyService.class);
	
	
	public Collection<SkillGapStudyDto> getSkillGapStudyusingStateandDistrict(String state, String district){
		try {
			
			LOGGER.debug("Controller has requested Service to get SkillGap Study using State and District");
			
			return skillGapStudyDao.getSkillReportusingStateandDistrict(state, district);
			
		} catch (Exception e) {
			
			LOGGER.debug("An error occured while service process the request by Controller to get SkillGap Study using State and District" + e);
			
			return null;
		}
	}
	
	public Collection<SkillGapStudyDto> getSkillGapStudyusingDistrict(String district){
		try {
			
			LOGGER.debug("Controller has requested Service to get the skill gap study using district");
			
			return skillGapStudyDao.getSkillReportusingDistrict(district);
			
		} catch (Exception e) {
			
			LOGGER.debug("An error occured while service process the request by Controller to get the skill gap study using district" + e);
			
			return null;
		}
	}
	
	public Collection<SkillGapStudyDto> getSkillGapStudyusingState(String state){
		try {
			
			LOGGER.debug("Controller has requested Service to get Skill gap study using state");
			
			return skillGapStudyDao.getSkillReportusingState(state);
			
		} catch (Exception e) {
			
			LOGGER.debug("An error occured while service process the request by Controller to get Skill gap study using state" + e);
			
			return null;
		}
	}


	
	

}
