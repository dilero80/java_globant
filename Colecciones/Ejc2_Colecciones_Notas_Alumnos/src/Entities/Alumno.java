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
public class Alumno {
    private String name;
    private ArrayList<Double> notes;

    public Alumno() {
    }

    public Alumno(String name, ArrayList<Double> notes) {
        this.name = name;
        this.notes = notes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Double> getNotes() {
        return notes;
    }

    public void setNotes(ArrayList<Double> notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Alumno{" + "name=" + name + ", notes=" + notes + '}';
    }
    
    
    
    
}
