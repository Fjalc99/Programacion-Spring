package com.salesianostriana.dam.FranciscoJoseAlcantarillaCaladoProyecto.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.salesianostriana.dam.FranciscoJoseAlcantarillaCaladoProyecto.services.ProductoService;

@Controller
public class ProductoController {
	
	
	@Autowired
	private ProductoService service;
	
	
	
	
	@GetMapping("/producto")
	private String listarProductos(Model model) {
		
		model.addAttribute("listaProductos", service.getLista());
		return "Productos";
	}
}
