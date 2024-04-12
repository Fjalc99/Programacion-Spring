package com.salesianostriana.dam.eramiprimerdia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class MainDeMentira {

	@Autowired
	@Qualifier("englishSaludator")  //Dentro del qualifier se pone el nombre del bean y es el nombre de la clase
	private final Saludator saludator;
	
	public MainDeMentira(Saludator saludator) {
		this.saludator=saludator;
	}
	
	@PostConstruct
	public void init () {
		
		
		
		saludator.imprimirSaludo();
		
		
	}
	
	
}
