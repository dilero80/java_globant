/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Television;

/**
 *
 * @author drome
 */
public class TvService extends ApplianceService{

    public TvService() {
    }
    
    public Television createTV(){
        Integer resolution;
        boolean tdt;
        Integer price;
        String color;
        String energy;
        Double weight;
        System.out.println("------Create Television-------");
                  
        System.out.println("Enter Color (must be White / Black / Red / Blue / Gray");
        color =read.next();
           
        System.out.println("Enter Energy type (A/B/C/D/E/F)");
        energy =read.next();
        energy = super.energyletterCheck(energy);
           
        System.out.println("Enter Weight");
        weight =read.nextDouble();
        
        System.out.println("Enter Screen size");
        resolution =read.nextInt();
        
        System.out.println("It has TDT (Y/N)");
        tdt = read.next().equalsIgnoreCase("y");
        
        
        price = this.finalPrice(weight,energy,resolution, tdt);
        
        return new Television(resolution, tdt, price, color, energy, weight);
        
    }
    
    public Television createTV(Integer resolution, boolean tdt, String color, String energy, Double weight){
        
        energy = super.energyletterCheck(energy);
        Integer price = this.finalPrice(weight,energy,resolution, tdt);
        
        return new Television(resolution, tdt, price, color, energy, weight);
        
    }
    
    public Integer finalPrice(Double weight, String energy, Integer resolution, boolean tdt){
        Integer price;
        int r = resolution;
        price = super.finalPrice(weight, energy);
        if(r >= 40 && tdt){
            return  (int) ((price * 1.3) + 500);
        }
        else if (r >40){
            return (int) (price*1.3);
        }
        else {
            return price;
        }
        
    }
}
    

