package com.sih.msde.divergents.dao;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.sih.msde.divergents.common.AbstractTransactionalDao;
import com.sih.msde.divergents.config.SkillcompetitionConfig;
import com.sih.msde.divergents.dto.SkillcompetitionDto;

@Repository 	
public class SkillCompetitionDao extends AbstractTransactionalDao {

	private static final Logger LOGGER = LoggerFactory.getLogger(SkillCompetitionDao.class);
	
	@Autowired
	private SkillcompetitionConfig skillcompetitionConfig;
	
	int skillcompetitionsubmitStatus;
	public int submitskillcompetition(String participantName, String participantEmail, String participantAddress, String participantAge, String skillSector, String skillSectorCategory){
		try {
			LOGGER.debug("Received Request from service to insert details into the database" );
			
		    Map<String,Object> parameters = new HashMap<>();
			LOGGER.debug("Creating hashmap of objects");
			parameters.put("participantName", participantName);
			parameters.put("participantEmail",participantEmail);
			parameters.put("participantAddress",participantAddress);
			parameters.put("participantAge",participantAge);
			parameters.put("skillSector",skillSector);
			parameters.put("skillSectorCategory",skillSectorCategory);
			
			
		return skillcompetitionsubmitStatus = getJdbcTemplate().update(skillcompetitionConfig.getSkillcompetitionforsubmit(), parameters);
		} 
		catch (Exception e) {
			
			LOGGER.debug("An exception occurs in database while inserting" +e);
			LOGGER.debug("Error message");
			LOGGER.debug("Skill Competiton Status submit");
			
			return 0;
		}
		
	}
}
