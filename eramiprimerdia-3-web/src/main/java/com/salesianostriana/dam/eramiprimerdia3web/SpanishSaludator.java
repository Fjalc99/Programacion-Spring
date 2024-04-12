package com.salesianostriana.dam.eramiprimerdia3web;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class SpanishSaludator implements Saludator{

	@Override
	public void imprimirSaludo() {
		// TODO Auto-generated method stub
		System.out.println("Hola a todos los programadores de 1º DAM");
	}

	@Override
	public String saludar() {
		// TODO Auto-generated method stub
		return "Hola a todos los programadores de 1º DAM" ;
	}

}
