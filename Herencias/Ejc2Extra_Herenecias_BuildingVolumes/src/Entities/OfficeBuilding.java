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
public class OfficeBuilding extends Building{

    private Integer officesPerFloor;
    private Integer floors;
    private Integer personPerOffice;
    
    
    public OfficeBuilding() {
    }

    public OfficeBuilding(Integer officesPerFloor, Integer floors, Integer personPerOffice, Double width, Double height, Double lenght) {
        super(width, height, lenght);
        this.officesPerFloor = officesPerFloor;
        this.floors = floors;
        this.personPerOffice = personPerOffice;
    }

   

    public Integer getOfficesPerFloor() {
        return officesPerFloor;
    }

    public void setOfficesPerFloor(Integer officesPerFloor) {
        this.officesPerFloor = officesPerFloor;
    }

    public Integer getFloors() {
        return floors;
    }

    public void setFloors(Integer floors) {
        this.floors = floors;
    }

    public Integer getPersonPerOffice() {
        return personPerOffice;
    }

    public void setPersonPerOffice(Integer personPerOffice) {
        this.personPerOffice = personPerOffice;
    }

    @Override
    public Double volumeCalc() {
        return this.lenght * this.width * this.height;
    }

    @Override
    public Double surfaceCalc() {
        return this.lenght * this.width;
    }
    
    public Integer personsQty(){
        return this.floors * this.officesPerFloor * this.personPerOffice;
    }
    
    
    
    
    
    
    
}
