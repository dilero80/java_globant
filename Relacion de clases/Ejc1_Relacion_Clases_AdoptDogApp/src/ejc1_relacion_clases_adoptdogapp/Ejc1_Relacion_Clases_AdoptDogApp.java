/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejc1_relacion_clases_adoptdogapp;

import Entities.Dog;
import Entities.Person;
import Entities.Sizes;
import Services.PersonDogService;
import java.util.Scanner;

/**
 *
 * @author drome
 */
public class Ejc1_Relacion_Clases_AdoptDogApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        
        PersonDogService ps = new PersonDogService();
        
        Dog d1 = ps.CreateDog("Rambo", "Pincher", 3, Sizes.SMALL.toString() );
        Dog d2 = ps.CreateDog("Snoopy", "Poodle", 5, Sizes.MEDIUM.toString());
        
        Person p1 = ps.createPerson("Diego", "Romero", 43, 79881592, d1);
        Person p2 = ps.createPerson("Alex", "Hernandez", 52, 79517316, d2);
        
        System.out.println(p1);
        System.out.println(p2);
        
    }
    
}
