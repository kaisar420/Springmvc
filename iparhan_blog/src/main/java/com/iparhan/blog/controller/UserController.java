package com.iparhan.blog.controller;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;
import com.iparhan.blog.service.UserService;


@Controller
@RequestMapping("/iparhan")
public class UserController {
	 static Logger log =  LogManager.getLogger(UserController.class.getName());

	@Autowired
	private UserService userService;
	
	/**
	 * 
	 * @param modelAndView
	 * @return
	 */
	@RequestMapping("/")
	public ModelAndView index(ModelAndView modelAndView) {
		System.out.println("Helllo");
		 return new ModelAndView("index");
	}
	
	/**
	 * index.html
	 * @param modelAndView
	 * @param httpServletResponse
	 * @return
	 */
	@RequestMapping("/adminLogin")
	public ModelAndView adminLogin(ModelAndView modelAndView,HttpServletResponse httpServletResponse){
		httpServletResponse.setContentType("text/html;charset=UTF-8");
		System.out.println("AdminLogin==============ddsd");
		return new ModelAndView("admin/index");

	}
	
	/**
	 * main.html
	 * @param httpServletResponse
	 * @return
	 */
	@RequestMapping(value = "/adminIndex", produces = MediaType.TEXT_HTML_VALUE + ";charset=UTF-8")
	public String adminIndex(HttpServletResponse httpServletResponse) {
		httpServletResponse.setContentType("text/html;charset=utf-8");
		System.out.println("Hello");
		return "admin/main";
	}
	
	
	
}
