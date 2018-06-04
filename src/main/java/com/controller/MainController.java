package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.beans.UserBean;

@Controller
public class MainController {
	
	/*@Autowired
	UserBean userBean;
	*/
	
	@Autowired
	private ApplicationContext context;
	
	@RequestMapping("/")
	public String showHome() 
	{
		return "form";
	}
	
	@RequestMapping("/submit")
	public String processForm(HttpServletRequest request,Model data) 
	{
		UserBean userBean = (UserBean)context.getBean("userBean");
		List<UserBean> users = new ArrayList<UserBean>(); 
		userBean.setName(request.getParameter("username"));
		userBean.setContactNo(1234567890);
		userBean.setAddress("Address1");
		users.add(userBean);
		data.addAttribute("users", users);
		return "home";
	}
}
