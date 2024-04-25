package com.salesianostriana.dam.FranciscoJoseAlcantarillaCaladoProyecto.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class Socio {

	private int idSocio;
	private String nombre, primerApelllido, segundoApellido;
	private String prefijo, telefono, email, repetirEmail;
	private String direccion, pais, provincia, codigoPostal;
	private String dni, contrasenia, repetirContrasenia, nombreUsuario;
	private LocalDate fechaDeNacimiento;
}
