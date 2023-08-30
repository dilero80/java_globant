/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;


import Entities.Movie;
import Utilities.Comparators;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author drome
 */
public class MovieService {
    Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private ArrayList<Movie> movies;

    public MovieService() {
        movies = new ArrayList();
    }
    
    public Movie createMovie(){
        String title, director;
        Double duration;
      
        System.out.println("=========================");
        System.out.println("=====MOVIE CREATION======");
        System.out.println("=========================");
        System.out.println("Digite nombre Pelicula");
        title = read.next();
        System.out.println("Digite Diretor de la pelicula " + title);
        director = read.next();
        System.out.println("Digite la duracion en horas (Ejc. 1.5 para hora y 30 minutos");
        duration  =read.nextDouble();
        Movie m = new Movie(title, director, duration);
        return m;
        
    }
    
    public Movie createMovie(String title, String director, Double duration){
        Movie m = new Movie(title, director, duration);
        return m;
    }
    
    public void addMoviesFixed(){
        this.movies.add(this.createMovie("A Letter to Momo", "Hiroyuki Okiura", 2.0 ));
        this.movies.add(this.createMovie("The Adventures of Chatran", "Masanori Hata", 1.53));
        this.movies.add(this.createMovie("Anna: 6 - 18", "Nikita Mikhalkov", 1.63 ));
        this.movies.add(this.createMovie("Apocalypse Now", "John Milius ", 2.55 ));
        this.movies.add(this.createMovie("Avatar: The Way of Water", "James Cameron", 3.2));
        this.movies.add(this.createMovie("Corto","Pedro", 0.2));
        System.out.println("creadas");
    }
    
    public void addMovies(){
        String option;
        do{
            this.movies.add(this.createMovie());
            System.out.println("Deseas crear otra Pelicula? (S/N)");
            option = read.next();
            if(!option.equalsIgnoreCase("N") || !option.equalsIgnoreCase("S")){
                System.out.println("Opcion no valida!!");
            }
        }while(!option.equalsIgnoreCase("N"));
    }
    
    public void showMovies(){
        int cont = 0;
        for (Movie movy : movies) {
            cont++;
            System.out.println("============================================");
            System.out.println(cont + " " +  movy);
            System.out.println("============================================");
            
        }
    }
    
    public void showMoviesUp1(){
        int cont = 0;
        for (Movie movy : movies) {
            if(movy.getDuration()>=1.0){
                cont++;
                System.out.println("============================================");
                System.out.println(cont + " " +  movy);
                System.out.println("============================================");
            }
        }
    }
    
    public void orderByDurationAsc(){
        Collections.sort(movies, Comparators.orderByDurationAsc);
        this.showMovies();
    }
    
    public void orderByDurationDesc(){
        Collections.sort(movies, Comparators.orderByDurationDesc);
        this.showMovies();
    }
    
    public void orderBytitle(){
        Collections.sort(movies, Comparators.orderByTitleAsc);
        this.showMovies();
    }
    
    public void orderByDirector(){
        Collections.sort(movies, Comparators.orderByDirector);
        this.showMovies();
    }
    
    
    
    
    
    
    
    
}
