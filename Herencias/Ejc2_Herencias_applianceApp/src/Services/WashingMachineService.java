/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Appliance;
import Entities.WashingMachine;

/**
 *
 * @author drome
 */
public class WashingMachineService extends ApplianceService{

    public WashingMachineService() {
    }
    
    
    public WashingMachine createWashingMachine(){
        Integer charge;
        Integer price;
        String color;
        String energy;
        Double weight;
        System.out.println("------Create Washing Machine-------");
                  
        System.out.println("Enter Color (must be White / Black / Red / Blue / Gray");
        color =read.next();
           
        System.out.println("Enter Energy type (A/B/C/D/E/F)");
        energy =read.next();
        energy = super.energyletterCheck(energy);
           
        System.out.println("Enter Weight");
        weight =read.nextDouble();
        
        System.out.println("Enter Capacity in KG");
        charge =read.nextInt();
        
        price = this.finalPrice(weight,energy,charge);
        
           
        return new WashingMachine (charge, price, color, energy, weight);
    }
    
    public WashingMachine createWashingMachine(Integer charge, String color, String energy, Double weight){
        energy = super.energyletterCheck(energy);
        Integer price = this.finalPrice(weight,energy,charge);
        return new WashingMachine (charge, price, color, energy, weight);
    }
    
    
    
    
       
        
        
        
        
    
    
    
    public Integer finalPrice(Double weight, String energy, Integer charge){
        Integer price;
        int c = charge;
        price = super.finalPrice(weight, energy);
        if(c >= 30){
            return price + 500;
        }
        else {
            return price;
        }
        
    }
}
