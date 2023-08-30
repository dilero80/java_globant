/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.DiscountCalculator;
import java.util.Scanner;

/**
 *
 * @author drome
 */
public class DiscountService {
    Scanner leer = new Scanner(System.in);

    /*public DiscountService() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  /*  public DiscountCalculator createDiscount(){
        double price, discount;
        System.out.println("Vamos a crear un descuento");
        System.out.println("Digite el valor del producto");
        price = leer.nextDouble();
        System.out.println("ingrese el valor del descuento");
        discount = leer.nextDouble();
        
        return new DiscountCalculator(price,discount);
        
        
    }
*/
    public DiscountCalculator createDiscount(double price, double discount){
        return new DiscountCalculator(price,discount);
    }
    
    
}
