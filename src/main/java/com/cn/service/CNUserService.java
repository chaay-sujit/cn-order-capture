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

	public void updateUser(CNUser user) {
		userRepository.save(user);
	}

	public CNUser fetchUserDetails(String userId) {
		List<CNUser> userList = new ArrayList<CNUser>();
		userRepository.findAll().forEach(userList::add);
		return userList.stream().filter(user -> user.getUserId().equals(userId)).findFirst().get();
	}

	public void deleteUser(String userId) {
		userRepository.delete(userId);
	}

	public List<CNUser> fetchUserList() {
		List<CNUser> userList = new ArrayList<CNUser>();
		userRepository.findAll().forEach(userList::add);
		return userList;
	}
}
