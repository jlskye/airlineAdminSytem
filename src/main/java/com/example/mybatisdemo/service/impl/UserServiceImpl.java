package com.example.mybatisdemo.service.impl;

import com.example.mybatisdemo.entity.User;
import com.example.mybatisdemo.mapper.UserMapper;
import com.example.mybatisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	public User findByAcount(String acount){
		return userMapper.findByAcount(acount);
	}
	public List<User> findAll() {
		return userMapper.findAll();
	}
	public void save(User user) {
		userMapper.insert(user);
	}
}
