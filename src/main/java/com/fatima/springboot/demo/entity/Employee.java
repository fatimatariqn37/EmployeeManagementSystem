package com.fatima.springboot.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	
	@Column(name="birth_date")
	private String birthDate;
	

    @OneToMany(mappedBy="employee",cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
    private List<EmployeeProject> employeeProjects;
    
    
    @ManyToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
	@JoinColumn(name="office_id")
	private Office office;
    
    
    
    
    @ManyToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
    @JoinColumn(name = "department_id ")
    private Department department;

    
    @ManyToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
    @JoinColumn(name = "work_position_id ")
    private EmployeeType employeeType;

	
	@Column(name="cv")
	private String cv;
	
	@Column(name="salary")
	private String salary;
	
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "supervisor_id")
    private Employee isSupervisor;
    
    
	@Column(name="is_active")
	private String isActive;
	
	
	@Column(name="available_leave_days")
	private String availableLeaveDays;
	
	@Column(name="available_sick_days")
	private String availableSickDays;
	
    
    
	public Employee() {
		
	}



	public Employee(int id,String firstName, String lastName, String birthDate, List<EmployeeProject> employeeProjects,
			Office office, Department department, EmployeeType employeeType, String cv, String salary,
			Employee isSupervisor, String isActive, String availableLeaveDays, String availableSickDays) {
		this.id=id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.employeeProjects = employeeProjects;
		this.office = office;
		this.department = department;
		this.employeeType = employeeType;
		this.cv = cv;
		this.salary = salary;
		this.isSupervisor = isSupervisor;
		this.isActive = isActive;
		this.availableLeaveDays = availableLeaveDays;
		this.availableSickDays = availableSickDays;
	}



	public Employee(int id, String firstName, String lastName) {
		this.id=id;
		this.firstName = firstName;
		this.lastName = lastName;
	}



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



	public List<EmployeeProject> getEmployeeProjects() {
		return employeeProjects;
	}



	public void setEmployeeProjects(List<EmployeeProject> employeeProjects) {
		this.employeeProjects = employeeProjects;
	}



	public Office getOffice() {
		return office;
	}



	public void setOffice(Office office) {
		this.office = office;
	}



	public Department getDepartment() {
		return department;
	}



	public void setDepartment(Department department) {
		this.department = department;
	}



	public EmployeeType getEmployeeType() {
		return employeeType;
	}



	public void setEmployeeType(EmployeeType employeeType) {
		this.employeeType = employeeType;
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



	public Employee getIsSupervisor() {
		return isSupervisor;
	}



	public void setIsSupervisor(Employee isSupervisor) {
		this.isSupervisor = isSupervisor;
	}



	public String getIsActive() {
		return isActive;
	}



	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}



	public String getAvailableLeaveDays() {
		return availableLeaveDays;
	}



	public void setAvailableLeaveDays(String availableLeaveDays) {
		this.availableLeaveDays = availableLeaveDays;
	}



	public String getAvailableSickDays() {
		return availableSickDays;
	}



	public void setAvailableSickDays(String availableSickDays) {
		this.availableSickDays = availableSickDays;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", birthDate=" + birthDate
				+ ", employeeProjects=" + employeeProjects + ", office=" + office + ", department=" + department
				+ ", employeeType=" + employeeType + ", cv=" + cv + ", salary=" + salary + ", isSupervisor="
				+ isSupervisor + ", isActive=" + isActive + ", availableLeaveDays=" + availableLeaveDays
				+ ", availableSickDays=" + availableSickDays + "]";
	}
	
	
	
	

		
}











