package com.info.xpacknow.serviceimp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.info.xpacknow.repository.EmployeeRepository;



@Service
@Transactional(readOnly=true)
public class EmployeeUserDetailsService implements UserDetailsService {
     

    @Autowired

    private EmployeeRepository employeeRepository ;
  
 
    public UserDetails loadUserByUsername(String login)
    		throws UsernameNotFoundException {
                                                   

    	System.out.println("login : " + login);
    	
     com.info.xpacknow.domain.Employee domainPracownicy = employeeRepository.getEmployeeByLogin(login);         

     if (domainPracownicy == null) {
     	 throw new UsernameNotFoundException("User " + login + " not found!");
     	
      }
  
     
 
     
        boolean enabled = true;
        boolean accountNonExpired = true;
        boolean credentialsNonExpired = true;
        boolean accountNonLocked = true;
 
    
        
        return	new User(
        		
                domainPracownicy.getLogin(), 
                domainPracownicy.getHaslo(), 
                enabled, 
                accountNonExpired, 
                credentialsNonExpired, 
                accountNonLocked,
                getAuthorities());
              
         
        
        
       
        
    }
     
    public Collection<GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authList = getGrantedAuthorities(getRoles());
        return authList;
    }
     
    public List<String> getRoles() {
 
        List<String> roles = new ArrayList<String>();

    
            roles.add("ROLE_USER");
        
        return roles;
    }
     
    public static List<GrantedAuthority> getGrantedAuthorities(List<String> roles) {
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
         
        for (String role : roles) {
            authorities.add(new SimpleGrantedAuthority(role));
        }
        return authorities;
    }
 
}

