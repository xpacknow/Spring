package com.info.xpacknow.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.info.xpacknow.domain.User;
import com.info.xpacknow.repository.UserDAO;
import com.info.xpacknow.service.UserService;

@Service
@Transactional
public class UserServiceImp implements UserService {
     
    @Autowired
    private UserDAO userDAO;
 
    public User getUser(String login) {
        return userDAO.getUser(login);
    }
 
}
