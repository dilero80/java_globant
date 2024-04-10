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
public class SportsCenter extends Building{
    
    private String type; // can be roof or open

    public SportsCenter() {
    }

    public SportsCenter(String type, Double width, Double height, Double lenght) {
        super(width, height, lenght);
        this.type = type;
    }

    
    
    

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public Double volumeCalc() {
        return this.lenght * this.width * this.height;
    }

    @Override
    public Double surfaceCalc() {
        return this.lenght * this.width ;
    }
    
    
    

    
}
