package com.salesianostriana.dam.FranciscoJoseAlcantarillaCaladoProyecto2.service.base;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class 
		BaseServiceImpl <T, ID, R extends JpaRepository <T, ID>>
		implements BaseService<T, ID>{

	//Se pone protected para que las clases que extienden de el se pueda usar sus funciones/metodos
	@Autowired
	protected R repository;
	
	
	@Override
	public List<T> findAll() {
		return repository.findAll();
	}

	@Override
	public Optional<T> findById(ID id) {
		return repository.findById(id);
	}

	@Override
	public T save(T t) {
		return repository.save(t);
	}

	@Override
	public T edit(T t) {
		return repository.save(t);
	}

	@Override
	public void delete(T t) {
		repository.delete(t);
		
	}

	@Override
	public void deleteById(ID id) {
		repository.deleteById(id);		
	}
	
}
