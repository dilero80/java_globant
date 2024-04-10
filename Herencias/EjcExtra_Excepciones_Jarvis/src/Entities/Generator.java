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
public class Generator {
    private Double energy;

    public Generator() {
    }

    
    
    public Generator(Double energy) {
        this.energy = energy;
    }

    public Double getEnergy() {
        return energy;
    }

    public void setEnergy(Double energy) {
        this.energy = energy;
    }

    @Override
    public String toString() {
        return "Generator{" + "energy=" + energy + '}';
    }
    
    
    
    
    
    
}
