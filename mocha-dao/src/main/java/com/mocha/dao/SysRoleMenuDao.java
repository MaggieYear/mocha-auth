package com.mocha.dao;

import java.util.List;

import com.mocha.entity.SysRoleMenuEntity;


/**
 * 角色与菜单对应关系
 * 
 */
public interface SysRoleMenuDao extends BaseDao<SysRoleMenuEntity> {
	
	void save(SysRoleMenuEntity sysRoleMenuEntity);
	
	/**
	 * 根据角色ID，获取菜单ID列表
	 */
	List<Long> queryMenuIdList(Long roleId);
	
	void delete(Long roleId);
	
}
