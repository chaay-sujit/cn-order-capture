package com.cn.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.model.CNUser;
import com.cn.repository.CNUserRepository;

@Service
public class CNUserService {
	@Autowired
	private CNUserRepository userRepository;

	public void signUpUser(CNUser user) {
		userRepository.save(user);
	}

	public List<CNUser> fetchUsers() {
		List<CNUser> userList = new ArrayList<CNUser>();
		userRepository.findAll().forEach(userList::add);
		return userList;
	}
}
