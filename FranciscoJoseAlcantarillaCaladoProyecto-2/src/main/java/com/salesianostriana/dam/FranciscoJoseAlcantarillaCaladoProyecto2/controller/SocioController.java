package com.salesianostriana.dam.FranciscoJoseAlcantarillaCaladoProyecto2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.FranciscoJoseAlcantarillaCaladoProyecto2.model.Socio;
import com.salesianostriana.dam.FranciscoJoseAlcantarillaCaladoProyecto2.service.SocioService;


@Controller
public class SocioController {
	
	
	@Autowired
	private SocioService socioService;
	
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
	
	
	@GetMapping("/sociosAdmin")
	private String listarSocios (Model model) {
		model.addAttribute("listaSocios", socioService.findAll());
		return "socioVistaAdmin";
	}
	
	@GetMapping("/registroSocios")
	private String formRegistro (Model model) {
		Socio socio = new Socio ();
		
		model.addAttribute("formSocios", socio);
		
		return "registroSocio";
	}
	
	
}
