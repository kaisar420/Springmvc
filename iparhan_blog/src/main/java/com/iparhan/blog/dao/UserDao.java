package com.iparhan.blog.dao;


import org.springframework.stereotype.Service;

import com.iparhan.blog.bean.User;


@Service
public interface UserDao {
	User login(User user);
	

}
