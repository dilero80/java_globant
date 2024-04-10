/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import Interfaces.AreaPerimeterCalculator;

/**
 *
 * @author drome
 */
public class Rectangle implements AreaPerimeterCalculator {
    
    private Double base;
    private Double height;

    public Rectangle() {
    }

    public Rectangle(Double base, Double height) {
        this.base = base;
        this.height = height;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "base=" + base + ", height=" + height + ", perimeter= " + this.perimeter() + ", area= " +this.area() +" }";
    }

   

    @Override
    public Double area() {
       return this.base * this.height; 
    }

    @Override
    public Double perimeter() {
        return (this.base + this.height) *2;
    }
    
    
    
}
