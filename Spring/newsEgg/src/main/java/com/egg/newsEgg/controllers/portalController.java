/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.newsEgg.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author drome
 */
@Controller
@RequestMapping("/")
public class portalController {
    @GetMapping("/") 
    public String index() { 
        return "index.html";
    }
   
    
    
    
}
