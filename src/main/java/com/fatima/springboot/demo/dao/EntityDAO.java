package com.fatima.springboot.demo.dao;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import com.fatima.springboot.demo.entity.Employee;

public interface EntityDAO<T> {
/*
	    Optional<T> get(int id);
	    Collection<T> getAll();
	    int 
	    void update(T t);
	    void delete(T t);
	    */
	
		public List<T> findAll();
		
		public T findById(int theId);
		
		public void save(T t);
		
		public void deleteById(int theId);
}
