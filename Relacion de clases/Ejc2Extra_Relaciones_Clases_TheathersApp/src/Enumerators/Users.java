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
public enum Users {
    USER1("DIEGO ROMERO",43,50000),USER2("ALEX HERNANDEZ",53,60000),USER3("ELSA BUITRAGO",75,45000),
    USER4("OMAR ROMERO",58,48000),USER5("JHON ROMERO",48,25000);
    
    private String name;
    private Integer age;
    private double money;

    private Users(String name, Integer age, double money) {
        this.name = name;
        this.age = age;
        this.money = money;
    }

    
    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public double getMoney() {
        return money;
    }
    
    
    
    
}
