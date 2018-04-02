package com.mocha.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import com.mocha.entity.SysUserRoleEntity;

/**
 * 用户与角色对应关系
 * 
 */
@MapperScan
public interface SysUserRoleDao extends BaseDao<SysUserRoleEntity> {
	
	SysUserRoleEntity queryList(Long userId);
	
	void save(SysUserRoleEntity sysUserRoleEntity);
	
	void delete(Long userId);
	
	/**
	 * 根据用户ID，获取角色ID列表
	 */
	List<Long> queryRoleIdList(Long userId);
}
