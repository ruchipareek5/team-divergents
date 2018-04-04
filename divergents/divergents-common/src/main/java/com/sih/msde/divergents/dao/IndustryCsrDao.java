package com.sih.msde.divergents.dao;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sih.msde.divergents.common.AbstractTransactionalDao;
import com.sih.msde.divergents.config.IndustryCsrConfigSql;
import com.sih.msde.divergents.dto.IndustryCsrDto;

@Repository
public class IndustryCsrDao extends AbstractTransactionalDao{

	private static final Logger LOGGER = LoggerFactory.getLogger(IndustryCsrDao.class);
	@Autowired
	private IndustryCsrConfigSql industryCsrConfigSql;
	
	int submitStatus;
	public int submitForCsr(IndustryCsrDto industryCsrDto)
	{
		try {
			LOGGER.debug("Received Request from service to insert details into the database");
			Map<String,Object> parameters = new HashMap<>();
			LOGGER.debug("Creating hashmap of objects");
			parameters.put("orgName",industryCsrDto.getorgName());
			parameters.put("pocName",industryCsrDto.getpocName());
			parameters.put("contactNumber",industryCsrDto.getcontactNumber());
			parameters.put("selectedModel",industryCsrDto.getselectedModel());
			parameters.put("amount",industryCsrDto.getamount());
			LOGGER.debug("Trying to insert the parameters into the database");
		 submitStatus = getJdbcTemplate().update(industryCsrConfigSql.getcontributeInCsr(), parameters);
		return submitStatus;
			
		}
		catch(Exception e)
		{
			LOGGER.debug("An exception occured while inserting values in the database" +e);
			LOGGER.debug("ERROR!");
			LOGGER.debug("Returning submitStatus");
			return submitStatus;
		}
	}
	
}

