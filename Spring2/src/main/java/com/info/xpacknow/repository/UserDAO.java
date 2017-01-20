package com.info.xpacknow.repository;

import com.info.xpacknow.domain.User;

public interface UserDAO {
    
    User getUser(String login);
 
}
