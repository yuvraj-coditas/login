package com.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.beans.UserBean;
import com.dao.MainDao;

@Controller
public class MainController {
	
	/*@Autowired
	UserBean userBean;
	*/
/*	@Autowired
	private ResourceBundleMessageSource messageSource;
*/	
	@Autowired
	private ApplicationContext context;
	
	@Autowired
	private MainDao _mainDao;
	
	@RequestMapping("/")
	public String showHome() 
	{
		//System.out.println("Message:"+messageSource.getMessage("test.label", null, Locale.US));
		return "form";
	}
	
	@RequestMapping("/submit")
	public String processForm(HttpServletRequest request,Model data) 
	{
		//System.out.println(messageSource.getBasenameSet()+ " MSG");
		//System.out.println("Message:"+messageSource.getMessage("test.label", null, Locale.US));
		UserBean userBean = (UserBean)context.getBean("userBean");
		List<UserBean> users = new ArrayList<UserBean>(); 
		userBean.setName(request.getParameter("username"));
		userBean.setContactNo(1234567890);
		//userBean.setAddress("Address1");
		users.add(userBean);
		//_mainDao.insertUser(userBean);
		data.addAttribute("users", users);
		return "home";
	}
}
