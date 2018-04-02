package com.mocha.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.annotation.MapperScan;

import com.mocha.entity.SysMenuEntity;

/**
 * 菜单管理
 * 
 */
@MapperScan
public interface SysMenuDao extends BaseDao<SysMenuEntity> {
	
	SysMenuEntity queryObject(Long menuId);
	
	void save(SysMenuEntity sysMenuEntity);
	
	/**
	 * 根据父菜单，查询子菜单
	 * @param parentId 父菜单ID
	 */
	List<SysMenuEntity> queryListParentId(Long parentId);
	
	/**
	 * 获取不包含按钮的菜单列表
	 */
	List<SysMenuEntity> queryNotButtonList();
	
	List<SysMenuEntity> queryList(Map<String, Object> map);
	
	int queryTotal();
	
	int update(SysMenuEntity sysMenuEntity);
	
	void deleteBatch(Long menuId);
}
