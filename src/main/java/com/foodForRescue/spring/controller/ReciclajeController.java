package com.foodForRescue.spring.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.foodForRescue.spring.model.Reciclaje;
import com.foodForRescue.spring.model.Usuario;
import com.foodForRescue.spring.repository.ReciclajeRepository;

@Controller
public class ReciclajeController {

	private final Logger log = LoggerFactory.getLogger(ProductController.class);
	
	@Autowired
	private ReciclajeRepository reciclajeRepository;
	
	
	
	
	
	
	
	public String root() {
		return "redirect:/reciclajes";
	}

	@GetMapping("/reciclajes")
	public ModelAndView getAllreciclajes(HttpSession session) {
		log.debug("request to get reciclajes");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("reciclaje-list");
		Usuario usuario = (Usuario)session.getAttribute("user");
		mav.addObject("reciclajes", reciclajeRepository.findByUsuario(usuario.getId()));
		return mav;
	}

	@GetMapping("/reciclajes/empty")
	public ModelAndView createreciclaje() {
		log.debug("request to empty reciclaje form");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("reciclaje-edit");
		mav.addObject("reciclaje", new Reciclaje());
		return mav;
	}
}
