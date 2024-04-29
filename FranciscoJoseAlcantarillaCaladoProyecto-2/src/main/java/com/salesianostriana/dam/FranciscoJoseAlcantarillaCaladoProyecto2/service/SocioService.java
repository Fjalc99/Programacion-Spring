package com.salesianostriana.dam.FranciscoJoseAlcantarillaCaladoProyecto2.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.FranciscoJoseAlcantarillaCaladoProyecto2.model.Socio;

@Service
public class SocioService {

	public List <Socio> getLista(){
		return Arrays.asList(
					
					new Socio (),
					new Socio (),
					new Socio (),
					new Socio (),
					new Socio (),
					new Socio ()
				
				
				);
	}
}
