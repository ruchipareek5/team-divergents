package com.sih.msde.divergents.service;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sih.msde.divergents.dao.FindTrainingCenterDao;
import com.sih.msde.divergents.dao.GetBlockFindTrainngCenterDao;
import com.sih.msde.divergents.dao.GetDistrictFindTrainingCenterDao;
import com.sih.msde.divergents.dao.GetJobRoleFindTrainingCenterDao;
import com.sih.msde.divergents.dao.GetSectorFindTrainingCenterDao;
import com.sih.msde.divergents.dao.GetstateFindTrainingCenterDao;
import com.sih.msde.divergents.dto.FindSpecifiedTrainingCenterDto;
import com.sih.msde.divergents.dto.FindTrainingCenterDetailsDto;
import com.sih.msde.divergents.dto.GetBlockDto;
import com.sih.msde.divergents.dto.GetDistrictsDto;
import com.sih.msde.divergents.dto.GetJobRoleDto;
import com.sih.msde.divergents.dto.GetSectorDto;
import com.sih.msde.divergents.dto.GetStatesDto;

@Service
public class FindTrainingCenterService {

	@Autowired
	private FindTrainingCenterDao findTrainingCenterDao;
	
	@Autowired
	private GetstateFindTrainingCenterDao getstateFindTrainingCenterDao;
	
	@Autowired
	private GetDistrictFindTrainingCenterDao getDistrictFindTrainingCenterDao;
	
	@Autowired
	private GetBlockFindTrainngCenterDao getBlockFindTrainngCenterDao;
	
	@Autowired
	private GetSectorFindTrainingCenterDao getSectorFindTrainingCenterDao;
	
	@Autowired
	private GetJobRoleFindTrainingCenterDao getJobRoleFindTrainingCenterDao;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(FindTrainingCenterService.class);
	
	public Collection<FindSpecifiedTrainingCenterDto> findtrainingCenterwithSpecifiedDetails(FindTrainingCenterDetailsDto findTrainingCenterDetailsDto){
		
		try {
			LOGGER.debug("Request received from controller to get all training centers details according to specified parameters");
			
			return findTrainingCenterDao.getTrainingCenterwithSpecifiedDetails(findTrainingCenterDetailsDto.getState(), findTrainingCenterDetailsDto.getDistrict(), findTrainingCenterDetailsDto.getBlock(), findTrainingCenterDetailsDto.getSector(), findTrainingCenterDetailsDto.getJobrole());
		} catch (Exception e) {
			
			LOGGER.debug("An eroor occurd while getting the training center details according to specified parameters" + e);
			
			return null;
		}
	}
	
	public Collection<GetStatesDto> getstatesData(){
		try {
			
			LOGGER.debug("Request received from controller to get all the states where training centers exist");
			
			return getstateFindTrainingCenterDao.getallthestates();
		} 
		
		catch (Exception e) {
			
			LOGGER.debug("An error occured while processing the request of controller for getting all the states where training centers exist " + e);
			return null;
		}
	}
	
	public Collection<GetDistrictsDto> getDistrictsData(){
		try {
			
			LOGGER.debug("Request received from controller to get all the districts where training centers exist");
			
			return getDistrictFindTrainingCenterDao.getallthedistricts();
		} catch (Exception e) {
			
			LOGGER.debug("An error occured while processing the request of controller for getting all the districts where training centers exist" + e);
			return null;
			
		}
	}
	
	public Collection<GetBlockDto> getBlockData(){
		try {
			
			LOGGER.debug("Request received from controller to get all the block where training centers exist");
			
			return getBlockFindTrainngCenterDao.getalltheblocks();
		} catch (Exception e) {
			
			LOGGER.debug("An error occured while processing the request of controller for getting all the Block where training centers exist" + e);
			return null;
			
		}
	}
	public Collection<GetSectorDto> getSectorData(){
	try {
		
		LOGGER.debug("Request received from controller to get all the sectors where training centers exist");
		
		return getSectorFindTrainingCenterDao.getallthesectors();
	} catch (Exception e) {
		
		LOGGER.debug("An error occured while processing the request of controller for getting all the sectors where training centers exist");
		return null;
	}
	}
	
	public Collection<GetJobRoleDto> getJobRoleData(){
		try {
			
			LOGGER.debug("Request received from controller to get all the Job Role where training centers exist");
			
			return getJobRoleFindTrainingCenterDao.getallthejobroles();
		} catch (Exception e) {
			
			LOGGER.debug("An error occured while processing the request of controller for getting all the Job Roles where training centers exist" + e);
			return null;
		}
	}
}
