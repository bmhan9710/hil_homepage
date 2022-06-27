package com.hil.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hil.main.dao.UserMapper;
import com.hil.main.model.User;

@Service
public class UserService {
	
	@Autowired
	private UserMapper usermapper;
	
	public List<User> getAllUsers(){
		final List<User> userList = usermapper.findAll();
		return userList;
	}
	
	public void addUser(User user) {
		usermapper.save(user);
	}
	
}
