/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.Objects;

/**
 *
 * @author drome
 */
public class Theater {
    
    private String name;
    private Movie movie;
    private Double price;
    private Seat [][] seats;
    private Integer free;
    final Integer totalSeat = 6*8;
    
    public Theater() {
        this.seats= new Seat [8][6];
        this.free = 6*8;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                seats[i][j]=new Seat(); 
//              seats[i][j].setUser(null); 
//                seats[i][j].setOccupied(false);
            }
        }
    }
    

    public Theater(String name, Movie movie, Double price) {
        this.free = 6*8;
        this.seats= new Seat [8][6];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                seats[i][j]=new Seat(); 
//                seats[i][j].setUser(null); 
//                seats[i][j].setOccupied(false);
            }
        }
        this.name = name;
        this.movie = movie;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovieName(Movie movie) {
        this.movie = movie;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Seat[][] getSeats() {
        return seats;
    }

    public void setSeats(Seat[][] seats) {
        this.seats = seats;
    }

    public Integer getFree() {
        return free;
    }

    public void setFree(Integer free) {
        this.free = free;
    }

    
    
    
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Theater other = (Theater) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Theater{" + "name=" + name + ", movieName=" + movie.getTitle()+ ", price=" + price + '}';
    }
    
    
    
}
