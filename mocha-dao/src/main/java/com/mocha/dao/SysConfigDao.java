package com.mocha.dao;

import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

import com.mocha.entity.SysConfigEntity;



/**
 * 系统配置信息
 * 
 */
@MapperScan
public interface SysConfigDao extends BaseDao<SysConfigEntity> {
	
	SysConfigEntity queryObject(Long id);
	
	SysConfigEntity queryList(@Param("key") String key);
	
	int queryTotal(@Param("key") String key);
	
	void save(SysConfigEntity sysConfigEntity);
	
	int update(SysConfigEntity sysConfigEntity);
	
	/**
	 * 根据key，查询value
	 */
	String queryByKey(String paramKey);
	
	/**
	 * 根据key，更新value
	 */
	int updateValueByKey(@Param("key") String key, @Param("value") String value);
	
	void deleteBatch(Long id);
	
	
}
