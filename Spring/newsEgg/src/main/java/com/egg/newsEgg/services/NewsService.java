/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.newsEgg.services;

import com.egg.newsEgg.Entities.News;
import com.egg.newsEgg.Exceptions.NewsExceptions;
import com.egg.newsEgg.repositories.NewsRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author drome
 */
@Service
public class NewsService {
    
    @Autowired
    private NewsRepository newsRepository;

 
    
    
    @Transactional()
    public News createNews(String title, String body) throws NewsExceptions{
        System.out.println("entre a crear noticia");
        validate(title, body);
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        
        System.out.println(news);
        
        return newsRepository.save(news);
        
        
    }
    
    @Transactional(readOnly = true)
    public List<News> listNews(){
        List<News> news= new ArrayList();
        news = newsRepository.findAll();
        return news;
        
    }
    
    @Transactional
    public void modifyNews(String id, String title, String content){
        Optional<News> validateNews= newsRepository.findById(id);
        if(validateNews.isPresent()){
            News news = validateNews.get();
            news.setTitle(title);
            news.setBody(content);
            newsRepository.save(news);
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
