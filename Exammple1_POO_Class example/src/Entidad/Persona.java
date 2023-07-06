/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author drome
 */
public class Persona {
    public String name;
    public int age;
    public String lastname;

    public Persona(String name, int age, String lastname) {
        this.name = name;
        this.age = age;
        this.lastname = lastname;
    }

       
    public Persona(){
        
    }
    
    public Persona(String nombre){
        this.name = nombre;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getLastname() {
        return lastname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
}
