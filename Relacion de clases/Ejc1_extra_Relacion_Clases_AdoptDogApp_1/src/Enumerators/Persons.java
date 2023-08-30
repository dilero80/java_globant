/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enumerators;



/**
 *
 * @author drome
 */
public enum Persons {
    
    DIEGOROMERO("Diego", "Romero", 43, 79881592), ALEXHERNANDEZ("Alex", "Hernandez", 52, 79517316), ELSABUITRAGO("Elsa","Buitrago", 70, 41381727), PEDROIBARRA("Pedro","Ibarra",35,3589647),
    CAROLINABEDOYA("Carolina","Bedoya",36, 10256872);
    
    private String name;
    private String lastName;
    private Integer age;
    private Integer id;

    private Persons(String name, String lastName, Integer age, Integer id) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.id = id;
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
    
    
    
}
