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
public class Boat {
    protected String plate;
    protected Double boatLenght;
    protected Integer manufactureYear;
    protected Double module;

    public Boat() {
    }

    public Boat(String plate, Double boatLenght, Integer manufactureYear) {
        this.plate = plate;
        this.boatLenght = boatLenght;
        this.manufactureYear = manufactureYear;
        this.calculateModule(); ;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public Double getBoatLenght() {
        return boatLenght;
    }

    public void setBoatLenght(Double boatLenght) {
        this.boatLenght = boatLenght;
    }

    public Integer getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(Integer manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public Double getModule() {
        return module;
    }

    public void setModule(Double module) {
        this.module = module;
    }
    
    
    private void calculateModule(){
       this.setModule(this.boatLenght * 10);
   }
    
    

    @Override
    public String toString() {
        return "Boat{" + "plate=" + plate + ", boatLenght=" + boatLenght + ", manufactureYear=" + manufactureYear + ", module=" + module + '}';
    }
    
    
    
    
    
}
