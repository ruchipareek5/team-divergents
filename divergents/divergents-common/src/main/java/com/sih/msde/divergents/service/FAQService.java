package com.sih.msde.divergents.service;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.sih.msde.divergents.dao.FAQBatchWiseCandidateDetailsDao;
import com.sih.msde.divergents.dao.FAQCandidatesEnrolledAssessedCertifiedMonthWiseDao;
import com.sih.msde.divergents.dao.FAQCandidatesTrainedAssessedCertifiedDao;
import com.sih.msde.divergents.dao.FAQQuestionsCommonDao;
import com.sih.msde.divergents.dao.FAQStatusOfAParticularBatchWithIdDao;
import com.sih.msde.divergents.dao.FAQTotalBatchesWithTotalCandidatesEnrolledYearWiseDao;
import com.sih.msde.divergents.dao.FAQTotalNumberOfBatchesAndTotalEnrolledInAParticularStateDao;
import com.sih.msde.divergents.dao.FAQTrainingCentresNotTakingAnyBatchesDao;
import com.sih.msde.divergents.dto.FAQBatchWiseCandidateDetailsDto;
import com.sih.msde.divergents.dto.FAQCandidatesEnrolledAssessedCertifiedMonthWiseDto;
import com.sih.msde.divergents.dto.FAQCandidatesTrainedAssessedCertifiedDto;
import com.sih.msde.divergents.dto.FAQStatusOfAParticularBatchWithIdDto;
import com.sih.msde.divergents.dto.FAQTotalBatchesWithTotalCandidatesEnrolledMonthWiseDto;
import com.sih.msde.divergents.dto.FAQTotalNumberOfBatchesAndTotalEnrolledInAParticularStateDto;
import com.sih.msde.divergents.dto.FAQTrainingCentresNotTakingAnyBatchesDto;


