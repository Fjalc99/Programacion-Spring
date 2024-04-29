package com.salesianostriana.dam.FranciscoJoseAlcantarillaCaladoProyecto2.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor @AllArgsConstructor
@Entity
public class Socio {

	@Id @GeneratedValue
	private int idSocio;
	
	private String nombre, apellidos;
	private String telefono, email;
	private String direccion, provincia, codigoPostal;
	private String dni, contrasenia, repetirContrasenia;
	private LocalDate fechaDeNacimiento;
}
