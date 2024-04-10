/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.Scanner;

/**
 *
 * @author drome
 */
public class Appliance {
    
    protected Integer Price;
    protected String color;
    protected String energy; //A y F
    protected Double weight;

    public Appliance() {
    }

    public Appliance(Integer Price, String color, String energy, Double weight) {
        this.Price = Price;
        this.color = this.colorCheck(color);
        this.energy = this.energyletterCheck(energy);
        this.weight = weight;
    }

    public Integer getPrice() {
        return Price;
    }

    public void setPrice(Integer Price) {
        this.Price = Price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = this.colorCheck(color);
    }

    public String getEnergy() {
        return energy;
    }

    public void setEnergy(String energy) {
        this.energy = this.energyletterCheck(energy);
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
    
    private String energyletterCheck (String letter){
        if(letter.equalsIgnoreCase("A") || letter.equalsIgnoreCase("B") || letter.equalsIgnoreCase("C") || letter.equalsIgnoreCase("D") ||letter.equalsIgnoreCase("E") || letter.equalsIgnoreCase("F")){
            letter = letter.toUpperCase();
            
        }else{
            letter = "F";
        }
           
        return letter;
    }
    
    private String colorCheck (String color){
        if(color.equalsIgnoreCase("WHITE") || color.equalsIgnoreCase("BLACK")|| color.equalsIgnoreCase("RED") || color.equalsIgnoreCase("BLUE") || color.equalsIgnoreCase("GRAY")){
            color = color.toUpperCase();
            return color;
        }else{
            color = "WHITE";
            return color;
        }
        
    }

    @Override
    public String toString() {
        return "Appliance{" + "Price=" + Price + ", color=" + color + ", energy=" + energy + ", weight=" + weight + '}';
    }
    
   
    
    
    
    
}
