package com.info.xpacknow.service;

import java.util.List;

import com.info.xpacknow.domain.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployee();

	Employee getEmployeeById(String employeeID);

	void addEmployee(Employee employee);

	Employee getEmployeeByLogin(String login);

}
