package com.fatima.springboot.demo.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fatima.springboot.demo.dao.EmployeeDAO;
import com.fatima.springboot.demo.dao.EntityDAO;
import com.fatima.springboot.demo.entity.Department;
import com.fatima.springboot.demo.entity.Employee;

@Service
public class EmployeeService implements EntityService<Employee> {
	
	private EmployeeDAO employeeDAO;
	
	@Autowired
	public EmployeeService(@Qualifier("employeeDAO") EmployeeDAO theEmployeeDAO) {
		employeeDAO = theEmployeeDAO;
	}
	
	@Override
	@Transactional
	public List<Employee> findAll() {
		return employeeDAO.findAll();
	}

	@Override
	@Transactional
	public Employee findById(int theId) {
		Optional<Employee> result = employeeDAO.findById(theId);
		
		 Employee dep = null;
		
		if (result.isPresent()) {
			dep = result.get();
		}
		else {
	
			throw new RuntimeException("Did not find department id - " + theId);
		}
		
		return dep;
	}

	@Override
	@Transactional
	public void save(Employee theEmployee) {
		employeeDAO.save(theEmployee);
	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		employeeDAO.deleteById(theId);
	}

}
