/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.news.services;


import com.egg.news.entities.AppUser;
import com.egg.news.entities.Image;
import com.egg.news.entities.News;
import com.egg.news.exceptions.NewsExceptions;
import com.egg.news.repositories.NewsRepository;
import com.egg.news.repositories.UserRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author drome
 */
@Service
public class NewsService {
    
    @Autowired
    private NewsRepository newsRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ImageService imageService;
    
    
    
     
    
    
    @Transactional()
    public void createNews(MultipartFile file, String title, String body, String user) throws NewsExceptions {
     
        try {
            
            validate(title, body);
            News news = new News();
            news.setTitle(title);
            news.setBody(body);
            
            AppUser appuser = new AppUser();
            
            appuser = userRepository.findByEmail(user);
            
            news.setUser(appuser);
            
            Image image = imageService.save(file);
            
            news.setImage(image);
                    
            newsRepository.save(news);
        } catch (Exception e) {
            // Manejar la excepción adecuadamente
            throw new NewsExceptions("Error creating news: " + e.getMessage());
        }
    }
    
    @Transactional
    public void modifyNews(MultipartFile file, String id, String title, String content, String userEmail) throws NewsExceptions{
        try {
            Optional<News> validateNews= newsRepository.findById(id);
            if(validateNews.isPresent()){
                News news = validateNews.get();
                news.setTitle(title);
                news.setBody(content);
                AppUser appuser = new AppUser();
            
                appuser = userRepository.findByEmail(userEmail);
            
                news.setUser(appuser);
            
                String idImage = null;
                
                if (news.getImage() != null){
                    idImage = news.getImage().getId();
                }
                
                Image image = imageService.updateImage(file,idImage);
                
                news.setImage(image);
                
                newsRepository.save(news);
            }
            
        } catch (Exception e) {
            throw new NewsExceptions("Error modifying  news: " + e.getMessage());
        }
            
        
    }
    
    @Transactional(readOnly = true)
    public List<News> listNews() throws NewsExceptions{
        try {
            List<News> news= new ArrayList();
            news = newsRepository.findAll();
            System.out.println(news);
            return news;
            
        } catch (Exception e) {
            throw new NewsExceptions("Error LISTING NEWS: " + e.getMessage());
        }
        
        
    }
    
    @Transactional (readOnly = true)
    public List<News> findByString(String title) throws NewsExceptions{
        try {
            List<News> news= new ArrayList();
            news = newsRepository.findByTitleContainingIgnoreCase(title);
            System.out.println(news);
            return news;

        } catch (Exception e) {
            throw new NewsExceptions("Error finding news: " + e.getMessage());
        }
        
    }
    
    @Transactional (readOnly = true)
    public News findById(String id) throws NewsExceptions{
        try {
            Optional<News> news = newsRepository.findById(id);
            if(news.isPresent()){
                System.out.println(news);
                return news.get();
                
            }
            throw new Exception("News Not Found");

        } catch (Exception e) {
            throw new NewsExceptions("Error finding news: " + e.getMessage());
        }
    }
    
    @Transactional (readOnly = true)
    public News getOne(String id) throws NewsExceptions{
        try {
            News news = newsRepository.getOne(id);
            if(news != null){
                
                return news;
                
            }
            throw new Exception("News Not Found");

        } catch (Exception e) {
            throw new NewsExceptions("Error finding news: " + e.getMessage());
        }
    }
    
    
    
    
    
    @Transactional
    public void deleteNews(String id) throws NewsExceptions{
        try {
            Optional<News> validateNews= newsRepository.findById(id);
            if(validateNews.isPresent()){
                News news = validateNews.get();
                newsRepository.delete(news);
            }
            
        } catch (Exception e) {
            throw new NewsExceptions("Error deleting News: " + e.getMessage());
        }
            
        
    }
    
    private void validate(String title, String content) throws NewsExceptions{
        
        if(title == null || title.isEmpty()){
            throw new NewsExceptions(("It must Have a Title"));
            
        }
        
        if(content == null || content.isEmpty()){
            throw new NewsExceptions(("Body must not been Empty"));
            
        }
            
    }
    
    
    
}
