package com.salesianostriana.dam.FranciscoJoseAlcantarillaCaladoProyecto2.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @AllArgsConstructor @NoArgsConstructor
public class Producto {

	@Id @GeneratedValue
	private int idProducto;
	
	private String nombreProd;
	private String descripcionProd;
	private double precio;
	//private String imagen;
	
}
