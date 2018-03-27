package com.sih.msde.divergents.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sih.msde.divergents.dao.PolicyGovernmentDao;
import com.sih.msde.divergents.dto.PolicyGovernmentDto;

@Service
public class PolicyGovernmentService {
	
	@Autowired
	private PolicyGovernmentDao policyGovernmentDao;
	

	public Collection<PolicyGovernmentDto> getPolicy(String letter) {
		return policyGovernmentDao.getPolicyDetails(letter);
	}

}
