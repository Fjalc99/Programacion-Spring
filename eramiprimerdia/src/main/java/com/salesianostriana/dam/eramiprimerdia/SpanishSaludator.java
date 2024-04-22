package com.salesianostriana.dam.eramiprimerdia;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Service
@Primary
public class SpanishSaludator implements Saludator{

	@Override
	public void imprimirSaludo() {
		// TODO Auto-generated method stub
		System.out.println("Hola a todos los programadores de 1º DAM");
	}

	
	@PostConstruct
	void alComenzar () {
		
		System.out.println("Metodo \"alComenzar\" anotado con @PostConstruct ");
	}
	
	
	@PreDestroy
	void antesDeDestruir () {
		
		System.out.println("Metodo \"antesDeDestruir\" anotado con @PreDestroy");
		
	}
}
