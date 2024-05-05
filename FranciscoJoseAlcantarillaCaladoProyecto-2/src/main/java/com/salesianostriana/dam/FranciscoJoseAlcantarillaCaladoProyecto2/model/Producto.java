package com.salesianostriana.dam.FranciscoJoseAlcantarillaCaladoProyecto2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Producto {

	@Id @GeneratedValue
	private Long id;
	
	private String nombre;
	private String descripcion;
	private double precio;
	private String imagen;
	
	@ManyToOne
	@JoinColumn(foreignKey = @ForeignKey(name="fk_producto_categoria"))
	private Categoria categoria;
	
	
	
	
	
	public void addCategoria(Categoria categoria) {
		this.categoria = categoria;
		categoria.getProductos().add(this);
	}
	
	public void deleteCategoria(Categoria categoria) {
		categoria.getProductos().remove(this);
		this.categoria = categoria;
		
	}
}
