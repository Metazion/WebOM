package com.metazion.om.controller.game;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.metazion.om.pojo.po.Player;
import com.metazion.om.service.IPlayerService;

@Controller
@RequestMapping(value = "/game")
public class GameController {

	@Resource
	private IPlayerService playerService;

	@RequestMapping(value = "/playerQuery", method = { RequestMethod.GET })
	public ModelAndView playerQuery(Model model) {
		List<Player> playerList = playerService.findAll();
		for (Player player : playerList) {
			System.out.println(String.format("Player: id[%d] account[%d] type[%d] nickname[%s]", player.getId(), player.getAccount(), player.getType(), player.getNickname()));
		}

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", "Player Query!");
		modelAndView.setViewName("index");
		return modelAndView;
	}

	@RequestMapping(value = "/mailQuery", method = { RequestMethod.GET })
	public ModelAndView mailQuery(Model model) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", "Mail Query!");
		modelAndView.setViewName("index");
		return modelAndView;
	}
}