/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.news.repositories;


import com.egg.news.entities.AppUser;
import com.egg.news.entities.News;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author drome
 */
@Repository
public interface NewsRepository extends JpaRepository<News, String>{
    
    @Query("Select n from News n where n.title = :title")
    public List<News> findByTitle(@Param("title") String title);
    
    /*@Query("Select n from News n where n.title = :%word%")*/
    public List<News> findByTitleContainingIgnoreCase(String word);

    
     
   
    
}