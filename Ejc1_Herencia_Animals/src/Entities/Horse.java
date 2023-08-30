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
public class Horse extends Animal{

    public Horse(String name, String food, Integer age, String race) {
        super(name, food, age, race);
    }
    
    
    @Override
    public void feed (){
        System.out.println("El caballo " + this.name + " come " + this.food );
    }
}
    
    
    
    

