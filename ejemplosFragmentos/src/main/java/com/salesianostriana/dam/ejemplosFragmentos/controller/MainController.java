package com.salesianostriana.dam.ejemplosFragmentos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	
	@GetMapping("/otra")
	public String otra(Model model) {
		model.addAttribute("mensaje", "Este es un mensaje de una cadena");
		
		return "otrapagina";
		
	}
	
	
	@GetMapping("/portada")
	public String portada() {
		return "portada";
	}
	
	
}
