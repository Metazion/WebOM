package com.metazion.om.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.metazion.om.pojo.po.User;

@Controller
@RequestMapping(value = "/admin")
@SessionAttributes("user")
public class AdminController {

	@RequestMapping(value = "/login", method = { RequestMethod.GET })
	public String login(Model model) {
		model.addAttribute("user", new User());
		return "login";
	}

	@RequestMapping(value = "/login", method = { RequestMethod.POST })
	public String login(@ModelAttribute("user") User user) {
		if (user.getUsername().equals("meta")) {
			return "frame";
		} else {
			return "index";
		}
	}

	@RequestMapping(value = "/top", method = { RequestMethod.GET })
	public String top() {
		return "top";
	}

	@RequestMapping(value = "/left", method = { RequestMethod.GET })
	public String left() {
		return "left";
	}

	@RequestMapping(value = "/main", method = { RequestMethod.GET })
	public String main(@ModelAttribute("user") User user) {
		return "main";
	}
}
