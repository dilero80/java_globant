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
public class SailBoat extends Boat{

    private Integer masts;
    
    public SailBoat() {
    }

    public SailBoat(Integer masts, String plate, Double boatLenght, Integer manufactureYear) {
        super(plate, boatLenght, manufactureYear);
        this.masts = masts;
    }

    public Integer getMasts() {
        return masts;
    }

    public void setMasts(Integer masts) {
        this.masts = masts;
    }

    
    protected void calculateModule() {
        this.setModule((this.boatLenght * 10) + masts);
    }

    @Override
    public String toString() {
        return "SailBoat{" + "plate=" + plate + ", boatLenght=" + boatLenght + ", manufactureYear=" + manufactureYear + ", module=" + module + ", masts=" + masts + '}';
    }

    
    
  

    
    
    
    
    
    
}
