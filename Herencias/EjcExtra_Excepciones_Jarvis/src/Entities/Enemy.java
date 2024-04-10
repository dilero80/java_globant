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
public class Enemy {
    
   private Double health;
   private Boolean hostil;
   private Double [] coordinates; // [x][y][z]

    public Enemy() {
        this.coordinates = new Double[3];
    }

    public Enemy(Double health, Boolean hostil, Double[] coordinates) {
        this.health = health;
        this.hostil = hostil;
        this.coordinates = coordinates;
    }

    public Double getHealth() {
        return health;
    }

    public void setHealth(Double health) {
        this.health = health;
    }

    public Boolean getHostil() {
        return hostil;
    }

    public void setHostil(Boolean hostil) {
        this.hostil = hostil;
    }

    public Double[] getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Double[] coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public String toString() {
        return "Enemy{" + "health=" + health + ", hostil=" + hostil + ", coordinates=" + coordinates + '}';
    }
    
    
    
    
   
   
   
   
   
   
   
   

    
}
