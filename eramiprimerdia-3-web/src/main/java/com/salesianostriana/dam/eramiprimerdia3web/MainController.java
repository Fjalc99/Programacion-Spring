package com.salesianostriana.dam.eramiprimerdia3web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	@Autowired
	private Saludator saludator;
	
	@GetMapping("/") 
	@ResponseBody
	public String wrlcome() {
		return saludator.saludar();
	}
}
