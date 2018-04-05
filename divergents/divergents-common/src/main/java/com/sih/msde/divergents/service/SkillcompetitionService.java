package com.sih.msde.divergents.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sih.msde.divergents.dao.SkillCompetitionDao;
import com.sih.msde.divergents.dto.SkillcompetitionDto;

@Service
public class SkillcompetitionService {

	private static final Logger LOGGER = LoggerFactory.getLogger(SkillcompetitionService.class);
@Autowired
	private SkillCompetitionDao skillcompetitionDao;
	
   public int Skillcompetitionforsubmit(SkillcompetitionDto skillcompetitionDto) {
	int skillcompetitionsubmitStatus;
	
    skillcompetitionsubmitStatus = skillcompetitionDao.submitskillcompetition(skillcompetitionDto.getparticipantName(),skillcompetitionDto.getparticipantEmail(), skillcompetitionDto.getparticipantAddress(), skillcompetitionDto.getparticipantAge(), skillcompetitionDto.getskillSector(),skillcompetitionDto.getskillSectorCategory());
	
	
	return skillcompetitionsubmitStatus;
}


}
	