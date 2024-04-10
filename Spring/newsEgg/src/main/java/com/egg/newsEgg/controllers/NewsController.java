/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.newsEgg.controllers;

import com.egg.newsEgg.Exceptions.NewsExceptions;
import com.egg.newsEgg.services.NewsService;
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
@RequestMapping("/news") //localhost/news
public class NewsController {
    protected NewsService ns;

    public NewsController(NewsService ns) {
        this.ns = new NewsService();
    }
    
    
    @GetMapping("/add") //localhost/news/add
    public String add(){
        return "new_news_form.html";
    }
    
    @PostMapping("/newnews") //localhost/news/newnews
    public String newnews(@RequestParam String title, @RequestParam String body, ModelMap model) throws NewsExceptions{
        try {
            System.out.println("INTENTO GRABAR");
            System.out.println("title "+ title+" body " + body);
            ns.createNews(title, body);
            System.out.println("grabe");
            model.put("success", "La noticia fue cargada correctamente");
            
        } catch (NewsExceptions e) {
            model.put("error",e.getMessage());
            System.out.println("error al grabar");
            return "new_news_form.html";
        }
    return "index.html";
    }
        
}
