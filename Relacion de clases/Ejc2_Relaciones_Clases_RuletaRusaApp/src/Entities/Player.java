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
public class Player {
    private Integer id;
    private String name;
    private boolean wet;

    public Player() {
    }

    public Player(Integer id, String name, boolean wet) {
        this.id = id;
        this.name = name;
        this.wet = wet;
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

    public boolean isWet() {
        return wet;
    }

    public void setWet(boolean wet) {
        this.wet = wet;
    }

    @Override
    public String toString() {
        return "Player{" + "id=" + id + ", name=" + name + ", wet=" + wet + '}';
    }
    
    
}
