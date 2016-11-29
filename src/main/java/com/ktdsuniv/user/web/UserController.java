package com.ktdsuniv.user.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ktdsuniv.user.service.UserService;

@Controller
@RequestMapping("/instructor")
public class UserController {

	
	private UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	
	
}
