package com.fatima.springboot.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fatima.springboot.demo.entity.Department;
import com.fatima.springboot.demo.entity.Office;

public interface OfficeDAO extends JpaRepository<Office, Integer> {

}
