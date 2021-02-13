package com.fatima.springboot.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee_project")
public class EmployeeProject {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	
    public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	@ManyToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
	@JoinColumn(name="employee_id")
	private Employee employee;

    
    
    @OneToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
	@JoinColumn(name="project_id")
	private Project project;


	@Column(name="fte_allocation")
	private String fteAllocation;
	

	public EmployeeProject() {
		
	}


	public EmployeeProject(Employee employee, Project project, String fteAllocation) {
		this.employee = employee;
		this.project = project;
		this.fteAllocation = fteAllocation;
	}


	public Employee getEmployee() {
		return employee;
	}


	public void setEmployee(Employee employee) {
		this.employee = employee;
	}


	public Project getProject() {
		return project;
	}


	public void setProject(Project project) {
		this.project = project;
	}


	public String getFteAllocation() {
		return fteAllocation;
	}


	public void setFteAllocation(String fteAllocation) {
		this.fteAllocation = fteAllocation;
	}


	@Override
	public String toString() {
		return "EmployeeProject [employee=" + employee + ", project=" + project + ", fteAllocation=" + fteAllocation
				+ "]";
	}
	
	
	
	


	

		
}











