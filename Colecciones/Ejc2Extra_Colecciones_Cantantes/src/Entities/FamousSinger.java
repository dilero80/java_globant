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
public class FamousSinger {
    private String name;
    private String BestSaleRecord;

    public FamousSinger() {
    }

    public FamousSinger(String name, String BestSaleRecord) {
        this.name = name;
        this.BestSaleRecord = BestSaleRecord;
    }
    
    //getter & setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBestSaleRecord() {
        return BestSaleRecord;
    }

    public void setBestSaleRecord(String BestSaleRecord) {
        this.BestSaleRecord = BestSaleRecord;
    }
    
    
    //toString

    @Override
    public String toString() {
        return "FamousSinger{" + "name=" + name + ", BestSaleRecord=" + BestSaleRecord + '}';
    }
            
    
    
}
