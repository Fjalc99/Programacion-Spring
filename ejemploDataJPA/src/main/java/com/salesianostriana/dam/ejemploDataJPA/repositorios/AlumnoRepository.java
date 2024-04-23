package com.salesianostriana.dam.ejemploDataJPA.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.dam.ejemploDataJPA.modelo.Alumno;

public interface AlumnoRepository 
	extends JpaRepository<Alumno, Long>{

}
