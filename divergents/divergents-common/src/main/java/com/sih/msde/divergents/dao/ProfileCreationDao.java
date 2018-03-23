package com.sih.msde.divergents.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.sih.msde.divergents.common.AbstractTransactionalDao;
import com.sih.msde.divergents.config.ProfileCreationConfigSql;
import com.sih.msde.divergents.dto.TrainingCenterDto;
import com.sih.msde.divergents.dto.TrainingPartnerDto;
import com.sih.msde.divergents.dto.TrainingPartnerQualificationPackDto;



import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ProfileCreationDao extends AbstractTransactionalDao{

	
	@Autowired
	private ProfileCreationConfigSql profileCreationConfigSql;
	
	private static final ProfileCreationTrainingCenterRowMapper ROW_MAPPERTC = new ProfileCreationTrainingCenterRowMapper();
	private static final ProfileCreationTrainingPartnerRowMapper ROW_MAPPER = new ProfileCreationTrainingPartnerRowMapper();
	private static final ProfileCreationTrainingPartnerQPRowMapper ROW_MAPPERQP = new ProfileCreationTrainingPartnerQPRowMapper();
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ProfileCreationDao.class);
	private static class ProfileCreationTrainingCenterRowMapper implements RowMapper<TrainingCenterDto>
	{
		@Override
		public TrainingCenterDto mapRow(ResultSet resultSet, int rowNum)throws SQLException
		{
			
			int trainingCenterId = resultSet.getInt("trainingCenterId");
			String centerName = resultSet.getString("centerName");
			String address = resultSet.getString("address");
			String district = resultSet.getString("district");
			String state = resultSet.getString("state");
			long contactNumber = resultSet.getLong("contactNumber");
			int trainingPartnerId = resultSet.getInt("trainingPartnerId");
			boolean isActive = resultSet.getBoolean("isActive");
			
			return new TrainingCenterDto(trainingCenterId, centerName,
					 address,  district,  state,  contactNumber,
					 trainingPartnerId,  isActive);
		}
	}
	
	/**
	 * Row mapper for Training Partner
	 * @author Ruchi
	 *
	 */
	private static class ProfileCreationTrainingPartnerRowMapper implements RowMapper<TrainingPartnerDto>
	{
		@Override
		public TrainingPartnerDto mapRow(ResultSet resultSet, int rowNum)throws SQLException
		{
			int trainingPartnerId = resultSet.getInt("trainingPartnerId");
			String organisationName = resultSet.getString("organisationName");
			String sPOCName = resultSet.getString("sPOCName");
			String address = resultSet.getString("address");
			String website = resultSet.getString("website");
			String district = resultSet.getString("district");
			String state = resultSet.getString("state");
			long contactNumber = resultSet.getLong("contactNumber");
			int applicationId = resultSet.getInt("applicationId");
			String undertakingPath = resultSet.getString("undertakingPath");
			return new TrainingPartnerDto(trainingPartnerId,  organisationName, sPOCName,
					address, website, district, state, contactNumber,  applicationId, undertakingPath);
		}
	}
	
	/**
	 * Row mapper for QP
	 * @author Ruchi
	 *
	 */
	private static class ProfileCreationTrainingPartnerQPRowMapper implements RowMapper<TrainingPartnerQualificationPackDto>
	{
		@Override
		public TrainingPartnerQualificationPackDto mapRow(ResultSet resultSet, int rowNum)throws SQLException
		{
			int trainingPartnerQualificationPackId = resultSet.getInt("trainingPartnerQualificationPackId");
			int trainingPartnerId = resultSet.getInt("trainingPartnerId");
			String qualificationPack = resultSet.getString("qualificationPack");
			String jobRole = resultSet.getString("jobRole");
			String scheme = resultSet.getString("scheme");
			boolean isActive = resultSet.getBoolean("isActive");
			
			return new TrainingPartnerQualificationPackDto(trainingPartnerQualificationPackId,  trainingPartnerId,
					 qualificationPack,  jobRole,  scheme,
					 isActive);
		}
	}
	
	/**
	 * Method to get data for training partner
	 * @param applicationId - applicationId
	 * @return collection of training partner dto
	 */
public Collection<TrainingPartnerDto> profileCreationGetDataTrainingPartner(int applicationId)
{
	try
	{
		LOGGER.debug("Trying to get data for Training Partner table");
		Map<String,Object> parameters = new HashMap<String,Object>();
		parameters.put("applicationId", applicationId);
		return getJdbcTemplate().query(profileCreationConfigSql.getGetTrainingPartnerData(), parameters, ROW_MAPPER);
	}
	catch(DataAccessException sql)
	{
		LOGGER.error("An SQL exception occured while fetching data of training partner - " + sql);
		return null;
	}
	catch(Exception e)
	{ 
		LOGGER.error("An exception occured while fetching data of training partner - " + e);
		return null;
	}
	
	
}
/**
 * MEthod to get data for training center of training partner
 * @param trainingPartnerId
 * @return
 */

public Collection<TrainingCenterDto> profileCreationGetDataTrainingCenterDto(int trainingPartnerId)
{
	try
	{
		LOGGER.debug("Trying to fetch data for training center");
		Map<String,Object> parameters = new HashMap<String,Object>();
		parameters.put("trainingPartnerId", trainingPartnerId);
		return getJdbcTemplate().query(profileCreationConfigSql.getGetTrainingCenterData(), parameters, ROW_MAPPERTC); 
	}
	catch(DataAccessException sql)
	{
		LOGGER.error("An SQL exception occured while fetching training partner center " + sql);
		return null;
	}
	catch(Exception e)
	{
		LOGGER.debug("An Exception occured while fetching training center " + e);
		return null;
	}
}

/**
 * Method to get data of QP
 * @param trainingPartnerId  foreign key for QP table
 * @return collection of QP dto
 */
public Collection<TrainingPartnerQualificationPackDto> profileCreationGetDataQualificationPackDto(int trainingPartnerId)
{
	try
	{
		LOGGER.debug("Trying to get data for qualification pack");
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("trainingPartnerId", trainingPartnerId);
		return getJdbcTemplate().query(profileCreationConfigSql.getGetTrainingCenterData(), map, ROW_MAPPERQP); 
	}
	catch(DataAccessException sql)
	{
		LOGGER.error("An SQL exception occured while fetching training partner qualification pack " + sql);
		return null;
	}
	catch(Exception e)
	{
		LOGGER.error("An exception occured while fetching training partner QP " + e);
		return null;
	}
}
}
