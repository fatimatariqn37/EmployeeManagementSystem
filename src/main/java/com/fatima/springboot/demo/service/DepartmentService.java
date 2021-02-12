package com.fatima.springboot.demo.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.fatima.springboot.demo.dao.DepartmentDAO;
import com.fatima.springboot.demo.dao.EmployeeDAO;
import com.fatima.springboot.demo.dao.EntityDAO;
import com.fatima.springboot.demo.entity.Department;
import com.fatima.springboot.demo.entity.Employee;

@Scope(value = "session")
@Component(value = "departmentService")
public class DepartmentService implements EntityService<Department> {
	
	private DepartmentDAO departmentDAO;
	
	@Autowired
	public DepartmentService(@Qualifier("departmentDAO") DepartmentDAO theDepartmentDAO) {
		departmentDAO = theDepartmentDAO;
	}
	
	@Override
	@Transactional
	public List<Department> findAll() {
		return departmentDAO.findAll();
	}

	@Override
	@Transactional
	public Department findById(int theId) {
			Optional<Department> result = departmentDAO.findById(theId);
					
					Department dep = null;
					
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
	public void save(Department dep) {
		departmentDAO.save(dep);
	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		departmentDAO.deleteById(theId);
	}

}
