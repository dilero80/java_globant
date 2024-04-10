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
public class Hotel4 extends Hostal {

    protected Integer rooms;
    protected Integer beds;
    protected Double roomprice;
    protected Integer floors;
    protected boolean gym;
    protected char gymType;
    protected String restaurantName;
    protected Integer restaurantCapacity;
    
    
    
    public Hotel4() {
    }

    public Hotel4(Integer rooms, Integer beds, Integer floors, boolean gym, char gymType, String restaurantName, Integer restaurantCapacity, String address, String name, String locality, String manager) {
        super(address, name, locality, manager);
        this.rooms = rooms;
        this.beds = beds;
        this.floors = floors;
        this.gym = gym;
        this.gymType = gymType;
        this.restaurantName = restaurantName;
        this.restaurantCapacity = restaurantCapacity;
        this.roomprice = this.calcRoomPrice();
    }

    public Integer getRooms() {
        return rooms;
    }

    public void setRooms(Integer rooms) {
        this.rooms = rooms;
    }

    public Integer getBeds() {
        return beds;
    }

    public void setBeds(Integer beds) {
        this.beds = beds;
    }

    public Double getRoomprice() {
        return roomprice;
    }

    protected Double calcRoomPrice() {
        Double price;
        Integer capacity = this.beds * this.rooms * this.floors;
        price = 50d + (capacity)  ;
        if (this.restaurantCapacity < 30 ){
            price  = price + 10;
        }
        else if (this.restaurantCapacity >= 30 && this.restaurantCapacity < 50){
            price  = price + 30;
        }
        else{
            price = price + 50;
        }
        
        switch (this.gymType){
            case 'A':
                price = price + 50;
                break;
            case 'B':
                price = price + 50;
                break;
            default:
                break;
        }
        
        return price;
        
    }

    public Integer getFloors() {
        return floors;
    }

    public void setFloors(Integer floors) {
        this.floors = floors;
    }

    public boolean isGym() {
        return gym;
    }

    public void setGym(boolean gym) {
        this.gym = gym;
    }

    public char getGymType() {
        return gymType;
    }

    public void setGymType(char gymType) {
        this.gymType = gymType;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public Integer getRestaurantCapacity() {
        return restaurantCapacity;
    }

    public void setRestaurantCapacity(Integer restaurantCapacity) {
        this.restaurantCapacity = restaurantCapacity;
    }

    @Override
    public String toString() {
        return "Hotel4{" + "rooms=" + rooms + ", beds=" + beds + ", roomprice=" + roomprice + ", floors=" + floors + ", gym=" + gym + ", gymType=" + gymType + ", restaurantName=" + restaurantName + ", restaurantCapacity=" + restaurantCapacity + '}';
    }
    
    
    
    
    
}
