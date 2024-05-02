package com.salesianostriana.dam.FranciscoJoseAlcantarillaCaladoProyecto2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.FranciscoJoseAlcantarillaCaladoProyecto2.model.Producto;
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
	
	
	/*@GetMapping("/descripcionProducto")
	private String vistaDescripcion(Model model) {
		Producto producto = new Producto ();
		model.addAttribute("vistaDescripcion", producto);
		return "descripcionDelProducto";
	}*/
	
	@GetMapping("/formularioProducto")
	public String formularioProducto(Model model) {
		Producto producto = new Producto ();
		model.addAttribute("productoForm", producto);
		
		return "formularioProductos";
	}
	
	@PostMapping("/addProducto")
	public String submit(@ModelAttribute("productoForm")Producto producto, Model model) {
		return "productosVistaAdmin";
	}
}
