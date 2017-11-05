package com.cn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cn.model.CNUser;
import com.cn.service.CNUserService;

@RestController
@RequestMapping(value = "/account")
public class CNLoginController {
	@Autowired
	private CNUserService userService;

	@RequestMapping(method = RequestMethod.GET, value = "/all")
	public List<CNUser> fetchAllUsers() {
		return userService.fetchUsers();
	}

	@RequestMapping(method = RequestMethod.POST, value = "/signup")
	public void signUpToChaayNation(@RequestBody CNUser user) {
		userService.signUpUser(user);
	}
}
