package com.sih.msde.divergents.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sih.msde.divergents.dao.JobRoleDao;
import com.sih.msde.divergents.dto.JobRoleDto;


@Service
public class JobRoleService {
	
	@Autowired
	private JobRoleDao jobRoleDao;
	
	public Collection<JobRoleDto> getJobRoles(String letter){
		 return jobRoleDao.getJobRoleDetails(letter);
	}

}
