package com.fatima.springboot.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fatima.springboot.demo.entity.Department;

public interface DepartmentDAO extends JpaRepository<Department, Integer> {

}
