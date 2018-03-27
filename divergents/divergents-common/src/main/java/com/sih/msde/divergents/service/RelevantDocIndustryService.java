package com.sih.msde.divergents.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sih.msde.divergents.dao.RelevantDocIndustryDao;
import com.sih.msde.divergents.dto.RelevantDocIndustryDto;

@Service
public class RelevantDocIndustryService {

	@Autowired
	private  RelevantDocIndustryDao relevantDocIndustryDao;

	public Collection<RelevantDocIndustryDto> getRelevantDocIndustry(String letter) {
		return relevantDocIndustryDao.getRelevantDocIndustryDetails(letter);
	}
}
