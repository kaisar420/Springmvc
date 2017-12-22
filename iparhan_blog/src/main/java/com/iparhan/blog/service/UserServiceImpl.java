package com.iparhan.blog.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iparhan.blog.bean.User;
import com.iparhan.blog.dao.UserDao;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	public User login(User user) {
		// TODO Auto-generated method stub
		return userDao.login(user);
	}

}

