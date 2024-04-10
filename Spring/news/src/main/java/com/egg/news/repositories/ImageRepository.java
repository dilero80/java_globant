/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.news.repositories;

import com.egg.news.entities.Image;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author drome
 */
public interface ImageRepository extends JpaRepository<Image, String>{
    
}
