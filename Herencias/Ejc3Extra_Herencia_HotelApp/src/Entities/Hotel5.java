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
public final class Hotel5 extends Hotel4 {
    protected Integer conferenceRooms;
    protected Integer suites;
    protected Integer limos;

    public Hotel5() {
    }

    public Hotel5(Integer conferenceRooms, Integer suites, Integer limos, Integer rooms, Integer beds, Integer floors, boolean gym, char gymType, String restaurantName, Integer restaurantCapacity, String address, String name, String locality, String manager) {
        super(rooms, beds, floors, gym, gymType, restaurantName, restaurantCapacity, address, name, locality, manager);
        this.conferenceRooms = conferenceRooms;
        this.suites = suites;
        this.limos = limos;
        this.roomprice = this.roomprice + (15 * this.limos);
    }

    public Integer getConferenceRooms() {
        return conferenceRooms;
    }

    public void setConferenceRooms(Integer conferenceRooms) {
        this.conferenceRooms = conferenceRooms;
    }

    public Integer getSuites() {
        return suites;
    }

    public void setSuites(Integer suites) {
        this.suites = suites;
    }

    public Integer getLimos() {
        return limos;
    }

    public void setLimos(Integer limos) {
        this.limos = limos;
    }

    @Override
    public String toString() {
        return "Hotel5{" + "conferenceRooms=" + conferenceRooms + ", suites=" + suites + ", limos=" + limos + "rooms=" + rooms + ", beds=" + beds + ", roomprice=" + roomprice + ", floors=" + floors + ", gym=" + gym + ", gymType=" + gymType + ", restaurantName=" + restaurantName + ", restaurantCapacity=" + restaurantCapacity + '}';
    }
    
    

    
    
    
    
    
    
    
    
    
    
}
