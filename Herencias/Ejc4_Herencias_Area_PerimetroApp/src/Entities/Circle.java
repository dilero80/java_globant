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
public class Circle implements AreaPerimeterCalculator{
    final Double PI = Math.PI;
    private Double ratio;
    private Double diameter;

    public Circle() {
    }

    public Circle(Double ratio) {
        this.ratio = ratio;
        this.diameter = 2 * ratio;
    }

    public Double getRatio() {
        return ratio;
    }

    public void setRatio(Double ratio) {
        this.ratio = ratio;
        this.diameter = ratio * 2; 
    }

    public Double getDiameter() {
        return diameter;
    }

  

    @Override
    public String toString() {
        return "Circle{" + "ratio=" + ratio + ", Diametro=" + diameter + '}';
    }

    @Override
    public Double area() {
        return PI * Math.pow(this.ratio,2D);
    }

    @Override
    public Double perimeter() {
        return PI * this.diameter;
    }

   
    
    
    
    
    
}
