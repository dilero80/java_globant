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
public class DiscountCalculator {
    private double price;
    private double disccount;
    private double finalPrice;
    //constructor

    public DiscountCalculator() {
    }

    public DiscountCalculator(double price, double disccount) {
        this.price = price;
        this.disccount = disccount;
        this.finalPrice = price - (price * (disccount/100));
    }
    
    // Getter & Setter

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDisccount() {
        return disccount;
    }

    public void setDisccount(double disccount) {
        this.disccount = disccount;
    }

    public double getFinalPrice() {
        return finalPrice;
    }
    
    @Override
    public String toString() {
        return "DiscountCalculator{" + "price=" + price + ", disccount=" + disccount + '}';
    }

    
    
    
}
