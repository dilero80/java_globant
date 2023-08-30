/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.ArrayList;

/**
 *
 * @author drome
 */
public class Razas {
    private ArrayList <String> races;

    // constructor

    public Razas() {
        this.races = new ArrayList();
    }
    
    
    public Razas(ArrayList<String> races) {
        this.races = races;
    }
    
    // getter & setter

    public ArrayList<String> getRaces() {
        return races;
    }

    public void setRaces(ArrayList<String> races) {
        this.races = races;
    }

    @Override
    public String toString() {
        return "Razas{" + "races=" + races + '}';
    }
    
    
    
}
