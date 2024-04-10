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
public class Animal {
    protected String name;
    protected String food;
    protected Integer age;
    protected String race;

    public Animal(String name, String food, Integer age, String race) {
        this.name = name;
        this.food = food;
        this.age = age;
        this.race = race;
    }

    public void feed(){
        System.out.println("Comiendo");
    }
    
    
    
}
