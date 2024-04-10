/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Appliance;
import java.util.Scanner;

/**
 *
 * @author drome
 */
public class ApplianceService {
    Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    public ApplianceService() {
    }
    
    
    
    
    
    protected Integer finalPrice(Double weight, String energy){
        Integer price;
        switch(energy){
            case "A":
                price = 1000 + this.weightPrice(weight);
                break;
            case "B":
                price = 800 + this.weightPrice(weight);
                break;
            case "C":
                price = 600 + this.weightPrice(weight);
                break;
            case "D":
                price = 500 + this.weightPrice(weight);
                break;
            case "E":
                price = 300 + this.weightPrice(weight);
                break;
            case "F":
                price = 100 + this.weightPrice(weight);
                break;
            default:
                price = 0;
                break;
                
        }
        
        
    return price;    
    }
    
    protected Integer weightPrice(Double weight){
        int w = weight.intValue();
        
        if(w >= 1 && w <= 19){
            return 100;
        }
        else if(w >= 20 && w <= 49){
            return 500;
        }
        else if(w >= 50 && w <= 79){
            return 800;
        }
        else if(w >= 80 ){
            return 1000;
        }
        return 0;
    }
    
            
            
    protected String energyletterCheck (String letter){
        if(letter.equalsIgnoreCase("A") || letter.equalsIgnoreCase("B") || letter.equalsIgnoreCase("C") || letter.equalsIgnoreCase("D") ||letter.equalsIgnoreCase("E") || letter.equalsIgnoreCase("F")){
            letter = letter.toUpperCase();
        }else{
            letter = "F";
        }
        return letter;
    }
    
}
