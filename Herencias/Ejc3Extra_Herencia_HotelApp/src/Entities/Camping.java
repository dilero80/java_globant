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
public class Camping extends extraHotel{
    
    protected Integer bathrooms;
    protected Integer camps;

    public Camping() {
    }

    public Camping(Integer bathrooms, Integer camps, boolean isPrivated, Double surface, boolean isRestaurant, String address, String name, String locality, String manager) {
        super(isPrivated, surface, isRestaurant, address, name, locality, manager);
        this.bathrooms = bathrooms;
        this.camps = camps;
    }

    public Integer getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(Integer bathrooms) {
        this.bathrooms = bathrooms;
    }

    public Integer getCamps() {
        return camps;
    }

    public void setCamps(Integer camps) {
        this.camps = camps;
    }

    @Override
    public String toString() {
        return "Camping{" + "bathrooms=" + bathrooms + ", camps=" + camps + '}';
    }

    
    
    
    
    
    
    
    
}
