package com.example.mybatisdemo.service;

import com.example.mybatisdemo.entity.User;

import java.util.List;

public interface UserService {

	User findByAcount(String acount);

	List<User> findAll();

	void save(User user);
}
