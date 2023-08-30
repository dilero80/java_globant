/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Dog;
import Entities.Person;
import Enumerators.Dogs;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author drome
 */
public class DogService {
    Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    ArrayList<Dog> dogs = new ArrayList();
    
    public Dog CreateDog(String name, String raze, Integer age, String size){
    return new Dog(name, raze, age, size);
    }
    
    public void createDogsTemplate(){
        for (Dogs dog : Dogs.values()) {
            dogs.add(this.CreateDog(dog.getName(), dog.getRaze(), dog.getAge(), dog.getSize()));
        }
    }
    
    
    public void createDoginList(){
        String name;
        String raze;
        Integer age;
        String size;
        System.out.println("----VAMOS A CREAR UN PERRO ---- ");
        System.out.println("Digite el nombre");
        name = read.next();
        
        System.out.println("Digite la raza");
        raze = read.next();
        
        System.out.println("Digite la edad");
        age = read.nextInt();
        
        System.out.println("Digite el tamaño");
        size = read.next();
        dogs.add(this.CreateDog(name, raze, age, size));
        
    }
    
    public void listDog (){
        int cont = 0; 
        String dogName;
        System.out.println("+--------------------------------------------------------------------------+");
        System.out.println("|------MASCOTAS TOTALES----------------------------------------------------|");
        System.out.println("| Num |  Nombre     |    Raza     |    Tamaño   |  Edad  |    Dueño        |");
        for (Dog dog : dogs) {
            cont++;
            dogName = dog.getName();
            if(cont<10){
                 System.out.print("|  " + cont + "  |");
            }else{
                 System.out.print("| " + cont + "  |");
            }
            System.out.print("   " + dogName );
            for (int i = 0; i < (10-dogName.length()); i++) {
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.print("   " + dog.getRaze() );
            for (int i = 0; i < (10-dog.getRaze().length()); i++) {
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.print("   " + dog.getSize() );
            for (int i = 0; i < (10-dog.getSize().length()); i++) {
                System.out.print(" ");
            }
            
            System.out.print("|");
            System.out.print("   " + dog.getAge() );
            for (int i = 0; i < (5- dog.getAge().toString().length()); i++) {
                System.out.print(" ");
            }

            System.out.print("|");
            
            
            if(!(dog.getOwner()== null)){
                System.out.print("   " + dog.getOwner().getName());
                for (int i = 0; i < (5- dog.getOwner().getName().length()); i++) {
                    System.out.print(" ");
                }
            }else{
                System.out.print("      NO TIENE   ");
            }
            
            
            
            System.out.println("|");


        }
        System.out.println("+--------------------------------------------------------------------------+");
            
    }
    
    
    public void listDogfilter (){
        int cont = 0; 
        String dogName;
        System.out.println("+--------------------------------------------------------+");
        System.out.println("|------MASCOTAS TOTALES----------------------------------|");
        System.out.println("| Num |  Nombre     |    Raza     |    Tamaño   |  Edad  |");
        for (Dog dog : dogs) {
            if(dog.getOwner()== null){
                cont++;
                dogName = dog.getName();
                if(cont<10){
                     System.out.print("|  " + cont + "  |");
                }else{
                     System.out.print("| " + cont + "  |");
                }
                System.out.print("   " + dogName );
                for (int i = 0; i < (10-dogName.length()); i++) {
                    System.out.print(" ");
                }
                System.out.print("|");
                System.out.print("   " + dog.getRaze() );
                for (int i = 0; i < (10-dog.getRaze().length()); i++) {
                    System.out.print(" ");
                }
                System.out.print("|");
                System.out.print("   " + dog.getSize() );
                for (int i = 0; i < (10-dog.getSize().length()); i++) {
                    System.out.print(" ");
                }

                System.out.print("|");
                System.out.print("   " + dog.getAge() );
                for (int i = 0; i < (5- dog.getAge().toString().length()); i++) {
                    System.out.print(" ");
                }

                



                System.out.println("|");

            }
        }
        System.out.println("+--------------------------------------------------------------------------+");
            
    }
    
    public ArrayList<Dog> getDogList(){
        return this.dogs;
    }
    
    public void assingOwner (Dog d, Person p){
        d.setOwner(p);
        
    }
}
