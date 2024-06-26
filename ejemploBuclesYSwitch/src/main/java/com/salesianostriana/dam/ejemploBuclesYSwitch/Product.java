package com.salesianostriana.dam.ejemploBuclesYSwitch;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class Product {

	private long id;
	private String name;
	private String description;
	private double price;
	private boolean inStock = false;
	
	@DateTimeFormat(iso = ISO.DATE_TIME)
	private LocalDateTime date;
}
