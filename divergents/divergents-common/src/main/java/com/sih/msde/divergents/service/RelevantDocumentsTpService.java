package com.sih.msde.divergents.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sih.msde.divergents.dao.RelevantDocumentsTpDao;
import com.sih.msde.divergents.dto.RelevantDocumentsTpDto;



@Service
public class  RelevantDocumentsTpService {

	@Autowired
	private  RelevantDocumentsTpDao relevantDocumentsTpDao;

	public Collection<RelevantDocumentsTpDto> getPolicyTp(String letter) {
		return relevantDocumentsTpDao.getRelevantDocumentsTpDetails(letter);
	}


}

