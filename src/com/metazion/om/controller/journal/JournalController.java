package com.metazion.om.controller.journal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/journal")
public class JournalController {

	@RequestMapping(value = "/inoutQuery", method = { RequestMethod.GET })
	public ModelAndView inoutQuery(Model model) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", "Inout Query!");
		modelAndView.setViewName("index");
		return modelAndView;
	}

	@RequestMapping(value = "/resourceQuery", method = { RequestMethod.GET })
	public ModelAndView resourceQuery(Model model) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", "Resource Query!");
		modelAndView.setViewName("index");
		return modelAndView;
	}
}