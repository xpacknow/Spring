package com.info.xpacknow.repositoryImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;


import com.info.xpacknow.domain.User;
import com.info.xpacknow.repository.UserDAO;



@Repository
public class UserDAOImpl implements UserDAO {
     
	@PersistenceContext(unitName = "testPU")
	private EntityManager entityManager;
     
  
    @SuppressWarnings("unchecked")
	public User getUser(String login) {
    	
    	
    	
       
        
        
        
    	Query query = entityManager.createQuery("from User u where u.login = :login");
        
     
        
        query.setParameter("login", login);
        List<User> userList = query.getResultList();
        
        
        if (userList.size() > 0)
            return userList.get(0);
        else
            return null;    
    }
 
}
