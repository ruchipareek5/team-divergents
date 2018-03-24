package com.sih.msde.divergents.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sih.msde.divergents.dao.FindTrainingCenterDao;
import com.sih.msde.divergents.dao.GetstateFindTrainingCenterDao;
import com.sih.msde.divergents.dto.FindSpecifiedTrainingCenterDto;
import com.sih.msde.divergents.dto.FindTrainingCenterDetailsDto;
import com.sih.msde.divergents.dto.GetStatesDto;

@Service
public class FindTrainingCenterService {

	private static final String NULL = null;
	@Autowired
	private FindTrainingCenterDao findTrainingCenterDao;
	private GetstateFindTrainingCenterDao getstateFindTrainingCenterDao;
	
	public Collection<FindSpecifiedTrainingCenterDto> findtrainingCenterwithSpecifiedDetails(FindTrainingCenterDetailsDto findTrainingCenterDetailsDto){
		
		if(findTrainingCenterDetailsDto.getBlock()==NULL && findTrainingCenterDetailsDto.getJobrole()==NULL && findTrainingCenterDetailsDto.getSector()==NULL) {
		
		return findTrainingCenterDao.getTrainingCenterwithSpecifiedDetails(findTrainingCenterDetailsDto.getState(), findTrainingCenterDetailsDto.getDistrict(), findTrainingCenterDetailsDto.getBlock(), findTrainingCenterDetailsDto.getSector(), findTrainingCenterDetailsDto.getJobrole());
		}
		return null; 
	}
	
	public Collection<GetStatesDto> getstatesData(){
		return getstateFindTrainingCenterDao.getallthestates();
	}
}
