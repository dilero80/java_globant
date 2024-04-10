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
public abstract class ArmourPart {
    private boolean isFunctional;
    private Double energyUsedsingle;

    public ArmourPart() {
    }

    
    
    public ArmourPart(boolean isFunctional, Double energyUsedsingle) {
        this.isFunctional = isFunctional;
        this.energyUsedsingle = energyUsedsingle;
    }

    public boolean isIsFunctional() {
        return isFunctional;
    }

    public void setIsFunctional(boolean isFunctional) {
        this.isFunctional = isFunctional;
    }

    public Double getEnergyUsedsingle() {
        return energyUsedsingle;
    }

    public void setEnergyUsedsingle(Double energyUsedsingle) {
        this.energyUsedsingle = energyUsedsingle;
    }

    @Override
    public String toString() {
        return "ArmourPart{" + "isFunctional=" + isFunctional + ", energyUsedsingle=" + energyUsedsingle + '}';
    }
    
    
    
    
    
}
