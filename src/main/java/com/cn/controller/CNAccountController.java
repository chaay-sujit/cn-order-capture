package com.cn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cn.model.CNUser;
import com.cn.service.CNUserService;

@RestController
@RequestMapping(value = "/account")
public class CNAccountController {
	@Autowired
	private CNUserService userService;

	/*
	 * Sign-up a new User
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/signup")
	public void signUpToChaayNation(@RequestBody CNUser user) {
		userService.signUpUser(user);
	}

	/*
	 * Update the information of an existing User
	 */
	@RequestMapping(method = RequestMethod.PUT, value = "/signup")
	public void updateUser(@RequestBody CNUser user) {
		userService.updateUser(user);
	}

	/*
	 * Get details about existing User
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/{userId}")
	public CNUser fetchUser(@PathVariable String userId) {
		return userService.fetchUserDetails(userId);
	}

	/*
	 * Delete an existing user
	 */
	@RequestMapping(method = RequestMethod.DELETE, value = "/{userid}")
	public void updateUser(@PathVariable String userId) {
		userService.deleteUser(userId);
	}

	/*
	 * Get list of all existing Users
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/all")
	public List<CNUser> fetchAllUsers() {
		return userService.fetchUserList();
	}
}
