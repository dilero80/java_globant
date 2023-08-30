/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Movie;
import java.util.Scanner;

/**
 *
 * @author drome
 */
public class MovieService {
    Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    
    public MovieService() {
    }
    
    public Movie createMovie(){
        String title;
        String director;
        Integer minAge;
        Double duration;
        
        System.out.println("-----LET'S CREATE A MOVIE--------");
        System.out.print("Insert Movie name: ");
        title = read.next();
        System.out.print("Insert Director's Name: ");
        director = read.next();
        System.out.println("Insert Minimum Age ");
        minAge = read.nextInt();
        System.out.println("Insert Duration in minutes ");
        duration = read.nextDouble();
        
        return new Movie(title, director, minAge, duration);
        
    }
    
    public Movie createMovie(String title, String director, Integer minAge, Double duration){
        return new Movie(title, director, minAge, duration);
    }
    
    
    
    
    
    
    
    
    
    
}
