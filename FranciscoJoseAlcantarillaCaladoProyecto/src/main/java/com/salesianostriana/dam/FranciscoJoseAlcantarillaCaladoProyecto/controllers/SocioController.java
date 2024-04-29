package com.salesianostriana.dam.FranciscoJoseAlcantarillaCaladoProyecto.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.salesianostriana.dam.FranciscoJoseAlcantarillaCaladoProyecto.model.Socio;

@Controller
public class SocioController {

	@GetMapping("/loginSocio")
	private String loginSocio(Model model) {
		
		Socio socio = new Socio();
		model.addAttribute("loginForm", socio);
		
		return "login";
	}
	
}
