/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.news.services;

import com.egg.news.entities.Image;
import com.egg.news.exceptions.NewsExceptions;
import com.egg.news.repositories.ImageRepository;
import java.io.IOException;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author drome
 */
@Service
public class ImageService {
    
    @Autowired
    private ImageRepository imageRepository;
    
    public Image save(MultipartFile file) {
        if(file != null){
            try {
                
                Image image = new Image();
                
                image.setMime(file.getContentType());
                
                image.setName(file.getName());
                
                image.setContent(file.getBytes());
                
                return imageRepository.save(image);
                
            } catch (IOException e) {
                System.err.println(e.getMessage());
            } 
        }
        return null;
        
    }
    
    public Image updateImage(MultipartFile file, String idImage) throws NewsExceptions{
         if(file != null){
            try {
                
                Image image = new Image();
                
                if(idImage != null){
                    Optional<Image> ans = imageRepository.findById(idImage);
                    
                    if (ans.isPresent()){
                        image = ans.get();
                    }
                }
                
                image.setMime(file.getContentType());
                
                image.setName(file.getName());
                
                image.setContent(file.getBytes());
                
                return imageRepository.save(image);
                
            } catch (IOException e) {
                System.err.println(e.getMessage());
            } 
        }
        return null;
    }
    
}
