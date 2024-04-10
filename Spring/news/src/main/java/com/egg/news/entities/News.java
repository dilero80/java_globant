/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.news.entities;

/**
 *
 * @author drome
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author drome
 */
@Data
@Entity 
public class News {
    
     /*@GenericGenerator(name ="uuid", strategy = "uuid2")*/
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name="uuid", strategy = "uuid2")
    private String id;
    
    
    private String title;
    @Column(columnDefinition = "LONGTEXT", name = "body")
    private String body;
    
    @OneToOne
    private AppUser user;
    
    @OneToOne
    private Image image;

     
    
    
    
}

