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
public enum WMExamples {
    WM1("WM1",45,"Gray","A",65D),WM2("WM2",25,"Blue","C",35D),WM3("WM3",75,"Black","G",25D),WM4("WM4",15,"Red","B",85D);
    
    String name;
    Integer charge;
    String color;
    String energy;
    Double weight;

    private WMExamples(String name, Integer charge, String color, String energy, Double weight) {
        this.name = name;
        this.charge = charge;
        this.color = color;
        this.energy = energy;
        this.weight = weight;
    }

    public Integer getCharge() {
        return charge;
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

    public String getName() {
        return name;
    }
    
    
    
    
}
