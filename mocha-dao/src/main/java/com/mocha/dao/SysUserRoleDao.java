package com.mocha.dao;

import java.util.List;

import com.mocha.entity.SysUserRoleEntity;

/**
 * 用户与角色对应关系
 * 
 */
public interface SysUserRoleDao extends BaseDao<SysUserRoleEntity> {
	
	/**
	 * 根据用户ID，获取角色ID列表
	 */
	List<Long> queryRoleIdList(Long userId);
}