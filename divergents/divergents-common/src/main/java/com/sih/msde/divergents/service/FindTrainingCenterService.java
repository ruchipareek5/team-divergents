package com.sih.msde.divergents.service;

import java.util.Collection;

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
	
	public Collection<FindSpecifiedTrainingCenterDto> findtrainingCenterwithSpecifiedDetails(FindTrainingCenterDetailsDto findTrainingCenterDetailsDto){
		
		return findTrainingCenterDao.getTrainingCenterwithSpecifiedDetails(findTrainingCenterDetailsDto.getState(), findTrainingCenterDetailsDto.getDistrict(), findTrainingCenterDetailsDto.getBlock(), findTrainingCenterDetailsDto.getSector(), findTrainingCenterDetailsDto.getJobrole());
	}
	
	public Collection<GetStatesDto> getstatesData(){
		return getstateFindTrainingCenterDao.getallthestates();
	}
	
	public Collection<GetDistrictsDto> getDistrictsData(){
		return getDistrictFindTrainingCenterDao.getallthedistricts();
	}
	
	public Collection<GetBlockDto> getBlockData(){
		return getBlockFindTrainngCenterDao.getalltheblocks();
	}
	public Collection<GetSectorDto> getSectorData(){
	return getSectorFindTrainingCenterDao.getallthesectors();
	}
	
	public Collection<GetJobRoleDto> getJobRoleData(){
		return getJobRoleFindTrainingCenterDao.getallthejobroles();
	}
}
