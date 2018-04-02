package com.mocha.service;

import java.util.List;
import java.util.Map;

import com.mocha.entity.SysRoleEntity;


/**
 * 角色
 * 
 */
public interface SysRoleService {
	
	SysRoleEntity queryObject(Long roleId);
	
	List<SysRoleEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(SysRoleEntity role);
	
	void update(SysRoleEntity role);
	
	void deleteBatch(Long[] roleIds);
}
