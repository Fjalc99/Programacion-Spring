package com.salesianostriana.dam.eramiprimerdia2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class MainDeMentira {

	@Autowired
	@Qualifier("englishSaludator")
	private Saludator saludator;
	
	
	public void ini () {
		
		saludator.imprimirSaludo();
	}
	
	
	
}
