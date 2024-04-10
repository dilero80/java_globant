/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.news.services;

import com.egg.news.entities.AppUser;
import com.egg.news.enumerators.Rol;
import com.egg.news.exceptions.NewsExceptions;
import com.egg.news.repositories.UserRepository;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Service
public class UserService implements UserDetailsService {
    
    @Autowired
    private UserRepository userRepository;
    
    @Transactional
    public void register(String name, String email, String password, String password2) throws NewsExceptions{
     
        validate(name,email,password, password2);
        
        AppUser user = new AppUser();
        
        user.setName(name);
        user.setEmail(email);
        
        user.setRol(Rol.USER);
        
        user.setPassword(new BCryptPasswordEncoder().encode(password));
        
        userRepository.save(user);
        
        
        
    }
    
    public void validate(String name, String email, String password, String password2) throws NewsExceptions{
        if(name.isEmpty() || name == null){
            throw new NewsExceptions("Name can't be empty or null");
        }
        if(email.isEmpty() || email == null){
            throw new NewsExceptions("Email can't be emtpy ot null");
        }
        if(password.isEmpty() || password == null || password.length() <=7){
            throw new NewsExceptions("password can't not be empty and must be at least 8 character");
        }
        if (!password2.equals(password)){
            throw new NewsExceptions("Passwords are not equal");
        }
        
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        AppUser appuser = userRepository.findByEmail(email);
        if (appuser != null){
            
            
            List<GrantedAuthority> permissions = new ArrayList();
            
            GrantedAuthority p = new SimpleGrantedAuthority("ROLE_"+ appuser.getRol());
            
            permissions.add(p);
            
            ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
            
            HttpSession session = attr.getRequest().getSession(true);
            
            session.setAttribute("usersession", appuser);
            
            return new User(appuser.getEmail(), appuser.getPassword(),permissions);
        }
        else{
            return null;
        }
    }
}
