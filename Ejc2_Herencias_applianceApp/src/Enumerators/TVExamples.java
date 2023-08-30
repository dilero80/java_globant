/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enumerators;

/**
 *
 * @author drome
 */
public enum TVExamples {
   TV1("TV1",50,true,"White","A",25D),TV2("TV2",35,false,"Black","C",15D),TV3("TV3",75,true,"Red","T",45D),TV4("TV4",21,true,"Black","E",15D),TV5("TV5",75,false,"Black","B",85D); 
    String name;
    Integer resolution; //inches
    boolean tdt; // true / false
    String color; 
    String energy;
    Double weight;
    
    private TVExamples(String name, Integer resolution, boolean tdt, String color, String energy, Double weight) {
        this.name = name;
        this.resolution = resolution;
        this.tdt = tdt;
        this.color = color;
        this.energy = energy;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public Integer getResolution() {
        return resolution;
    }

    public boolean isTdt() {
        return tdt;
    }

    public String getColor() {
        return color;
    }

    public String getEnergy() {
        return energy;
    }

    public Double getWeight() {
        return weight;
    }
    
    
   
   
   

   
    
}
