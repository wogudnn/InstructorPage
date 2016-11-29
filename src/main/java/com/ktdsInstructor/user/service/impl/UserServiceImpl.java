package com.ktdsInstructor.user.service.impl;

import com.ktdsInstructor.user.biz.UserBiz;
import com.ktdsInstructor.user.service.UserService;

public class UserServiceImpl implements UserService {

	private UserBiz userBiz;
	
	public void setUserBiz(UserBiz userBiz) {
		this.userBiz = userBiz;
	}
}
