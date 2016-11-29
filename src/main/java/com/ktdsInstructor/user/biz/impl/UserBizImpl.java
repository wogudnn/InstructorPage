package com.ktdsInstructor.user.biz.impl;

import com.ktdsInstructor.user.biz.UserBiz;
import com.ktdsInstructor.user.dao.UserDao;

public class UserBizImpl implements UserBiz {

	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
}
