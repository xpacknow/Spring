package com.info.xpacknow.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info.xpacknow.domain.Employee;
import com.info.xpacknow.repository.EmployeeRepository;
import com.info.xpacknow.service.EmployeeService;

@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
private EmployeeRepository pracownikRepository;
	
	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployeeById(String employeeID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addEmployee(Employee employee) {
		
		pracownikRepository.addEmployee(employee);

	}

	@Override
	public Employee getEmployeeByLogin(String login) {

		return pracownikRepository.getEmployeeByLogin(login) ;
	}

}
