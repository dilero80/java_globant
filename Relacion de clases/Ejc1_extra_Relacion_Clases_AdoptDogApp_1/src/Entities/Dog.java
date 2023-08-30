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
public class Dog {
    private String name;
    private String raze;
    private Integer age;
    private String size; // big / small / medium ;
    private Person owner = null;
    
    
    
    public Dog() {
    }

    public Dog(String name, String raze, Integer age, String size) {
        this.name = name;
        this.raze = raze;
        this.age = age;
        this.size = size;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRaze() {
        return raze;
    }

    public void setRaze(String raze) {
        this.raze = raze;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    
    
    @Override
    public String toString() {
        return "Dog{" + "name=" + name + ", raze=" + raze + ", age=" + age + ", size=" + size + '}';
    }
    
    
    
    
    
}
