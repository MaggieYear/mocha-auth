package com.mocha.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.annotation.MapperScan;

/**
 * 代码生成器
 * 
 */
@MapperScan
public interface SysGeneratorDao {
	
	List<Map<String, Object>> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	Map<String, String> queryTable(String tableName);
	
	List<Map<String, String>> queryColumns(String tableName);
}
