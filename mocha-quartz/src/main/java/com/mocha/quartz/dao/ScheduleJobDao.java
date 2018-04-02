package com.mocha.quartz.dao;

import java.util.Map;

import com.mocha.dao.BaseDao;
import com.mocha.entity.ScheduleJobEntity;


/**
 * 定时任务
 * 
 */
public interface ScheduleJobDao extends BaseDao<ScheduleJobEntity> {
	
	/**
	 * 批量更新状态
	 */
	int updateBatch(Map<String, Object> map);
}
