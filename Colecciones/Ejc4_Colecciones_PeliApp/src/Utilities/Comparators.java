/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import Entities.Movie;
import java.util.Comparator;

/**
 *
 * @author drome
 */
public class Comparators {
    
    public static Comparator<Movie> orderByDurationAsc = new Comparator<Movie>() {
        @Override
        public int compare(Movie m1, Movie m2) {
            return m2.getDuration().compareTo(m1.getDuration());
        }
    };
    
    public static Comparator<Movie> orderByDurationDesc = new Comparator<Movie>() {
        @Override
        public int compare(Movie m1, Movie m2) {
            return m1.getDuration().compareTo(m2.getDuration());
        }
    };

    public static Comparator<Movie> orderByTitleAsc = new Comparator<Movie>() {
        @Override
        public int compare(Movie m1, Movie m2) {
            return m2.getTitle().compareTo(m1.getTitle());
        }
    };
    
    public static Comparator<Movie> orderByTitleDesc = new Comparator<Movie>() {
        @Override
        public int compare(Movie m1, Movie m2) {
            return m1.getTitle().compareTo(m2.getTitle());
        }
    };
    
    public static Comparator<Movie> orderByDirector = new Comparator<Movie>() {
        @Override
        public int compare(Movie m1, Movie m2) {
            return m1.getDirector().compareTo(m2.getDirector());
        }
    };
    
}
