package com.salesianostriana.dam.ejemploDataJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.salesianostriana.dam.ejemploDataJPA.modelo.Alumno;
import com.salesianostriana.dam.ejemploDataJPA.repositorios.AlumnoRepository;

import jakarta.annotation.PostConstruct;

@Component
public class MainDeMentira {

//Las clases que son entidades no se pueden inyectar	
	
	@Autowired
	private AlumnoRepository repo;
	
	
	
	@PostConstruct
	void ejecutar() {
		 repo.save(new Alumno("Luis Miguel","López Magaña","luismi.lopez@salesianos.edu"));
		 repo.save(new Alumno("Ángel","Naranjo González","angel.naranjo@salesianos.edu"));
	     repo.save(new Alumno("Rafael", "Villar Liñán", "rafael.villar@salesianos.edu"));
	
	}
	
	
	
}
