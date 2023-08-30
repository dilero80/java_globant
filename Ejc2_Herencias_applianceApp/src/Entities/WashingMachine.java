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
public class WashingMachine extends Appliance{
    private Integer charge;

    public WashingMachine() {
    }

    public WashingMachine(Integer charge, Integer Price, String color, String energy, Double weight) {
        super(Price, color, energy, weight);
        this.charge = charge;
    }

    public Integer getCharge() {
        return charge;
    }

    public void setCharge(Integer charge) {
        this.charge = charge;
    }

    @Override
    public String toString() {
        return super.toString()+ " is a WashingMachine{" + "charge=" + charge + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
}
