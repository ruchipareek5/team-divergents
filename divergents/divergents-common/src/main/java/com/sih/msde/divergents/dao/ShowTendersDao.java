package com.sih.msde.divergents.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.sih.msde.divergents.common.AbstractTransactionalDao;
import com.sih.msde.divergents.config.ShowTendersConfigSql;
import com.sih.msde.divergents.dto.ShowTendersDto;

@Repository
public class ShowTendersDao extends AbstractTransactionalDao {

	@Autowired
	private ShowTendersConfigSql showTendersConfigSql;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ShowTendersConfigSql.class);
	private static final ShowTendersDaoRowMapper ROW_MAPPER = new ShowTendersDaoRowMapper();
	
	/**
	 * Description: This method takes tenderNumber,tenderTitle,tenderCategory,
	 * tenderDepartment as input and returns a Collection of the details of active tenders
	 * @author Prateek Kapoor
	 * @param tenderNumber
	 * @param tenderTitle
	 * @param tenderCategory
	 * @param tenderDepartment
	 * @return Active Tender Details
	 * 
	 */
	public Collection<ShowTendersDto> getShowTenders(String tenderNumber, String tenderTitle, String tenderCategory,  String tenderDepartment)
	{
		try{
			
			LOGGER.debug("In function getShowTenders to get details of all the active tenders using all the parameters");
			LOGGER.debug("Trying to create hashmap of object received from service");
			Map<String,Object> parameters = new HashMap<>();
			LOGGER.debug("Inserting parameters into the hashmap");
			parameters.put("tenderNumber", tenderNumber);
			parameters.put("tenderTitle", tenderTitle);
			parameters.put("tenderCategory", tenderCategory);
			parameters.put("tenderDepartment", tenderDepartment);
			LOGGER.debug("Parameters inserted into hashmap " +parameters);
			LOGGER.debug("Inserting parameters into database");
			return getJdbcTemplate().query(showTendersConfigSql.getShowTenders(),parameters,ROW_MAPPER);
		
		}
		catch(Exception e){
			
			LOGGER.debug("An exception occured while fetching the details of active tenders: " +e);
			LOGGER.debug("Returning NULL!");
			return null;
			
		}
	}
	
	
	  /**
	   * @author Prateek Kapoor
	   * @param tenderNumber
	   * @param tenderTitle
	   * @return Active Tender Details
	   */
      public Collection<ShowTendersDto> getshowTendersUsingTenderNumberTenderTitle(String tenderNumber,String tenderTitle)
      {
    	
    	  try {
    		  
    		  LOGGER.debug("Received request from service to fetch active tenders details from parameters : tenderNumber and tenderTitle");
        	  LOGGER.debug("Creating hashmap of objects");
        	  Map<String,Object> parameters = new HashMap<>();
  		   	  LOGGER.debug("Inserting parameters into the hashmap");
  		   	  parameters.put("tenderNumber", tenderNumber);
  			  parameters.put("tenderTitle", tenderTitle);
  			  LOGGER.debug("Created hashmap of objects with inserted parameters");
  			  return getJdbcTemplate().query(showTendersConfigSql.getShowTendersUsingTenderNumberTenderTitle(), parameters, ROW_MAPPER);
    	  }
    	  catch(Exception e)
    	  {
    		  LOGGER.debug("An exception was encountered while fetching active tenders from database " +e);
    		  LOGGER.debug("ERROR! Returning NULL");
    		  return null;
    	  }
    	 
      }
      /**
       * 
       * @param tenderNumber
       * @param tenderTitle
       * @param tenderDepartment
       * @return
       */
      public Collection<ShowTendersDto> getshowTendersUsingTenderNumberTenderTitleTenderDepartment(String tenderNumber,String tenderTitle,String tenderDepartment)
      {

    	  try {
    		  
    		  LOGGER.debug("Received request from service to fetch active tenders details from parameters : tenderNumber, tenderTitle and tenderDepartments");
        	  LOGGER.debug("Creating hashmap of objects");
        	  Map<String,Object> parameters = new HashMap<>();
  		   	  LOGGER.debug("Inserting parameters into the hashmap");
  		   	  parameters.put("tenderNumber", tenderNumber);
  			  parameters.put("tenderTitle", tenderTitle);
  			  parameters.put("tenderDepartment",tenderDepartment);
  			 LOGGER.debug("Created hashmap of objects with inserted parameters");
  			 return getJdbcTemplate().query(showTendersConfigSql.getShowTendersUsingTenderNumberTenderTitleTenderDepartment(), parameters, ROW_MAPPER);
  			 
    	  }
    	  catch(Exception e)
    	  {
    		  LOGGER.debug("An exception was encountered while fetching active tenders from database " +e);
    		  LOGGER.debug("ERROR! Returning NULL");
    		  return null;
    	  }
      }
      
      /**
       * 
       * @param tenderNumber
       * @param tenderTitle
       * @param tenderCategory
       * @return
       */
      public Collection<ShowTendersDto> getshowTendersUsingTenderNumberTenderTitleTenderCategory(String tenderNumber,String tenderTitle, String tenderCategory)
      {
    	  try
    	  {
    		  LOGGER.debug("Request received from service to fetch active tenders using ");
    		  LOGGER.debug("Creating hashmap of objects");
        	  Map<String,Object> parameters = new HashMap<>();
  		   	  LOGGER.debug("Inserting parameters into the hashmap");
  		   	  parameters.put("tenderNumber", tenderNumber);
  			  parameters.put("tenderTitle", tenderTitle);
  			  parameters.put("tenderCategory", tenderCategory);
  			  LOGGER.debug("Created hashmap of objects with inserted parameters");
  			  return getJdbcTemplate().query(showTendersConfigSql.getShowTendersUsingTenderNumberTenderTitleTenderCategory(), parameters,ROW_MAPPER);
    	  }
    	  catch(Exception e)
    	  {
    		  LOGGER.debug("An exception was encountered while fetching active tenders from database " +e);
    		  LOGGER.debug("ERROR! Returning NULL!");
    		  return null;
    	  }
      }
    
      private static class ShowTendersDaoRowMapper implements RowMapper<ShowTendersDto> {

    		@Override
    		public ShowTendersDto mapRow(ResultSet resultSet, int rowNum)
    				throws SQLException {
    		
    			String tenderNumber = resultSet.getString("tenderNumber");
    			String tenderTitle = resultSet.getString("tenderTitle");
    			String tenderCategory = resultSet.getString("tenderCategory");
    			String tenderDepartment = resultSet.getString("tenderDepartment");
				
    			return new ShowTendersDto(tenderNumber,tenderTitle,tenderCategory,tenderDepartment);
    					

    		}

    			        
    		}
    		
}
