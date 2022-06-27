package com.hil.main.controller;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hil.main.model.User;
import com.hil.main.service.UserService;

@Controller
@ComponentScan(basePackages = {"com.hil.main.service"})
@MapperScan(basePackages = {"com.hil.main.dao"})
public class MainController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/")
	public ModelAndView mvcmainpage() throws Exception {
		ModelAndView mav = new ModelAndView("main");
		mav.addObject("name", "Brian");
		return mav;
	}

	@RequestMapping(value="/userlistview")
	public ModelAndView mvcuserlistviewpage() throws Exception {
		List<User> userList = userService.getAllUsers();	
		ModelAndView mav = new ModelAndView("userlistview");
		mav.addObject("userList", userList);
		return mav;
	}
	
	@RequestMapping(value="/useradd.do", method=RequestMethod.POST)
	@ResponseBody
	private ModelAndView msvuseraddpage(User user, Model model) {
		userService.addUser(user);
		List<User> userList = userService.getAllUsers();
		ModelAndView mav = new ModelAndView("userlistview");
		mav.addObject("userList", userList);
		return mav;
	}
}