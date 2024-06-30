package com.practice._SD35.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice._SD35.entity.User;
import com.practice._SD35.service.UserService;

@RestController
@RequestMapping("/api/v1")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@GetMapping("/getAllUsers")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@GetMapping("{userId}")
	public User getUserById(@PathVariable Long userId) {
		return userService.getUserById(userId);
	}

	@PostMapping
	public void saveUser(@RequestBody User user) {
		userService.saveUser(user);
	}
	
	@PutMapping("{userId}")
	public void updateUser(@RequestBody User user,@PathVariable Long userId) {
		userService.updateUser(user, userId);
	}
	
	
	@GetMapping("/getByUserName/{userName}")
	public User getUserByUserName(@PathVariable String userName) {
		return userService.getUserByUserName(userName);
	}
	
	@GetMapping("/getByUserNameAndPassword/{userName}/{password}")
	public User getUserByUserName(@PathVariable String userName, @PathVariable String password) {
		return userService.getUserByUserNameAndPassword(userName, password);
	}
}
