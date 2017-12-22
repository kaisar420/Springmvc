package com.iparhan.blog.service;

import org.springframework.stereotype.Service;

import com.iparhan.blog.bean.User;

@Service
public interface UserService{
	
	User login(User user);
	
}