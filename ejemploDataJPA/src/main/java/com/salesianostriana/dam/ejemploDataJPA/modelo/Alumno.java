package com.salesianostriana.dam.ejemploDataJPA.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor @AllArgsConstructor
@Data
@Table(name="Alumnado")
public class Alumno {

	@Id @GeneratedValue
	private Long id;
	
	private String nombre;
	
	private String apellidos;
	
	private String email;
	

	public Alumno(String nombre, String apellidos, String email) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;

	}

	
	
	
	
}


