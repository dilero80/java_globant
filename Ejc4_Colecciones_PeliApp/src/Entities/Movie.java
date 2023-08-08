/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.Comparator;

/**
 *
 * @author drome
 */
public class Movie {
    private String title;
    private String director;
    private Double duration;// hours

    //*Constructor
    public Movie() {
    }

    public Movie(String title, String director, Double duration) {
        this.title = title;
        this.director = director;
        this.duration = duration;
    }
    
    // Getter & Setter

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }
    
    
    
    //To String

    @Override
    public String toString() {
        return "Pelicula{" + "title=" + title + ", director=" + director + ", duration=" + duration + '}';
    }
    
    
    
    
    
    
           
    
}
