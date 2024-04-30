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
	private Long id;
	
	private String nombre;
	private String apellidos;
	private String telefono; 
	private String email;
	private String direccion; 
	private String provincia; 
	private String codigoPostal;
	private String dni;
	private String contrasenia;
	private String repetirContrasenia;
	private LocalDate fechaDeNacimiento;
}
