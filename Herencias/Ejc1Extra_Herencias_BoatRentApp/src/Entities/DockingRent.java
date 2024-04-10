/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author drome
 */
public class DockingRent {
    private String clientName;
    private Integer clientID;
    private Date rentDate;
    private Date devolutionDate;
    private Boat boat;
    private Integer parkPosition;
    private Double moduleValue;
    private Double parkingValue;
    
    
    public DockingRent() {
    }

    public DockingRent(String clientName, Integer clientID, Date rentDate, Date devolutionDate, Boat boat, Integer parkPosition) {
        this.clientName = clientName;
        this.clientID = clientID;
        this.rentDate = rentDate;
        this.devolutionDate = devolutionDate;
        this.boat = boat;
        this.parkPosition = parkPosition;
        this.moduleValue = boat.getModule();
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Integer getClientID() {
        return clientID;
    }

    public void setClientID(Integer clientID) {
        this.clientID = clientID;
    }

    public Date getRentDate() {
        return rentDate;
    }

    public void setRentDate(Date rentDate) {
        this.rentDate = rentDate;
    }

    public Date getDevolutionDate() {
        return devolutionDate;
    }

    public void setDevolutionDate(Date devolutionDate) {
        this.devolutionDate = devolutionDate;
    }

    public Boat getBoat() {
        return boat;
    }

    public void setBoat(Boat boat) {
        this.boat = boat;
    }

    public Integer getParkPosition() {
        return parkPosition;
    }

    public void setParkPosition(Integer parkPosition) {
        this.parkPosition = parkPosition;
    }

    public Double getModuleValue() {
        return moduleValue;
    }

    public void setModuleValue(Double moduleValue) {
        this.moduleValue = moduleValue;
    }

    public Double getParkingValue() {
        return parkingValue;
    }

    public void setParkingValue(Double parkingValue) {
        this.parkingValue = parkingValue;
    }
    
    
    

    
    @Override
    public String toString() {
        return "DockingRent{" + "clientName=" + clientName + ", clientID=" + clientID + ", rentDate=" + rentDate + ", devolutionDate=" + devolutionDate + ", boat=" + boat + ", parkPosition=" + parkPosition + '}';
    }
    
    
    
}
    

