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
public class Television extends Appliance {
    private Integer resolution;
    private boolean tdt;

    public Television() {
    }

 

    public Television(Integer resolution, boolean tdt, Integer Price, String color, String energy, Double weight) {
        super(Price, color, energy, weight);
        this.resolution = resolution;
        this.tdt = tdt;
    }

    public Integer getResolution() {
        return resolution;
    }

    public void setResolution(Integer resolution) {
        this.resolution = resolution;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    @Override
    public String toString() {
        
        return super.toString() + " is a Television{" + "resolution=" + resolution + ", tdt=" + tdt + '}';
    }
    
    
    
    
    
    
    
}
