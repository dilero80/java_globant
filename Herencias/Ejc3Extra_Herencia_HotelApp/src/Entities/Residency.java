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
public class Residency extends extraHotel{
    
    protected Integer rooms;
    protected boolean hasSportField;

    public Residency() {
    }

    public Residency(Integer rooms, boolean hasSportField, boolean isPrivated, Double surface, boolean isRestaurant, String address, String name, String locality, String manager) {
        super(isPrivated, surface, isRestaurant, address, name, locality, manager);
        this.rooms = rooms;
        this.hasSportField = hasSportField;
    }

    public Integer getRooms() {
        return rooms;
    }

    public void setRooms(Integer rooms) {
        this.rooms = rooms;
    }

    public boolean isHasSportField() {
        return hasSportField;
    }

    public void setHasSportField(boolean hasSportField) {
        this.hasSportField = hasSportField;
    }

    @Override
    public String toString() {
        return "Residency{" + "rooms=" + rooms + ", hasSportField=" + hasSportField + '}';
    }
    
    
    
    
          
    
}
