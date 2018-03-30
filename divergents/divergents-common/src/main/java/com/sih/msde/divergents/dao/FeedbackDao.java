package com.sih.msde.divergents.dao;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sih.msde.divergents.common.AbstractTransactionalDao;
import com.sih.msde.divergents.config.FeedbackConfig;
import com.sih.msde.divergents.dto.FeedbackDto;

@Repository
public class FeedbackDao extends AbstractTransactionalDao{
	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(FeedbackDao.class);
	@Autowired
	private  FeedbackConfig feedbackConfig;

	int feedBackSubmitStatus=0;
	
	public Integer submitFeedback(FeedbackDto feedbackDto)
	{
		try {
			LOGGER.debug("Request received from service submit Feedback");
			LOGGER.debug("Print feedback dto" + feedbackDto);
			Map<String,Object> parameters = new HashMap<>();
			
			parameters.put("name",feedbackDto.getName() );
			parameters.put("aadharnumber",feedbackDto.getAadharnumber());
			parameters.put("email", feedbackDto.getEmail());
			parameters.put("suggestion", feedbackDto.getSuggestion());
			
			LOGGER.debug("Trying to insert the parameters into the database");
			feedBackSubmitStatus = getJdbcTemplate().update(feedbackConfig.getInsertfeedback(), parameters);
			return feedBackSubmitStatus;
		}
		catch(Exception e) {
		
			LOGGER.debug("An exception occured while inserting feedback into the database" +e);
			return feedBackSubmitStatus;
		}
		
	}
	
	

}
