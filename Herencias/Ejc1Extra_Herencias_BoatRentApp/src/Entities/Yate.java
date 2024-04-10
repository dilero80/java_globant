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
public class Yate extends MotorBoat {
    
    private Integer cabins;

    public Yate() {
    }

    public Yate(Integer cabins, Double cv, String plate, Double boatLenght, Integer manufactureYear) {
        super(cv, plate, boatLenght, manufactureYear);
        this.cabins = cabins;
    }

    public Integer getCabins() {
        return cabins;
    }

    public void setCabins(Integer cabins) {
        this.cabins = cabins;
    }

    @Override
    protected void calculateModule() {
        this.setModule((this.boatLenght * 10)+ this.cv + this.cabins);
    }

    @Override
    public String toString() {
        return "Yate{" + "plate=" + plate + ", boatLenght=" + boatLenght + ", manufactureYear=" + manufactureYear + ", module=" + module + ", cv=" + cv + ", cabins=" + cabins + '}';
    }


    
    
    
}
