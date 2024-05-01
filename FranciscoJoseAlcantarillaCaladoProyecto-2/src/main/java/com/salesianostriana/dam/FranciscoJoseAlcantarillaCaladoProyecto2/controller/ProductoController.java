package com.salesianostriana.dam.FranciscoJoseAlcantarillaCaladoProyecto2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.salesianostriana.dam.FranciscoJoseAlcantarillaCaladoProyecto2.service.ProductoService;

@Controller
public class ProductoController {

	@Autowired
	private ProductoService productoservice;
	
	@GetMapping("/productoAdmin")
	private String listarProductos(Model model) {
		model.addAttribute("listaProductos", productoservice.findAll());
		return "productosVistaAdmin";
	}
	
	
	@GetMapping("/producto")
	private String vistaTienda(Model model) {
		model.addAttribute("listaProductos", productoservice.findAll());
		return "producto";
	}
}
