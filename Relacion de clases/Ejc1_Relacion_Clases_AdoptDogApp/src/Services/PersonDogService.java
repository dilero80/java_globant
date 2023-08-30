/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Dog;
import Entities.Person;

/**
 *
 * @author drome
 */
public class PersonDogService {

        public PersonDogService() {
    }
        
    public Person createPerson(String name, String lastName, Integer age, Integer id, Dog dog){
        
        return new Person(name, lastName, age, id, dog);
    }
    
    public Dog CreateDog(String name, String raze, Integer age, String size){
        return new Dog(name, raze, age, size);
    }


    
    
    
    
    
}
