package com.info.xpacknow.repositoryImp;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.info.xpacknow.domain.Role;
import com.info.xpacknow.repository.RoleDAO;

@Repository
public class RoleDAOImpl implements RoleDAO {

	@PersistenceContext(unitName = "testPU")
	private EntityManager entityManager;

	

	public Role getRole(int id) {
		
		
		Role role =(Role) entityManager.find(Role.class, id);
		
		
		return role;
	}

}