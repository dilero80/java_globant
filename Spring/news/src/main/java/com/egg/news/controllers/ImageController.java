/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.news.controllers;

import com.egg.news.entities.News;
import com.egg.news.exceptions.NewsExceptions;
import com.egg.news.services.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author drome
 */
@Controller
@RequestMapping("/image")
public class ImageController {
    
    
    @Autowired
    NewsService ns;
    
    @GetMapping("/{id}")
    public ResponseEntity<byte[]> newsImage(@PathVariable String id) throws NewsExceptions{
        try {
            News news = ns.getOne(id);
            byte[] image = news.getImage().getContent();
            
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.IMAGE_JPEG);
            
            return new ResponseEntity<>(image, headers, HttpStatus.OK);
            
            
        } catch (NewsExceptions e) {
            return null;
        }

        
        
        
    }
    
    
}
