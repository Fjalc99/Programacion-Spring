package com.salesianostriana.dam.ejemploBuclesYSwitch;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

	
	
	public List <Product> getLista(){
		return Arrays.asList(
				new Product(1,"Botijo","Enfria hasta menos 10 grados",20.5055,true, LocalDateTime.now()),
				new Product(2,"BotijoExtra","Enfria hasta menos 200 grados",200.50,true, LocalDateTime.now())
				);
	}
	
}
