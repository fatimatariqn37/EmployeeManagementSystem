package com.fatima.springboot.demo.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.fatima.springboot.demo.dao.EmployeeDAO;
import com.fatima.springboot.demo.dao.EntityDAO;
import com.fatima.springboot.demo.entity.Employee;

@Scope(value = "session")
@Component(value = "employeeService")
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
		return employeeDAO.findById(theId);
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
