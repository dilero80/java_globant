package com.egg.news.controllers;

import com.egg.news.entities.News;
import com.egg.news.exceptions.NewsExceptions;
import com.egg.news.repositories.NewsRepository;
import com.egg.news.repositories.UserRepository;
import com.egg.news.services.NewsService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
    
    @Autowired
    private NewsService ns;
    
    
    @GetMapping("")
    public String adminPanelredirect(){
        System.out.println("redirec");
        return "redirect:/admin/dashboard";
    }
    
    @GetMapping("/dashboard")
    public String adminPanel(ModelMap model) throws NewsExceptions{
        
        try {
            List<News> news = ns.listNews();
            model.addAttribute("news", news);
            model.put("success", "List of news complete");
            
            return "dashboard.html";
            
        } catch (NewsExceptions e) {
            model.put("error ",e.getMessage());
            //System.out.println("error al leer");
            return "dashboard.html";
        
        }
    }
    
    
}
