package com.whnm.springmvcjavabased.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/persona")
public class PersonaController {
	
	//@GetMapping //ahora se realiza con esta etiqueta
	@RequestMapping(value="/saludar", method = RequestMethod.GET)
	public String saludar(ModelMap model) {
		model.addAttribute("nombres", "Wilson");
		model.addAttribute("apellidos", "Neira");
		return "persona";
	}
	
	@RequestMapping(value="/mostrar", method = RequestMethod.GET)
	public ModelAndView saludar() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("persona");
		mv.addObject("nombres", "Wilson");
		mv.addObject("apellidos", "Neira");
		return mv;
	}
}
