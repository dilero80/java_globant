/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Dog;
import Entities.Person;
import Enumerators.Persons;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author drome
 */
public class PersonService {
    Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    ArrayList<Person> persons = new ArrayList();
    
    public PersonService() {
    }
        
    public Person createPerson(String name, String lastName, Integer age, Integer id ){
        
        return new Person(name, lastName, age, id);
    }
    
    
    
    public void createPersoninList(){
        String name;
        String lastName;
        Integer age;
        Integer id;
        System.out.println("----VAMOS A CREAR UNA PERSONA ---- ");
        System.out.println("Digite el nombre");
        name = read.next();
        
        System.out.println("Digite el Apellido");
        lastName = read.next();
        
        System.out.println("Digite la edad");
        age = read.nextInt();
        
        System.out.println("Digite la identificacion");
        id = read.nextInt();
        persons.add(this.createPerson(name, lastName, age, id));
    }
    
    public void createPersonsTemplate(){
        for (Persons person : Persons.values()) {
            persons.add(this.createPerson(person.getName(), person.getLastName(), person.getAge(), person.getId()));
            
        }
    }
    
    public void listPersons (){
        int cont = 0; 
        String PersonName;
        System.out.println("+--------------------------------------------------------------------------+");
        System.out.println("|---------------------PERSONAS TOTALES-------------------------------------|");
        System.out.println("| Num |  Nombre     |  Apellido   |  Edad  |     ID      |    Perro        |");
        for (Person person : persons) {
            cont++;
            PersonName = person.getName();
            if(cont<10){
                 System.out.print("|  " + cont + "  |");
            }else{
                 System.out.print("| " + cont + "  |");
            }
            System.out.print("   " + PersonName );
            for (int i = 0; i < (10-PersonName.length()); i++) {
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.print("   " + person.getLastName());
            for (int i = 0; i < (10 - person.getLastName().length()); i++) {
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.print("   " + person.getAge() );
            for (int i = 0; i < (5 - person.getAge().toString().length()); i++) {
                System.out.print(" ");
            }
            
            System.out.print("|");
            System.out.print("   " + person.getId());
            for (int i = 0; i < (10- person.getId().toString().length()); i++) {
                System.out.print(" ");
            }

            System.out.print("|");
            
            
            if(!(person.getDog()== null)){
                System.out.print("   " + person.getDog().getName());
                for (int i = 0; i < (10- person.getDog().getName().length()); i++) {
                    System.out.print(" ");
                }
            }else{
                System.out.print("      NO TIENE   ");
            }
            
            
            
            System.out.println("|");


        }
        System.out.println("+--------------------------------------------------------------------------+");
            
    }
    public void listPersonsfilter (){
        int cont = 0; 
        String PersonName;
        System.out.println("+--------------------------------------------------------+");
        System.out.println("|-----------------PERSONAS SIN MASCOTA-------------------|");
        System.out.println("| Num |  Nombre     |  Apellido   |  Edad  |     ID      |");
        for (Person person : persons) {
            if(person.getDog()==null){
                cont++;
                PersonName = person.getName();
                if(cont<10){
                     System.out.print("|  " + cont + "  |");
                }else{
                     System.out.print("| " + cont + "  |");
                }
                System.out.print("   " + PersonName );
                for (int i = 0; i < (10-PersonName.length()); i++) {
                    System.out.print(" ");
                }
                System.out.print("|");
                System.out.print("   " + person.getLastName());
                for (int i = 0; i < (10 - person.getLastName().length()); i++) {
                    System.out.print(" ");
                }
                System.out.print("|");
                System.out.print("   " + person.getAge() );
                for (int i = 0; i < (5 - person.getAge().toString().length()); i++) {
                    System.out.print(" ");
                }

                System.out.print("|");
                System.out.print("   " + person.getId());
                for (int i = 0; i < (10- person.getId().toString().length()); i++) {
                    System.out.print(" ");
                }

                

             System.out.println("|");
            }
            
        }
        System.out.println("+--------------------------------------------------------------------------+");
    }
    
   
    
    public boolean assignDog(DogService ds){
        Integer iduser;
        String petName;
        
        System.out.println("VAMOS A ASIGNAR MASCOTA A USUARIO");
        
        System.out.println("Digite el ID del Usuario que quiere asignar");
        iduser = read.nextInt();
        for (Person person : persons) {
            if (person.getId().equals(iduser)){
                if(person.getDog()== null){
                    System.out.println("Digite el nombre de la mascota que desea asignar");
                    ds.listDogfilter();
                    petName = read.next();
                    for (Dog dog : ds.getDogList()){
                        if(dog.getName().equals(petName)){
                            if(dog.getOwner()== null){
                                System.out.println("Mascota Asignada a " + person.getName() + " " + person.getLastName());
                                ds.assingOwner(dog, person);
                                person.setDog(dog);
                                return true;
                            }
                            else{
                                System.out.println("La mascota ya tiene un dueño");
                                return false;
                            }
                        }
//                        else{
//                            System.out.println("Mascota no encontrada");
//                            return false;
//                        }
                    }
                    System.out.println("Mascota no encontrada");
//                            return false;
                }
                else{
                    System.out.println("Esa persona ya tiene un perro");
                    return false;
                }
                
                
            }
        }
        return false;
    }
            
        
            
}
    



    
    
    
    
    

