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
public enum Dogs {
    RAMBO("Rambo","Pincher",15,"Small"), SNOOPY("Snoppy","Poodle",10,"Small"), MILO("Milo","Pastor",10,"Big"), 
    LINDA("Linda","Pastor",6,"Big"), NEGRO("Negro","Aleman",5,"Medium") ;
        
        private String name;
        private String raze;
        private Integer age;
        private String size;

    private Dogs(String name, String raze, Integer age, String size) {
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
        
        
}
