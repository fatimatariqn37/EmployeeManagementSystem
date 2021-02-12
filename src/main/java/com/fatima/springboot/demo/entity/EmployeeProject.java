package com.fatima.springboot.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="description")
public class EmployeeProject {


	public EmployeeProject() {
		
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="employee_id")
	private int employee_id;
	
	@Column(name="project_id")
	private String project_id;
	
	@Column(name="fte_allocation")
	private String fte_allocation;
	
	

		
}











