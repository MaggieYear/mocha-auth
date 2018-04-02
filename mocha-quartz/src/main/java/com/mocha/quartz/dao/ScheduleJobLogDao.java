package com.mocha.quartz.dao;

import org.mybatis.spring.annotation.MapperScan;

import com.mocha.dao.BaseDao;
import com.mocha.entity.ScheduleJobLogEntity;

/**
 * 定时任务日志
 * 
 */
@MapperScan
public interface ScheduleJobLogDao extends BaseDao<ScheduleJobLogEntity> {
	
	
	ScheduleJobLogEntity queryObject(Long logId);
	
	ScheduleJobLogEntity queryList(Long logId);
	
	int queryTotal(Long logId);
	
	void save(ScheduleJobLogEntity scheduleJobLogEntity);
}
