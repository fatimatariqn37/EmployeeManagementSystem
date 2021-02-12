package com.fatima.springboot.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {


	public Employee() {
		
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getWork_position_id() {
		return work_position_id;
	}

	public void setWork_position_id(String work_position_id) {
		this.work_position_id = work_position_id;
	}

	public String getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(String department_id) {
		this.department_id = department_id;
	}

	public String getOffice_id() {
		return office_id;
	}

	public void setOffice_id(String office_id) {
		this.office_id = office_id;
	}

	public String getCv() {
		return cv;
	}

	public void setCv(String cv) {
		this.cv = cv;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getSupervisor_id() {
		return supervisor_id;
	}

	public void setSupervisor_id(String supervisor_id) {
		this.supervisor_id = supervisor_id;
	}

	public String getIs_active() {
		return is_active;
	}

	public void setIs_active(String is_active) {
		this.is_active = is_active;
	}

	public String getAvailable_leave_days() {
		return available_leave_days;
	}

	public void setAvailable_leave_days(String available_leave_days) {
		this.available_leave_days = available_leave_days;
	}

	public String getAvailable_sick_days() {
		return available_sick_days;
	}

	public void setAvailable_sick_days(String available_sick_days) {
		this.available_sick_days = available_sick_days;
	}

	@Column(name="birth_date")
	private String birthDate;
	
	
	@Column(name="work_position_id")
	private String work_position_id;
	
	
	@Column(name="department_id")
	private String department_id;
	
	@Column(name="office_id")
	private String office_id;
	
	
	@Column(name="cv")
	private String cv;
	
	@Column(name="salary")
	private String salary;
	
	@Column(name="supervisor_id")
	private String supervisor_id;
	
	
	@Column(name="is_active")
	private String is_active;
	
	
	@Column(name="available_leave_days")
	private String available_leave_days;
	
	@Column(name="available_sick_days")
	private String available_sick_days;

	public Employee(int id, String firstName, String lastName, String birthDate, String work_position_id,
			String department_id, String office_id, String cv, String salary, String supervisor_id, String is_active,
			String available_leave_days, String available_sick_days) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.work_position_id = work_position_id;
		this.department_id = department_id;
		this.office_id = office_id;
		this.cv = cv;
		this.salary = salary;
		this.supervisor_id = supervisor_id;
		this.is_active = is_active;
		this.available_leave_days = available_leave_days;
		this.available_sick_days = available_sick_days;
	}
	

		
}











