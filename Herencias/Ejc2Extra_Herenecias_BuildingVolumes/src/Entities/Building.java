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
public abstract class Building {
    protected Double width;
    protected Double height;
    protected Double lenght;

    public Building() {
    }

    public Building(Double width, Double height, Double lenght) {
        this.width = width;
        this.height = height;
        this.lenght = lenght;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = lenght;
    }

    public Double getLenght() {
        return lenght;
    }

    public void setLonght(Double lenght) {
        this.lenght = lenght;
    }

    
    
    
    public abstract Double surfaceCalc ();
    
    public abstract Double volumeCalc ();
    
    
    
    
}
