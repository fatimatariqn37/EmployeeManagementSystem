package com.fatima.springboot.demo.service;

import java.util.List;

public interface EntityService<T> {

	
	public List<T> findAll();
	
	public T findById(int theId);
	
	public void save(T t);
	
	public void deleteById(int theId);
}
