package com.salesianostriana.dam.FranciscoJoseAlcantarillaCaladoProyecto2.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.FranciscoJoseAlcantarillaCaladoProyecto2.model.Producto;

@Service
public class ProductoService {

	public List <Producto> getLista(){
		return Arrays.asList(
				
				new Producto(1,"Balon de futbol del Centario", "Balón con el que el betis cumplio 100 años", 200.0),
				new Producto(2,"Balon de entrenamiento", "Balón con el real betis realiza los entrenamientos", 30.0),
				new Producto(3,"Camiseta de joaquin", "Camiseta con la que joaquin jugo su ultimo partido", 70.0)
				
				
				);
		
		
		
		
	}
	
}
