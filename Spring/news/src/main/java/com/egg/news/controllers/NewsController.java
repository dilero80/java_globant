/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.news.controllers;


import com.egg.news.entities.News;
import com.egg.news.exceptions.NewsExceptions;
import com.egg.news.services.NewsService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author drome
 */

@Controller
@RequestMapping("/news") //localhost/news
public class NewsController {
    @Autowired
    protected NewsService ns;

    public NewsController(NewsService ns) {
        this.ns = new NewsService();
    }
    
    
    @GetMapping("/add") //localhost/news/add
    public String add(){
        return "new_news_form.html";
    }
    
    @PostMapping("/newnews") //localhost/news/newnews
    public String newnews(@RequestParam String user, @RequestParam String title, @RequestParam String body, ModelMap model, @RequestParam MultipartFile file) throws NewsExceptions{
        
        //ns.createNews(title, body);
        try {
            System.out.println("INTENTO GRABAR 2");
            //System.out.println("title "+ title+" body " + body);
            ns.createNews(file, title, body, user);
            //System.out.println("grabe");
            model.put("success", "La noticia fue cargada correctamente");
            
        } catch (NewsExceptions e) {
            model.put("error",e.getMessage());
            //System.out.println("error al grabar");
            return "new_news_form.html";
        }
    return "new_news_form.html";
        
    }
    
    @GetMapping("/search") //localhost/news/search
    public String search(){
        return "search_news.html";
    }
    
    @PostMapping("/searchbytitle") //localhost/news/newnews
    public String searchbytitle(@RequestParam String title, ModelMap model) throws NewsExceptions{
        
        //ns.createNews(title, body);
        try {
            List<News> news = new ArrayList();
            news = ns.findByString(title);
            model.addAttribute("news", news);
            model.put("success", "La noticia fue encontrada correctamente");
            
        } catch (NewsExceptions e) {
            model.put("error ",e.getMessage());
            //System.out.println("error al grabar");
            return "search_news.html";
        }
    return "list_news.html";
        
    }
    
    @GetMapping("/modifynews")//localhost/modifynews
    public String modifynews (ModelMap model) throws NewsExceptions{
        try {
            return "findnews.html";
            
        } catch (Exception e) {
            model.put("error ",e.getMessage());
            return "list_news.html";
        }
    }
     
    @PostMapping("/modify/") //localhost/news/modify
    public String modify(@RequestParam String id, ModelMap model) throws NewsExceptions{
        try {
            
            if (id != ""){
                System.out.println("entre a ir anoti");
                News news = ns.getOne(id);
                model.addAttribute("news" , news);
                model.put("success", "La noticia fue encontrada correctamente");
                return "modify_news.html";
            }
            System.out.println("el id es" + id);
            throw new Exception("El ID No puede estar vacio");
            
            
        } catch (Exception e) {
            model.put("error ",e.getMessage());
            return "findnews.html";
        }
 
    }
    
    @GetMapping("/modify/{id}") //localhost/news/modify/.....
    public String modifybyGet(@PathVariable String id, ModelMap model) throws NewsExceptions{
        try {
            
            if (id != ""){
                System.out.println("entre a ir anoti");
                News news = ns.getOne(id);
                model.addAttribute("news" , news);
                model.put("success", "La noticia fue encontrada correctamente");
                return "modify_news.html";
            }
            System.out.println("el id es" + id);
            throw new Exception("El ID No puede estar vacio");
            
            
        } catch (Exception e) {
            model.put("error ",e.getMessage());
            return "findnews.html";
        }
 
    }
    
    @GetMapping("/delete/{id}") //localhost/news/modify/.....
    public String deletebyGet(@PathVariable String id, ModelMap model) throws NewsExceptions{
        try {
            
            if (id != ""){
                System.out.println("entre a borrar");
                ns.deleteNews(id);
                model.put("success", "news deleted ");
                return "list_news.html";
            }
            System.out.println("el id es" + id);
            throw new Exception("ID cannot be empty");
            
            
        } catch (Exception e) {
            model.put("error ",e.getMessage());
            return "list_news.html";
        }
 
    }
    
    @PostMapping("/modnews/{id}") //localhost/news/modnews
    public String modnews(@RequestParam String user, @RequestParam MultipartFile file, @RequestParam String id, @RequestParam String title, @RequestParam String body, ModelMap model) throws NewsExceptions{
        
        //ns.createNews(title, body);
        try {
            ns.modifyNews(file, id, title, body, user);
            model.addAttribute(ns.getOne(id));
            model.put("success", "News Modified correctly");
            return "list_news.html";
            
        } catch (NewsExceptions e) {
            model.put("error",e.getMessage());
            //System.out.println("error al grabar");
            return "modify_news.html";
        }
    
    }
//    
//    @PostMapping("/modnews/") //localhost/news/modnews
//    public String modnews(@RequestParam String id, ModelMap model) throws NewsExceptions{
//        
//        try {
//            News news = ns.getOne(id);
//            
//            model.addAttribute(news);
//            model.put("success", "La noticia fue modificada correctamente");
//            
//        } catch (NewsExceptions e) {
//            model.put("error",e.getMessage());
//            //System.out.println("error al grabar");
//            return "modify_news.html";
//        }
//    return "list_news.html";
//    }
    
    @GetMapping("/listnews") //localhost/news/modnews
    public String listNews(ModelMap model) throws NewsExceptions{
        try {
            List<News> news = ns.listNews();
            model.addAttribute("news",news);
            model.put("success", "Listado completo");
            return "list_news.html";
        } catch (NewsExceptions e) {
            model.put("error",e.getMessage());
            //System.out.println("error al grabar");
            return "modify_news.html";
        }
   
    }
    
    
}
