package com.sih.msde.divergents.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sih.msde.divergents.dao.ReportGovernmentDao;
import com.sih.msde.divergents.dto.ReportGovernmentDto;

@Service
	public class ReportGovernmentService{
	
	@Autowired
	private ReportGovernmentDao reportGovernmentDao;
	
	public Collection<ReportGovernmentDto> getgovReport(String letter) {
		return reportGovernmentDao.getGovReportDetails(letter);
	}

}
