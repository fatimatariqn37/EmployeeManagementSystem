package com.fatima.springboot.demo.dao;

import java.util.List;
import java.util.Optional;

public interface EntityDAO<T> {
	public List<T> findAll();
	
	public Optional<T> findById(int theId);
	
	public void save(T t);
	
	public void deleteById(int theId);

}
