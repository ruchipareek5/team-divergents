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
import com.sih.msde.divergents.config.SkillGapStudyConfig;
import com.sih.msde.divergents.dto.RecommendedCoursesDto;
import com.sih.msde.divergents.dto.SkillGapStudyDto;

@Repository
public class SkillGapStudyDao extends AbstractTransactionalDao {
	
	@Autowired
	private  SkillGapStudyConfig skillGapStudyConfig;
		
	
	private static final SkillGapStudyRowSelectRowMapper ROW_MAPPER = new SkillGapStudyRowSelectRowMapper();
	
	private static final RecommendedCourseRowSelectRowMapper RecommendRowmapper = new RecommendedCourseRowSelectRowMapper();

	private static final Logger LOGGER = LoggerFactory.getLogger(SkillGapStudyDao.class);
	
	
	
	
	public Collection<SkillGapStudyDto> getSkillReportusingStateandDistrict(String state, String district) {
	
		try {
			LOGGER.debug("Request Received from service to get skill report using state and district");
			
			Map<String, Object> parameters = new HashMap<>();
			
			parameters.put("state", state);
			parameters.put("district", district);
			
			return getJdbcTemplate().query(skillGapStudyConfig.getSelectSkillGapStudy(), parameters, ROW_MAPPER);
		} catch (Exception e) {
			
			LOGGER.debug("An error occured while getting skill report using state and District" + e);
			return null;
		}
	}
	
	
	public Collection<RecommendedCoursesDto> getRecommendedCoursesusingStateandDistrict(String state, String district) {
		
		try {
			LOGGER.debug("Request Received from service to get recommended course using state and district");
			
			Map<String, Object> parameters = new HashMap<>();
			
			parameters.put("state", state);
			parameters.put("district", district);
			
			return getJdbcTemplate().query(skillGapStudyConfig.getSelectRecommendedCourseusingDistrictandState(), parameters, RecommendRowmapper);
		} catch (Exception e) {
			
			LOGGER.debug("An error occured while getting recommended course using state and District" + e);
			return null;
		}
	}
	
	
	public Collection<SkillGapStudyDto> getSkillReportusingState(String state) {
		
		try {
			LOGGER.debug("Request Received from service to get skill gap study using state");
			
			Map<String, Object> parameters = new HashMap<>();
			
			
			parameters.put("state", state);
			
			return getJdbcTemplate().query(skillGapStudyConfig.getSelectSkillGapStudyusingState(), parameters, ROW_MAPPER);
		} catch (Exception e) {
			
			LOGGER.debug("An error occured while getting the skill gap study using state" + e);
			return null;
		}
	}
	
	
public Collection<RecommendedCoursesDto> getRecommendedCoursesusingState(String state) {
		
		try {
			LOGGER.debug("Request Received from service to get recommended course using state");
			
			Map<String, Object> parameters = new HashMap<>();
			
			
			parameters.put("state", state);
			
			return getJdbcTemplate().query(skillGapStudyConfig.getSelectRecommendedCourseusingState(), parameters, RecommendRowmapper);
		} catch (Exception e) {
			
			LOGGER.debug("An error occured while getting the recommended course using state" + e);
			return null;
		}
	}
	
	
	public Collection<SkillGapStudyDto> getSkillReportusingDistrict(String district) {
		
		try {
			LOGGER.debug("Request Received from service to get skill gap study using district");
			
			Map<String, Object> parameters = new HashMap<>();
			
			parameters.put("district", district);
			
			
			return getJdbcTemplate().query(skillGapStudyConfig.getSelectSkillGapStudyusingDistrict(), parameters, ROW_MAPPER);
		} catch (Exception e) {
			
			LOGGER.debug("An error occured while getting the Skill Gap Study using district" + e);
			return null;
		}
	}
	
	
	
public Collection<RecommendedCoursesDto> getRecommendedCoursesusingDistrict(String district) {
		
		try {
			LOGGER.debug("Request Received from service to get recommended courses using district");
			
			Map<String, Object> parameters = new HashMap<>();
			
			parameters.put("district", district);
			
			
			return getJdbcTemplate().query(skillGapStudyConfig.getSelectRecommendedCourseusingDistrict(), parameters, RecommendRowmapper);
		} catch (Exception e) {
			
			LOGGER.debug("An error occured while getting the recommended courses using district" + e);
			return null;
		}
	}
	
	


private static class SkillGapStudyRowSelectRowMapper implements RowMapper<SkillGapStudyDto> {

	@Override
	public SkillGapStudyDto mapRow(ResultSet resultSet, int rowNum)
			throws SQLException {
		String jobrolename = resultSet.getString("jobrolename");
		String noofskilledmanpower = resultSet.getString("noofskilledmanpower");
		String countCandidate = resultSet.getString("countCandidate");
		return new SkillGapStudyDto(jobrolename,noofskilledmanpower,countCandidate);
		
	}
		        
	}



private static class RecommendedCourseRowSelectRowMapper implements RowMapper<RecommendedCoursesDto> {

	@Override
	public RecommendedCoursesDto mapRow(ResultSet resultSet, int rowNum)
			throws SQLException {
		String trainingmaterialid = resultSet.getString("trainingmaterialid");
		String trainingmaterialurl = resultSet.getString("trainingmaterialurl");
		String trainingtitle = resultSet.getString("trainingtitle");
		String trainingmaterialcol = resultSet.getString("trainingmaterialcol");
		return new RecommendedCoursesDto(trainingmaterialid, trainingmaterialurl, trainingtitle, trainingmaterialcol);
		
	}
		        
	}

}
