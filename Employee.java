package com.employee;

import com.company.Company;

public class Employee {
	private String name;
	private String designation;
	private double salary;
	private Company company;
	private Employee(String name ,String designation,double salary, Company company) {
		this.name=name;
		this.designation=designation;
		this.company=company;
		this.salary=salary;
	}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public Company getCompany() {
	return company;
}
public void setCompany(Company company) {
	this.company = company;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String toString() {
	return "Employee [name=" + name + ", designation=" + designation + ", salary=" + salary + " ,company=" +company+"]";
}

public static Employee getEmployeeObject(String employeeName, String employeeDesignation, double salary, Company company) 
{
    return new Employee(employeeName, employeeDesignation, salary,company);
}
}


