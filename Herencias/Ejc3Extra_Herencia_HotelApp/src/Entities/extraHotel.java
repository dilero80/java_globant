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
public abstract class extraHotel extends Hostal {
    protected boolean isPrivated;
    protected Double surface;
    protected boolean isRestaurant;

    public extraHotel() {
    }

    public extraHotel(boolean isPrivated, Double surface, boolean isRestaurant, String address, String name, String locality, String manager) {
        super(address, name, locality, manager);
        this.isPrivated = isPrivated;
        this.surface = surface;
        this.isRestaurant = isRestaurant;
    }

    public boolean isIsPrivated() {
        return isPrivated;
    }

    public void setIsPrivated(boolean isPrivated) {
        this.isPrivated = isPrivated;
    }

    public Double getSurface() {
        return surface;
    }

    public void setSurface(Double surface) {
        this.surface = surface;
    }

    public boolean isIsRestaurant() {
        return isRestaurant;
    }

    public void setIsRestaurant(boolean isRestaurant) {
        this.isRestaurant = isRestaurant;
    }

    
    
    
    
}
