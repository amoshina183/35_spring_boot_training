package com.practice._SD35.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice._SD35.entity.User;
import com.practice._SD35.repo.UserRepo;


@Service
public class UserService {
	
	@Autowired
	private UserRepo userRepo;

	public List<User> getAllUsers() {
		return userRepo.findAll();
	}

	public User getUserById(Long userId) {
		return userRepo.findById(userId).orElseThrow(() -> new RuntimeException());
	}

	public void saveUser(User user) {
		userRepo.save(user);
	}

	public void updateUser(User user, Long userId) {
		User user1 = getUserById(userId);
		user1.setUserName(user.getUserName());
		user1.setPassword(user.getPassword());
		userRepo.save(user1);
	}

	public User getUserByUserName(String userName) {
		return userRepo.findByUserName(userName);
	}

	public User getUserByUserNameAndPassword(String userName, String password) {
		
		return userRepo.findByUserNameAndPassword(userName, password);
	}

}
