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
public class MotorBoat extends Boat{
    protected Double cv;

    public MotorBoat() {
        
    }

    public MotorBoat(Double cv, String plate, Double boatLenght, Integer manufactureYear) {
        super(plate, boatLenght, manufactureYear);
        this.cv = cv;
    }

    public Double getCv() {
        return cv;
    }

    public void setCv(Double cv) {
        this.cv = cv;
    }

    
    protected void calculateModule() {
        this.setModule((this.boatLenght *10) + this.cv);
    }

    @Override
    public String toString() {
        return "MotorBoat{" + "plate=" + plate + ", boatLenght=" + boatLenght + ", manufactureYear=" + manufactureYear + ", module=" + module + ", cv=" + cv + '}';
    }

    

    
    
    
    
    
    
}
