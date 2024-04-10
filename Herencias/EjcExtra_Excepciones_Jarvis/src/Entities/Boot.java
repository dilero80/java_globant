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
public class Boot extends ArmourPart{

    public Boot() {
    }

    public Boot(boolean isFunctional, Double energyUsedsingle) {
        super(isFunctional, energyUsedsingle);
    }

    @Override
    public String toString() {
        return "Boot{ Is Functional " + super.isIsFunctional()  + "and Uses " + super.getEnergyUsedsingle() + '}';
    }

    
    
    
    
    
}
