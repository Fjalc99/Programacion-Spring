package com.salesianostriana.dam.FranciscoJoseAlcantarillaCaladoProyecto2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.FranciscoJoseAlcantarillaCaladoProyecto2.model.Socio;


@Controller
public class SocioController {
	
	
	@GetMapping("/loginSocio")
	private String loginSocio(Model model) {
		
		Socio socio = new Socio();
		model.addAttribute("loginForm", socio);
		
		return "login";		
	}
	
	@PostMapping("/addSocio")
	public String submit(@ModelAttribute("loginForm")Socio socio, Model model) {
		model.addAttribute("socio", socio);
		
		return"view";
	}
	
	
	
	
	
}
