package com.mocha.dao;

import java.util.List;

import com.mocha.entity.SysRoleEntity;

/**
 * 角色管理
 * 
 */
public interface SysRoleDao extends BaseDao<SysRoleEntity> {
	
	SysRoleEntity queryObject(Long roleId);
	
	List<SysRoleEntity> queryList();
	
	int queryTotal();
	
	void save(SysRoleEntity sysRoleEntity);
	
	int update(SysRoleEntity sysRoleEntity);
	
	void deleteBatch(Long roleId);
	
	
}
