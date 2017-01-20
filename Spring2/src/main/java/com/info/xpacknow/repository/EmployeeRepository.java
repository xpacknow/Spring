package com.info.xpacknow.repository;

import java.util.List;

import com.info.xpacknow.domain.Employee;



public interface EmployeeRepository {

	List<Employee> getAllEmployee();

	Employee getEmployeeById(String employeeID);

	void addEmployee(Employee employee);
	
	 Employee getEmployeeByLogin(String login);
	
}
