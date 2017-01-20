package com.info.xpacknow.repositoryImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.info.xpacknow.domain.Employee;
import com.info.xpacknow.repository.EmployeeRepository;


@Repository
@Transactional(readOnly=true)
public class EmployeeRepositoryImp implements EmployeeRepository {


	
	
	@PersistenceContext(unitName = "testPU")
	private EntityManager entity;
	
	
	@Override
	@Transactional(readOnly=false)
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(readOnly=false)
	public Employee getEmployeeById(String employeeID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(readOnly=false)
	public void addEmployee(Employee employee) {
	
		//pracownik.setHaslo(bcryptEncoder.encode(pracownik.getHaslo()));
		
		
		entity.persist(employee);

      
		
		

	}

	@Override
	@Transactional(readOnly=false)
	@SuppressWarnings("unchecked")
	public Employee getEmployeeByLogin(String login) {
  	Query query = entity.createQuery("from Employee u where u.login = :login");
        
     
        
        query.setParameter("login", login);
        List<Employee> userList = query.getResultList();
        
        
        if (userList.size() > 0)
            return userList.get(0);
        else
            return null;    
    
	}

}
