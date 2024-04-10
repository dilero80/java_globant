/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejc4_herencias_area_perimetroapp;

import Entities.Circle;
import Entities.Rectangle;

/**
 *
 * @author drome
 */
public class Ejc4_Herencias_Area_PerimetroApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Circle c1 = new Circle(5d);
        
        Rectangle r1 = new Rectangle(4d,5d);
        
        System.out.println(c1);
        System.out.println("el Area " + c1.area());
        System.out.println("El perimetro es " + c1.perimeter());
        System.out.println(r1);
        
        
        
        
        
        
        
    }
    
}
