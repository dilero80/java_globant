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
public class Author {
    @Id
    private Integer id;
    private String name;
    private Boolean isUp;

    public Author() {
    }

    public Author(Integer id, String name, Boolean isUp) {
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

    public Boolean getIsUp() {
        return isUp;
    }

    public void setIsUp(Boolean isUp) {
        this.isUp = isUp;
    }

    @Override
    public String toString() {
        return "Author{" + "id=" + id + ", name=" + name + ", isUp=" + isUp + '}';
    }
    
    
    
    
}
