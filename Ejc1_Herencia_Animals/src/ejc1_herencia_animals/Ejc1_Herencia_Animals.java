/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejc1_herencia_animals;

import Entities.Animal;
import Entities.Cat;
import Entities.Dog;
import Entities.Horse;

/**
 *
 * @author drome
 */
public class Ejc1_Herencia_Animals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal dog1 = new Dog("Stich", "Carnivoro", 15, "Doberman");
        dog1.feed();
        
        Animal dog2 = new Dog("Teddy", "Croquetas", 10, "Chihahua");
        dog2.feed();
        
        Animal cat1 = new Cat("Pelusa", "Galletas", 15, "Siames");
        cat1.feed();
        
        Animal horse1 = new Horse("Spark", "Pasto", 25," FIno");
        horse1.feed();
        
    }
    
}
