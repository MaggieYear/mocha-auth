package com.mocha.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mocha.entity.SysUserEntity;
import com.mocha.utils.ShiroUtils;

/**
 * Controller公共组件
 * 
 */
public abstract class AbstractController {
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	protected SysUserEntity getUser() {
		return ShiroUtils.getUserEntity();
	}

	protected Long getUserId() {
		return getUser().getUserId();
	}
}
