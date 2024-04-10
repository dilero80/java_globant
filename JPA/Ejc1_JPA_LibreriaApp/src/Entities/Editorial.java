/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;
import javax.persistence.Entity;
import javax.persistence.Id;
/**
 *
 * @author drome
 */
@Entity
public class Editorial {
    
    @Id
    private Integer id;
    private String name;
    private boolean isUp;

    public Editorial() {
    }

    public Editorial(Integer id, String name, boolean isUp) {
        this.id = id;
        this.name = name;
        this.isUp = isUp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIsUp() {
        return isUp;
    }

    public void setIsUp(boolean isUp) {
        this.isUp = isUp;
    }

    @Override
    public String toString() {
        return "Editorial{" + "id=" + id + ", name=" + name + ", isUp=" + isUp + '}';
    }
    
    
    
    
}
