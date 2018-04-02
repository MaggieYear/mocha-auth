package com.mocha.quartz.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.annotation.MapperScan;

import com.mocha.dao.BaseDao;
import com.mocha.entity.ScheduleJobEntity;


/**
 * 定时任务
 * 
 */
@MapperScan
public interface ScheduleJobDao extends BaseDao<ScheduleJobEntity> {
	
	ScheduleJobEntity queryObject(Long jobId);
	
	List<ScheduleJobEntity> queryList(Map<String, Object> map);
	
	int queryTotal();
	
	void save(ScheduleJobEntity scheduleJobEntity);
	
	int update(ScheduleJobEntity scheduleJobEntity);
	
	/**
	 * 批量更新状态
	 */
	int updateBatch(Map<String, Object> map);
	
	void deleteBatch(Map<String, Object> map);
}
