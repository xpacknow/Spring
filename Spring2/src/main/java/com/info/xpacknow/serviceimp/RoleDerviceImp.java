package com.info.xpacknow.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.info.xpacknow.domain.Role;
import com.info.xpacknow.repository.RoleDAO;
import com.info.xpacknow.service.RoleService;



@Service
@Transactional
public class RoleDerviceImp implements RoleService {

	@Autowired
	private RoleDAO roleDAO;

	public Role getRole(int id) {
		return roleDAO.getRole(id);
	}

}
