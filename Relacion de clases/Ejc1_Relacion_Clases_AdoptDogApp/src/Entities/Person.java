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
public class Person {
    private String name;
    private String lastName;
    private Integer age;
    private Integer id;
    private Dog dog;

    public Person() {
    }

    public Person(String name, String lastName, Integer age, Integer id, Dog dog) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.id = id;
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", lastName=" + lastName + "\n" + ", age=" + age + ", id=" + id + "\n "+", dog=" + dog + '}';
    }
    
    
    
  
  
  
  
  
  
  
  
  
  
  
    
   
    
        
    
}
