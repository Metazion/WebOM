package com.metazion.om.controller.account;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.metazion.om.pojo.po.User;
import com.metazion.om.service.IUserService;

@Controller
@RequestMapping(value = "/account")
@SessionAttributes("user")
public class AccountController {

	@Resource
	private IUserService userService;

	@RequestMapping(value = "/userQuery", method = { RequestMethod.GET })
	public ModelAndView userQuery(Model model) {
		List<User> userList = userService.findAll();
		for (User user : userList) {
			System.out.println(String.format("User: id[%d] username[%s] password[%s]", user.getId(), user.getUsername(), user.getPassword()));
		}

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", "User Query!");
		modelAndView.setViewName("index");
		return modelAndView;
	}

	@RequestMapping(value = "/userModify", method = { RequestMethod.GET })
	public ModelAndView userModify(Model model) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", "User Modify!");
		modelAndView.setViewName("index");
		return modelAndView;
	}

	@RequestMapping(value = "/userDelete", method = { RequestMethod.GET })
	public ModelAndView userDelete(Model model) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", "User Delete!");
		modelAndView.setViewName("index");
		return modelAndView;
	}
}