@Service
public class FAQService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(FAQService.class);
	
	@Autowired
	private FAQCandidatesTrainedAssessedCertifiedDao fAQCandidatesTrainedAssessedCertifiedDao;
	
	@Autowired
	private FAQQuestionsCommonDao fAQQuestionCommonDao;
	
	@Autowired
	private FAQTotalBatchesWithTotalCandidatesEnrolledYearWiseDao fAQTotalBatchesWithTotalCandidatesEnrolledYearWiseDao;
	
	@Autowired
	private FAQStatusOfAParticularBatchWithIdDao fAQStatusOfAParticularBatchWithIdDao;
	
	@Autowired
	private FAQBatchWiseCandidateDetailsDao fAQBatchWiseCandidateDetailsDao;
	
	@Autowired
	private FAQCandidatesEnrolledAssessedCertifiedMonthWiseDao fAQCandidatesEnrolledAssessedCertifiedMonthWiseDao;
	
	@Autowired
	private FAQTotalNumberOfBatchesAndTotalEnrolledInAParticularStateDao fAQTotalNumberOfBatchesAndTotalEnrolledInAParticularStateDao;
	
	@Autowired
	private FAQTrainingCentresNotTakingAnyBatchesDao fAQTrainingCentresNotTakingAnyBatchesDao;
	
	public Collection<FAQCandidatesTrainedAssessedCertifiedDto> getTotalCandidatesTrainedAssessedCertifiedDao() {
		LOGGER.debug("Request Received from Controller");
		LOGGER.debug("In FAQService - getTotalCandidatesTrainedAssessedCertifiedDao");
		LOGGER.debug("Making a Request to Dao to get data");
		return fAQCandidatesTrainedAssessedCertifiedDao.getTotalCandidatesTrainedAssessedCertified();
	}
	
	public Collection<FAQCandidatesTrainedAssessedCertifiedDto> getTotalCandidatesTrainedAssessedCertifiedSchemeWise(String batchType) {
		LOGGER.debug("Request Received from Controller");
		LOGGER.debug("In FAQService - getTotalCandidatesTrainedAssessedCertifiedSchemeWise");
		LOGGER.debug("Parameters Received from front end are - 'batchType': "+batchType);
		LOGGER.debug("Making a Request to Dao to get data");
		return fAQCandidatesTrainedAssessedCertifiedDao.getTotalCandidatesTrainedAssessedCertifiedSchemeWise(batchType);
	}
	
	public Integer getTotalTrainingCentresInAState(String state) {
		LOGGER.debug("Request Received from Controller");
		LOGGER.debug("In FAQService - getTotalTrainingCentresInAState");
		LOGGER.debug("Parameters Received from front end are - 'state': "+state);
		LOGGER.debug("Making a Request to Dao to get data");
		return fAQQuestionCommonDao.getTotalTrainingCentresInAState(state);
	}

	public Integer getCountOfTotalTrainingCentresConductingTraining() {
		LOGGER.debug("Request Received from Controller");
		LOGGER.debug("In FAQService - getCountOfTotalTrainingCentresConductingTraining");
		LOGGER.debug("Making a Request to Dao to get data");
		return fAQQuestionCommonDao.getCountOfTotalTrainingCentresConductingTraining();
	}
	
	public Integer getCountOfCandidatesAssessmentUpcomingForAMonth(String month) {
		LOGGER.debug("Request Received from Controller");
		LOGGER.debug("In FAQService - getCountOfCandidatesAssessmentUpcomingForAMonth");
		LOGGER.debug("Parameters Received from front end are - 'month': "+month);
		LOGGER.debug("Making a Request to Dao to get data");
		return fAQQuestionCommonDao.getCountOfCandidatesAssessmentUpcomingForAMonth(month);
	}
	
	public String getNameOfAgencyToWhichABatchIsAssigned(Integer batchId)throws EmptyResultDataAccessException {
		LOGGER.debug("Request Received from Controller");
		LOGGER.debug("In FAQService - getNameOfAgencyToWhichABatchIsAssigned");
		LOGGER.debug("Parameters Received from front end are - 'batchId': "+batchId);
		LOGGER.debug("Making a Request to Dao to get data");
		return fAQQuestionCommonDao.getNameOfAgencyToWhichABatchIsAssigned(batchId);
	}
	
	public Integer getTotalCountOfBatchesAssignedToAAssessmentAgency(String agencyName)throws EmptyResultDataAccessException {
		LOGGER.debug("Request Received from Controller");
		LOGGER.debug("In FAQService - getTotalCountOfBatchesAssignedToAAssessmentAgency");
		LOGGER.debug("Parameters Received from front end are - 'agencyName': "+agencyName);
		LOGGER.debug("Making a Request to Dao to get data");
		return fAQQuestionCommonDao.getTotalCountOfBatchesAssignedToAAssessmentAgency(agencyName);
	}
	
	public Collection<FAQTotalNumberOfBatchesAndTotalEnrolledInAParticularStateDto> getCountOfTotalNumberOfBatchesAndTotalEnrolledInAParticularState(String state) {
		LOGGER.debug("Request Received from Controller");
		LOGGER.debug("In FAQService - getCountOfTotalNumberOfBatchesAndTotalEnrolledInAParticularState");
		LOGGER.debug("Parameters Received from front end are - 'state': "+state);
		LOGGER.debug("Making a Request to Dao to get data");
		return fAQTotalNumberOfBatchesAndTotalEnrolledInAParticularStateDao.getCountOfTotalNumberOfBatchesAndTotalEnrolledInAParticularState(state);
	}
	
	public Collection<FAQTotalNumberOfBatchesAndTotalEnrolledInAParticularStateDto> getCountOfTotalNumberOfBatchesAndTotalEnrolledInAParticularStateSchemeWise(String batchType) {
		LOGGER.debug("Request Received from Controller");
		LOGGER.debug("In FAQService - getCountOfTotalNumberOfBatchesAndTotalEnrolledInAParticularStateSchemeWise");
		LOGGER.debug("Parameters Received from front end are - 'batchType': "+batchType);
		LOGGER.debug("Making a Request to Dao to get data");
		return fAQTotalNumberOfBatchesAndTotalEnrolledInAParticularStateDao.getCountOfTotalNumberOfBatchesAndTotalEnrolledInAParticularStateSchemeWise(batchType);
	}
	
	public Integer getCountTotalAssessorsOfAParticularAgencyInAParticularState(String agencyName,String state) {
		LOGGER.debug("Request Received from Controller");
		LOGGER.debug("In FAQService - getCountTotalAssessorsOfAParticularAgencyInAParticularState");
		LOGGER.debug("Parameters Received from front end are - 'agencyName': "+agencyName+" 'state': "+state);
		LOGGER.debug("Making a Request to Dao to get data");
		return fAQQuestionCommonDao.getCountTotalAssessorsOfAParticularAgencyInAParticularState(agencyName, state);
	}
	
	public Collection<FAQStatusOfAParticularBatchWithIdDto> getStatusOfAParticularBatchWithId(Integer batchId) {
		LOGGER.debug("Request Received from Controller");
		LOGGER.debug("In FAQService - getStatusOfAParticularBatchWithId");
		LOGGER.debug("Parameters Received from front end are - 'batchId': "+batchId);
		LOGGER.debug("Making a Request to Dao to get data");
		return fAQStatusOfAParticularBatchWithIdDao.getStatusOfAParticularBatchWithId(batchId);
	}
	
	public Integer getCountBatchesForWhichResultIsPending() {
		LOGGER.debug("Request Received from Controller");
		LOGGER.debug("In FAQService - getCountBatchesForWhichResultIsPending");
		LOGGER.debug("Making a Request to Dao to get data");
		return fAQQuestionCommonDao.getCountBatchesForWhichResultIsPending();
	}
	
	public Collection<FAQBatchWiseCandidateDetailsDto> getBatchWiseCandidatesDetails(Integer batchId) {
		LOGGER.debug("Request Received from Controller");
		LOGGER.debug("In FAQService - getBatchWiseCandidatesDetails");
		LOGGER.debug("Parameters Received from front end are - 'batchId': "+batchId);
		LOGGER.debug("Making a Request to Dao to get data");
		return fAQBatchWiseCandidateDetailsDao.getBatchWiseCandidatesDetails(batchId);
	}

	public Integer getCountTotalNonAssignedBatches() {
		LOGGER.debug("Request Received from Controller");
		LOGGER.debug("In FAQService - getCountTotalNonAssignedBatches");
		LOGGER.debug("Making a Request to Dao to get data");
		return fAQQuestionCommonDao.getCountTotalNonAssignedBatches();
	}
	
	public Collection<FAQCandidatesEnrolledAssessedCertifiedMonthWiseDto> getCountOfFAQCandidatesEnrolledMonthWise(int year) {
		LOGGER.debug("Request Received from Controller");
		LOGGER.debug("In FAQService - getCountOfFAQCandidatesEnrolledMonthWise");
		LOGGER.debug("Parameters Received from front end are - 'year': "+year);
		LOGGER.debug("Making a Request to Dao to get data");
		return fAQCandidatesEnrolledAssessedCertifiedMonthWiseDao.getCountTotalCandidatesEnrolledMonthWise(year);
	}
	
	public Collection<FAQCandidatesEnrolledAssessedCertifiedMonthWiseDto> getCountOfFAQCandidatesAssessedMonthWise(int year) {
		LOGGER.debug("Request Received from Controller");
		LOGGER.debug("In FAQService - getCountOfFAQCandidatesAssessedMonthWise");
		LOGGER.debug("Parameters Received from front end are - 'year': "+year);
		LOGGER.debug("Making a Request to Dao to get data");
		return fAQCandidatesEnrolledAssessedCertifiedMonthWiseDao.getCountTotalCandidatesAssessedMonthWise(year);
	}
	
	public Collection<FAQCandidatesEnrolledAssessedCertifiedMonthWiseDto> getCountOfFAQCandidatesCertifiedMonthWise(int year) {
		LOGGER.debug("Request Received from Controller");
		LOGGER.debug("In FAQService - getCountOfFAQCandidatesCertifiedMonthWise");
		LOGGER.debug("Parameters Received from front end are - 'year': "+year);
		LOGGER.debug("Making a Request to Dao to get data");
		return fAQCandidatesEnrolledAssessedCertifiedMonthWiseDao.getCountTotalCandidatesCertifiedMonthWise(year);
	}
	
	public Collection<FAQCandidatesEnrolledAssessedCertifiedMonthWiseDto> getCountOfFAQCandidatesEnrolledMonthAndSchemeWise(int year,String batchType) {
		LOGGER.debug("Request Received from Controller");
		LOGGER.debug("In FAQService - getCountOfFAQCandidatesEnrolledMonthAndSchemeWise");
		LOGGER.debug("Parameters Received from front end are - 'year': "+year+" batchType: "+batchType);
		LOGGER.debug("Making a Request to Dao to get data");
		return fAQCandidatesEnrolledAssessedCertifiedMonthWiseDao.getCountTotalCandidatesEnrolledMonthAndSchemeWise(year, batchType);
	}
	
	public Collection<FAQCandidatesEnrolledAssessedCertifiedMonthWiseDto> getCountOfFAQCandidatesAssessedMonthAndSchemeWise(int year,String batchType) {
		LOGGER.debug("Request Received from Controller");
		LOGGER.debug("In FAQService - getCountOfFAQCandidatesAssessedMonthAndSchemeWise");
		LOGGER.debug("Parameters Received from front end are - 'year': "+year+" batchType: "+batchType);
		LOGGER.debug("Making a Request to Dao to get data");
		return fAQCandidatesEnrolledAssessedCertifiedMonthWiseDao.getCountTotalCandidatesAssessedMonthAndSchemeWise(year, batchType);
	}
	
	public Collection<FAQCandidatesEnrolledAssessedCertifiedMonthWiseDto> getCountOfFAQCandidatesCertifiedMonthAndSchemeWise(int year,String batchType) {
		LOGGER.debug("Request Received from Controller");
		LOGGER.debug("In FAQService - getCountOfFAQCandidatesCertifiedMonthAndSchemeWise");
		LOGGER.debug("Parameters Received from front end are - 'year': "+year+" batchType: "+batchType);
		LOGGER.debug("Making a Request to Dao to get data");
		return fAQCandidatesEnrolledAssessedCertifiedMonthWiseDao.getCountTotalCandidatesCertifiedMonthAndSchemeWise(year, batchType);
	}
	
	public Collection<FAQTrainingCentresNotTakingAnyBatchesDto> getTrainingCentresNotTakingAnyBatches() {
		LOGGER.debug("Request Received from Controller");
		LOGGER.debug("In FAQService - getTrainingCentresNotTakingAnyBatches");
		LOGGER.debug("Making a Request to Dao to get data");
		return fAQTrainingCentresNotTakingAnyBatchesDao.getTotalTrainingCentresNotTakingAnyBatches();
	}
	
	public Collection<FAQTotalBatchesWithTotalCandidatesEnrolledMonthWiseDto> getTotalBatchesWithTotalCandidatesEnrolledYearWise(int year) {
		LOGGER.debug("Request Received from Controller");
		LOGGER.debug("In FAQService - getTotalBatchesWithTotalCandidatesEnrolledYearWise");
		LOGGER.debug("Parameters Received from front end are - 'year': "+year);
		LOGGER.debug("Making a Request to Dao to get data");
		return fAQTotalBatchesWithTotalCandidatesEnrolledYearWiseDao.getTotalBatchesWithTotalCandidatesEnrolledYearWise(year);
	}
}
