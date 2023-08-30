/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author drome
 */
public class Seat {
    private User user;
    private boolean occupied;

    public Seat() {
        this.user = null;
        this.occupied = false;
    
    }

    public Seat(User user, boolean occupied) {
        this.user = user;
        this.occupied = occupied;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    @Override
    public String toString() {
        return "Seat{" + "user=" + user + ", occupied=" + occupied + '}';
    }
    
    
}