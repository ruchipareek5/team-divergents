package com.sih.msde.divergents.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sih.msde.divergents.dao.FeedbackDao;
import com.sih.msde.divergents.dto.FeedbackDto;

@Service
public class FeedbackService {
	
	@Autowired
	public FeedbackDao feedbackDao;
	
	public Integer submitFeedback(FeedbackDto feedbackDto) {
		return feedbackDao.submitFeedback(feedbackDto);
	}

}
