package com.sih.msde.divergents.controller;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sih.msde.divergents.dto.FAQBatchWiseCandidateDetailsDto;
import com.sih.msde.divergents.dto.FAQCandidatesEnrolledAssessedCertifiedMonthWiseDto;
import com.sih.msde.divergents.dto.FAQCandidatesTrainedAssessedCertifiedDto;
import com.sih.msde.divergents.dto.FAQStatusOfAParticularBatchWithIdDto;
import com.sih.msde.divergents.dto.FAQTotalBatchesWithTotalCandidatesEnrolledMonthWiseDto;
import com.sih.msde.divergents.dto.FAQTotalNumberOfBatchesAndTotalEnrolledInAParticularStateDto;
import com.sih.msde.divergents.dto.FAQTrainingCentresNotTakingAnyBatchesDto;
import com.sih.msde.divergents.service.FAQService;


@RestController
public class FAQController {
	
	@Autowired
	private FAQService fAQService;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(FAQController.class);
	
	 
	@RequestMapping("/getFAQTotalCandidatesTrainedAssessedCertified")
	public Collection<FAQCandidatesTrainedAssessedCertifiedDto> getTotalCandidatesTrainedAssessedCertified()  {
		LOGGER.debug("In FAQController - getTotalCandidatesTrainedAssessedCertified");
		LOGGER.debug("Request Received from front end to get data for Total Candidates Trained, Assessed, Certified for FAQ");
		try
		{
			LOGGER.debug("In TRY block");
			LOGGER.debug("Sending Request to service");
			return fAQService.getTotalCandidatesTrainedAssessedCertifiedDao();
		}
		catch(Exception exception)
		{
			LOGGER.debug("In CATCH block");
			LOGGER.error("ERROR: Encountered an exception.");
			LOGGER.error("Exception is :"+exception);
			LOGGER.debug("returning NULL");
			return null;
		}
	}
	
	 
	@RequestMapping(method=RequestMethod.POST,value="/getFAQTotalCandidatesTrainedAssessedCertifiedSchemeWise")
	public Collection<FAQCandidatesTrainedAssessedCertifiedDto> getTotalCandidatesTrainedAssessedCertifiedSchemeWise(@RequestParam("batchType") String batchType) {
		LOGGER.debug("In FAQController - getTotalCandidatesTrainedAssessedCertifiedSchemeWise");
		LOGGER.debug("Request Received from front end to get data for Total Candidates Trained, Assessed, Certified Scheme Wise for FAQ");
		LOGGER.debug("Parameters Received from front end are - 'batchType': "+batchType);
		try
		{
			LOGGER.debug("In TRY block");
			LOGGER.debug("Sending Request to service");
			return fAQService.getTotalCandidatesTrainedAssessedCertifiedSchemeWise(batchType);
		}
		catch(Exception exception)
		{
			LOGGER.debug("In CATCH block");
			LOGGER.error("ERROR: Encountered an exception.");
			LOGGER.error("Exception is :"+exception);
			LOGGER.debug("returning NULL");
			return null;
		}
	}
	
	 
	@RequestMapping(value="/getFAQTotalTrainingCentresInAState",method=RequestMethod.POST)
	public Integer getTotalTrainingCentresInAState(@RequestParam("state") String state) {
		LOGGER.debug("In FAQController - getTotalTrainingCentresInAState");
		LOGGER.debug("Request Received from front end to get data for Total Training Centres in a State for FAQ");
		LOGGER.debug("Parameters Received from front end are - 'state': "+state);
		try
		{
			LOGGER.debug("In TRY block");
			LOGGER.debug("Sending Request to service");
			return fAQService.getTotalTrainingCentresInAState(state);
		}
		catch(Exception exception)
		{
			LOGGER.debug("In CATCH block");
			LOGGER.error("ERROR: Encountered an exception.");
			LOGGER.error("Exception is :"+exception);
			LOGGER.debug("returning NULL");
			return null;
		}
	}
	
	 
	@RequestMapping(value="/getFAQCountOfTotalTrainingCentresConductingTraining")
	public Integer getCountOfTotalTrainingCentresConductingTraining() {
		LOGGER.debug("In FAQController - getCountOfTotalTrainingCentresConductingTraining");
		LOGGER.debug("Request Received from front end to get Total Training Centres conducting training for FAQ");
		try
		{
			LOGGER.debug("In TRY block");
			LOGGER.debug("Sending Request to service");
			return fAQService.getCountOfTotalTrainingCentresConductingTraining();
		}
		catch(Exception exception)
		{
			LOGGER.debug("In CATCH block");
			LOGGER.error("ERROR: Encountered an exception.");
			LOGGER.error("Exception is :"+exception);
			LOGGER.debug("returning NULL");
			return null;
		}
	}
	
	 
	@RequestMapping(value="/getFAQCountOfCandidatesAssessmentUpcomingForAMonth",method=RequestMethod.POST)
	public Integer getCountOfCandidatesAssessmentUpcomingForAMonth(@RequestParam("month") String month) {
		LOGGER.debug("In FAQController - getCountOfCandidatesAssessmentUpcomingForAMonth");
		LOGGER.debug("Request Received from front end to get Total Candidates Assessment Upcoming for a month for FAQ");
		LOGGER.debug("Parameters Received from front end are - 'month': "+month);
		try
		{
			LOGGER.debug("In TRY block");
			LOGGER.debug("Sending Request to service");
			return fAQService.getCountOfCandidatesAssessmentUpcomingForAMonth(month);
		}
		catch(Exception exception)
		{
			LOGGER.debug("In CATCH block");
			LOGGER.error("ERROR: Encountered an exception.");
			LOGGER.error("Exception is :"+exception);
			LOGGER.debug("returning NULL");
			return null;
		}
	}
	
	 
	@RequestMapping(value="/getFAQNameOfAgencyToWhichABatchIsAssigned",method=RequestMethod.POST)
	public String getNameOfAgencyToWhichABatchIsAssigned(@RequestParam("batchId") Integer batchId)throws EmptyResultDataAccessException {
		LOGGER.debug("In FAQController - getNameOfAgencyToWhichABatchIsAssigned");
		LOGGER.debug("Request Received from front end to get Agency Name to which a Batch is Assigned for FAQ");
		LOGGER.debug("Parameters Received from front end are - 'batchId': "+batchId);
		try
		{
			LOGGER.debug("In TRY block");
			LOGGER.debug("Sending Request to service");
			return fAQService.getNameOfAgencyToWhichABatchIsAssigned(batchId);
		}
		catch(Exception exception)
		{
			LOGGER.debug("In CATCH block");
			LOGGER.error("ERROR: Encountered an exception.");
			LOGGER.error("Exception is :"+exception);
			LOGGER.debug("returning NULL");
			return null;
		}
	}
	
	 
	@RequestMapping(value="/getFAQTotalCountOfBatchesAssignedToAAssessmentAgency",method=RequestMethod.POST)
	public Integer getTotalCountOfBatchesAssignedToAAssessmentAgency(@RequestParam("agencyName") String agencyName)throws EmptyResultDataAccessException {
		LOGGER.debug("In FAQController - getTotalCountOfBatchesAssignedToAAssessmentAgency");
		LOGGER.debug("Request Received from front end to get Total Batches assigned to a Assessment Agency for FAQ");
		LOGGER.debug("Parameters Received from front end are - 'agencyName': "+agencyName);
		try
		{
			LOGGER.debug("In TRY block");
			LOGGER.debug("Sending Request to service");
			return fAQService.getTotalCountOfBatchesAssignedToAAssessmentAgency(agencyName);
		}
		catch(Exception exception)
		{
			LOGGER.debug("In CATCH block");
			LOGGER.error("ERROR: Encountered an exception.");
			LOGGER.error("Exception is :"+exception);
			LOGGER.debug("returning NULL");
			return null;
		}
	}
	
	 
	@RequestMapping(value="/getFAQCountOfTotalNumberOfBatchesAndTotalEnrolledInAParticularState",method=RequestMethod.POST)
	public Collection<FAQTotalNumberOfBatchesAndTotalEnrolledInAParticularStateDto> getCountOfTotalNumberOfBatchesAndTotalEnrolledInAParticularState(@RequestParam("state") String state) {
		LOGGER.debug("In FAQController - getCountOfTotalNumberOfBatchesAndTotalEnrolledInAParticularState");
		LOGGER.debug("Request Received from front end to get Total Batches and Total Candidates Enrolled In a Particular state for FAQ");
		LOGGER.debug("Parameters Received from front end are - 'state': "+state);
		
		try
		{
			LOGGER.debug("In TRY block");
			LOGGER.debug("Sending Request to service");
			return fAQService.getCountOfTotalNumberOfBatchesAndTotalEnrolledInAParticularState(state);
		}
		catch(Exception exception)
		{
			LOGGER.debug("In CATCH block");
			LOGGER.error("ERROR: Encountered an exception.");
			LOGGER.error("Exception is :"+exception);
			LOGGER.debug("returning NULL");
			return null;
		}
	}
	
	 
	@RequestMapping(value="/getFAQCountOfTotalNumberOfBatchesAndTotalEnrolledInAParticularScheme",method=RequestMethod.POST)
	public Collection<FAQTotalNumberOfBatchesAndTotalEnrolledInAParticularStateDto> getCountTotalNumberOfBatchesInAParticularScheme(@RequestParam("batchType") String batchType) {
		LOGGER.debug("In FAQController - getCountTotalNumberOfBatchesInAParticularScheme");
		LOGGER.debug("Request Received from front end to get Total Batches and Total Candidates Enrolled In a Particular scheme for FAQ");
		LOGGER.debug("Parameters Received from front end are - 'batchType': "+batchType);
		try
		{
			LOGGER.debug("In TRY block");
			LOGGER.debug("Sending Request to service");
			return fAQService.getCountOfTotalNumberOfBatchesAndTotalEnrolledInAParticularStateSchemeWise(batchType);
		}
		catch(Exception exception)
		{
			LOGGER.debug("In CATCH block");
			LOGGER.error("ERROR: Encountered an exception.");
			LOGGER.error("Exception is :"+exception);
			LOGGER.debug("returning NULL");
			return null;
		}
	}
	
	 
	@RequestMapping(value="/getFAQCountTotalAssessorsOfAParticularAgencyInAParticularState",method=RequestMethod.POST)
	public Integer getCountTotalAssessorsOfAParticularAgencyInAParticularState(@RequestParam("agencyName") String agencyName, @RequestParam("state") String state) {
		LOGGER.debug("In FAQController - getCountTotalAssessorsOfAParticularAgencyInAParticularState");
		LOGGER.debug("Request Received from front end to get Total Assessors Of A particular Agency in a particular State for FAQ");
		LOGGER.debug("Parameters Received from front end are - 'agencyName':"+agencyName+" 'state': "+state);
		try
		{
			LOGGER.debug("In TRY block");
			LOGGER.debug("Sending Request to service");
			return fAQService.getCountTotalAssessorsOfAParticularAgencyInAParticularState(agencyName, state);
		}
		catch(Exception exception)
		{
			LOGGER.debug("In CATCH block");
			LOGGER.error("ERROR: Encountered an exception.");
			LOGGER.error("Exception is :"+exception);
			LOGGER.debug("returning NULL");
			return null;
		}
	}
	
	 
	@RequestMapping(value="/getFAQStatusOfAParticularBatchWithId",method=RequestMethod.POST)
	public Collection<FAQStatusOfAParticularBatchWithIdDto> getStatusOfAParticularBatchWithId(@RequestParam("batchId") Integer batchId) {
		LOGGER.debug("In FAQController - getStatusOfAParticularBatchWithId");
		LOGGER.debug("Request Received from front end to get Status of A Partcular batch for FAQ");
		LOGGER.debug("Parameters Received from front end are - 'batchId': "+batchId);
		try
		{
			LOGGER.debug("In TRY block");
			LOGGER.debug("Sending Request to service");
			return fAQService.getStatusOfAParticularBatchWithId(batchId);
		}
		catch(Exception exception)
		{
			LOGGER.debug("In CATCH block");
			LOGGER.error("ERROR: Encountered an exception.");
			LOGGER.error("Exception is :"+exception);
			LOGGER.debug("returning NULL");
			return null;
		}
	}
	
	 
	@RequestMapping(value="/getFAQCountBatchesForWhichResultIsPending")
	public Integer getCountBatchesForWhichResultIsPending() {
		LOGGER.debug("In FAQController - getCountBatchesForWhichResultIsPending");
		LOGGER.debug("Request Received from front end to get Total Batches for which Result is Pending for FAQ");
		try
		{
			LOGGER.debug("In TRY block");
			LOGGER.debug("Sending Request to service");
			return fAQService.getCountBatchesForWhichResultIsPending();
		}
		catch(Exception exception)
		{
			LOGGER.debug("In CATCH block");
			LOGGER.error("ERROR: Encountered an exception.");
			LOGGER.error("Exception is :"+exception);
			LOGGER.debug("returning NULL");
			return null;
		}
	}
	
	 
	@RequestMapping(value="/getFAQBatchWiseCandidatesDetails",method=RequestMethod.POST)
	public Collection<FAQBatchWiseCandidateDetailsDto> getBatchWiseCandidatesDetails(@RequestParam("batchId") Integer batchId) {
		LOGGER.debug("In FAQController - getBatchWiseCandidatesDetails");
		LOGGER.debug("Request Received from front end to get Batche wise Candidate details for FAQ");
		LOGGER.debug("Parameters Received from front end are - 'batchId': "+batchId);
		try
		{
			LOGGER.debug("In TRY block");
			LOGGER.debug("Sending Request to service");
			return fAQService.getBatchWiseCandidatesDetails(batchId);
		}
		catch(Exception exception)
		{
			LOGGER.debug("In CATCH block");
			LOGGER.error("ERROR: Encountered an exception.");
			LOGGER.error("Exception is :"+exception);
			LOGGER.debug("returning NULL");
			return null;
		}
	}
	
	 
	@RequestMapping("/getFAQCountTotalNonAssignedBatches")
	public Integer getCountTotalNonAssignedBatches() {
		LOGGER.debug("In FAQController - getCountTotalNonAssignedBatches");
		LOGGER.debug("Request Received from front end to get Total Non-Assigned Batches for FAQ");
		try
		{
			LOGGER.debug("In TRY block");
			LOGGER.debug("Sending Request to service");
			return fAQService.getCountTotalNonAssignedBatches();
		}
		catch(Exception exception)
		{
			LOGGER.debug("In CATCH block");
			LOGGER.error("ERROR: Encountered an exception.");
			LOGGER.error("Exception is :"+exception);
			LOGGER.debug("returning NULL");
			return null;
		}
	}
	
	 
	@RequestMapping("/getFAQTrainingCentresNotTakingAnyBatches")
	public Collection<FAQTrainingCentresNotTakingAnyBatchesDto> getTrainingCentresNotTakingAnyBatchesc(){
		LOGGER.debug("In FAQController - getTrainingCentresNotTakingAnyBatchesc");
		LOGGER.debug("Request Received from front end to get Training centres not taking any Batches for FAQ");
		try
		{
			LOGGER.debug("In TRY block");
			LOGGER.debug("Sending Request to service");
			return fAQService.getTrainingCentresNotTakingAnyBatches();
		}
		catch(Exception exception)
		{
			LOGGER.debug("In CATCH block");
			LOGGER.error("ERROR: Encountered an exception.");
			LOGGER.error("Exception is :"+exception);
			LOGGER.debug("returning NULL");
			return null;
		}
	}
	
	 
	@RequestMapping(method=RequestMethod.POST,value="/getFAQCandidatesEnrolledAssessedCertifiedMonthWise")
	public Collection<FAQCandidatesEnrolledAssessedCertifiedMonthWiseDto> getCountTotalCandidatesEnrolledMonthWise(@RequestParam("year") Integer year, @RequestParam("candidates") String candidates) {
		LOGGER.debug("In FAQController - getCountTotalCandidatesEnrolledMonthWise");
		LOGGER.debug("Request Received from front end to get Total Candidates Enrolled or Assessed or Certified in a Particular year for FAQ");
		LOGGER.debug("Parameters Received from front end are - 'year': "+year+" 'candidates:'"+candidates);
		try
		{
			LOGGER.debug("In TRY block");
			if(candidates.equalsIgnoreCase("Enrolled"))
			{
				LOGGER.debug("Selected field is - Enrolled");
				LOGGER.debug("Sending Request to service");
				return fAQService.getCountOfFAQCandidatesEnrolledMonthWise(year);
			}
			else if(candidates.equalsIgnoreCase("Assessed"))
			{
				LOGGER.debug("Selected field is - Assessed");
				LOGGER.debug("Sending Request to service");
				return fAQService.getCountOfFAQCandidatesAssessedMonthWise(year);
			}
			else if(candidates.equalsIgnoreCase("Certified"))
			{
				LOGGER.debug("Selected field is - Certified");
				LOGGER.debug("Sending Request to service");
				return fAQService.getCountOfFAQCandidatesCertifiedMonthWise(year);
			}
			else
			{
				LOGGER.debug("Selected field is - Unknown");
				LOGGER.error("Incorrect Value for the selected type 'Candidate' or 'Year'");
				LOGGER.debug("Returning NULL");
				return null;
			}
		}
		catch(Exception e)
		{
			LOGGER.debug("In CATCH block");
			LOGGER.error("ERROR: Encountered an exception.");
			LOGGER.error("Exception is :"+e);
			LOGGER.debug("returning NULL");
			return null;
		}
	}
	
	 
	@RequestMapping(method=RequestMethod.POST,value="/getFAQCandidatesEnrolledAssessedCertifiedMonthAndSchemeWise")
	public Collection<FAQCandidatesEnrolledAssessedCertifiedMonthWiseDto> getCountTotalCandidatesEnrolledMonthAndSchemeWise(@RequestParam("year") Integer year, @RequestParam("candidates") String candidates, @RequestParam("batchType") String batchType)
	{
		LOGGER.debug("In FAQController - getCountTotalCandidatesEnrolledMonthAndSchemeWise");
		LOGGER.debug("Request Received from front end to get Total Candidates Enrolled or Assessed or Certified in a Particular year For a particular Scheme for FAQ");
		LOGGER.debug("Parameters Received from front end are - 'year': "+year+" 'candidates:'"+candidates+" 'batchType:'"+batchType);
		try
		{
			LOGGER.debug("In TRY block");
			if(candidates.equalsIgnoreCase("Enrolled"))
			{
				LOGGER.debug("Selected field is - Enrolled");
				LOGGER.debug("Sending Request to service");
				return fAQService.getCountOfFAQCandidatesEnrolledMonthAndSchemeWise(year, batchType);
			}
			else if(candidates.equalsIgnoreCase("Assessed"))
			{
				LOGGER.debug("Selected field is - Assessed");
				LOGGER.debug("Sending Request to service");
				return fAQService.getCountOfFAQCandidatesAssessedMonthAndSchemeWise(year, batchType);
			}
			else if(candidates.equalsIgnoreCase("Certified"))
			{
				LOGGER.debug("Selected field is - Certified");
				LOGGER.debug("Sending Request to service");
				return fAQService.getCountOfFAQCandidatesCertifiedMonthAndSchemeWise(year, batchType);
			}
			else
			{
				LOGGER.debug("Selected field is - Unknown");
				LOGGER.error("Incorrect Value for the selected type 'Candidate' or 'Year'");
				LOGGER.debug("Returning NULL");
				return null;
			}
		}
		catch(Exception e)
		{
			LOGGER.debug("In CATCH block");
			LOGGER.error("ERROR: Encountered an exception.");
			LOGGER.error("Exception is :"+e);
			LOGGER.debug("returning NULL");
			return null;
		}
	}
	
	 
	@RequestMapping(method=RequestMethod.POST,value="/getFAQTotalBatchesWithTotalCandidatesEnrolledYearWise")
	public Collection<FAQTotalBatchesWithTotalCandidatesEnrolledMonthWiseDto> getTotalBatchesWithTotalCandidatesEnrolledYearWise(@RequestParam("year") int year) {
		LOGGER.debug("In FAQController - getTotalBatchesWithTotalCandidatesEnrolledYearWise");
		LOGGER.debug("Request Received from front end to get Total Batches with Total Candidates Enrolled in a Particular year for FAQ");
		LOGGER.debug("Parameters Received from front end are - 'year': "+year);
		try
		{
			LOGGER.debug("In TRY block");
			LOGGER.debug("Sending Request to service");
			return fAQService.getTotalBatchesWithTotalCandidatesEnrolledYearWise(year);
		}
		catch(Exception exception)
		{
			LOGGER.debug("In CATCH block");
			LOGGER.error("ERROR: Encountered an exception.");
			LOGGER.error("Exception is :"+exception);
			LOGGER.debug("returning NULL");
			return null;
		}
		
	}
	
	
	@ExceptionHandler(MissingServletRequestParameterException.class)
	public void handleMissingParams(MissingServletRequestParameterException exception) {
		LOGGER.debug("In FAQController Handling Exceptions Missing Parameters - handleMissingParams");
		String parameterName = exception.getParameterName();
	    LOGGER.error(parameterName + " parameter is missing");
	    // Handling Missing Parameters Exceptions Here
	}
}
