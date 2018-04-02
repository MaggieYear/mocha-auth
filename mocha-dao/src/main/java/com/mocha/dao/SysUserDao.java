package com.mocha.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.annotation.MapperScan;

import com.mocha.entity.SysUserEntity;


/**
 * 系统用户
 * 
 */
@MapperScan
public interface SysUserDao extends BaseDao<SysUserEntity> {
	
	SysUserEntity queryObject(Long userId);
	
	List<SysUserEntity> queryList(); 
	
	int queryTotal();
	
	/**
	 * 查询用户的所有权限
	 * @param userId  用户ID
	 */
	List<String> queryAllPerms(Long userId);
	
	/**
	 * 查询用户的所有菜单ID
	 */
	List<Long> queryAllMenuId(Long userId);
	
	/**
	 * 根据用户名，查询系统用户
	 */
	SysUserEntity queryByUserName(String username);
	
	void save(SysUserEntity sysUserEntity);
	
	int update(SysUserEntity sysUserEntity);
	
	/**
	 * 修改密码
	 */
	int updatePassword(Map<String, Object> map);
	
	void deleteBatch(Long userId);
}
