/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.news.controllers;


import com.egg.news.entities.AppUser;
import com.egg.news.entities.News;
import com.egg.news.exceptions.NewsExceptions;
import com.egg.news.services.NewsService;
import com.egg.news.services.UserService;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author drome
 */
@Controller
@RequestMapping("/")
public class PortalController {
    
    @Autowired
    private UserService userService; 
    @Autowired
    private NewsService ns; 
    
    @GetMapping("/") 
    public String index(ModelMap model) throws NewsExceptions{ 
        
        try {
            List<News> news = ns.listNews();
            //Generate a Rnadom News for principal news
            int max = news.size()-1;
            int min = 0;
            int range = max - min + 1;
            Integer newsSub = (int)(Math.random() * range) + min;
            News principalNews = news.get(newsSub);
            model.addAttribute("principalNews",principalNews);
            model.addAttribute("news",news);
            model.put("success", "List Completed");
            return "index.html";
        } catch (NewsExceptions e) {
            model.put("error",e.getMessage());
            //System.out.println("error al grabar");
            return "index.html";
        }
        
    }
    
    
    @GetMapping("/inicio") 
    public String inicio(){
        System.out.println("DIEGO");
        return "inicio.hmtl";
    }
    
    @PreAuthorize("hasAnyRole('ROLE_USER','ROLE_ADMIN')")
    @GetMapping("/init") 
    public String init(HttpSession session){
        
        AppUser logged = (AppUser) session.getAttribute("usersession");
        System.out.println(logged.getRol().toString());
        if (logged.getRol().toString().equals("ADMIN")){
            System.out.println("ADMINISTRADOR");
            return "redirect:/admin/dashboard";
        }
        if (logged.getRol().toString().equals("USER")){
            System.out.println("USUARIO");
            return "inicio.html";
            
        }
        return "index.html";
    }
    
    
    @GetMapping("/login")
    public String login(@RequestParam(required = false) String error, ModelMap model){
        if(error != null){
            model.put("error","Usuario o Contraseña invalidos!");
        }
        return "login.html";
    }
    
    
    @PostMapping("/register")
    public String register(@RequestParam String name, @RequestParam String email, @RequestParam String password, 
            @RequestParam String password2, ModelMap model){
        try {
            
            userService.register(name, email, password, password2);
            
            model.put("success", "User registered");
            
            return "index.html";
        } catch (NewsExceptions ex) {
            model.put("error",ex.getMessage());
            model.put("name", name);
            model.put("email", email);
            return "register.html";
        }
        
    }
    
    @GetMapping("/registernew")
    public String registernew(){
        return "register.html";
    }
   
    
    
    
    
    
}