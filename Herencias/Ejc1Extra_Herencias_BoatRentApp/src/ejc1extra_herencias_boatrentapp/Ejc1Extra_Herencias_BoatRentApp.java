/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejc1extra_herencias_boatrentapp;

import Entities.Boat;
import Entities.DockingRent;
import Entities.MotorBoat;
import Entities.SailBoat;
import Entities.Yate;
import Services.RentingBoatService;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author drome
 */
public class Ejc1Extra_Herencias_BoatRentApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        RentingBoatService rentServ = new RentingBoatService();
        DockingRent rent;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
        ArrayList<Boat> boats = new ArrayList();
        ArrayList<Boat> rentedBoats = new ArrayList();
        ArrayList<DockingRent> rents = new ArrayList();
        ArrayList<DockingRent> deliveredRents = new ArrayList();
        String plate;
        int option = 0;
        
        
        
        

        //CREATE BOATS 
        SailBoat sail1 = new SailBoat(5 , "SAILER1",15d , 1998);
        SailBoat sail2 = new SailBoat(6 , "SAILER2", 16d , 2000);
        Yate yate1 = new Yate(15, 2000d, "YATE1", 25D, 2015);
        Yate yate2 = new Yate(35, 4000d, "YATE2", 35D, 2020);
        MotorBoat mb1 = new MotorBoat(5000d, "MOTIRIZADO1", 21D , 1985 );
        MotorBoat mb2 = new MotorBoat(5000d, "MOTIRIZADO1", 21D , 1985 );
        boats.add(sail1);
        boats.add(sail2);
        boats.add(yate1);
        boats.add(yate2);
        boats.add(mb1);
        boats.add(mb2);
        
        RentingBoatService RS = new RentingBoatService();
        
        
        
        do{
            menu();
            System.out.println("ESCOGE UNA OPCION");
            option = read.nextInt();
            switch (option){
                case 1:
                    for (Boat boat : boats) {
                        System.out.println(boat.toString());
                    }
                    break;
                case 2:
                    
                    for (Boat boat : boats) {
                        System.out.println(boat.toString());
                    }
                    System.out.println("Insert plate number of the boat that will rent the parking slot");
                    plate = read.next().toUpperCase();

                    for (int i = 0; i < boats.size(); i++) {
                        if(boats.get(i).getPlate().equals(plate)){
                                rentedBoats.add(boats.get(i));
                                rents.add(RS.newRent(boats.get(i)));
                                boats.remove(i);
                                System.out.println("alquilado");
                                break;
                            }    
                    System.out.println("Boat no exists");
                    }
                    
                    break;
                case 3:
                    System.out.println("RENTED BOATS");
                    for (Boat boat : rentedBoats) {
                        System.out.println(boat.toString());
                    }
                    System.out.println("Insert plate number of the boat to finish rent");
                    plate = read.next().toUpperCase();

                    for (int i = 0; i < rentedBoats.size(); i++) {
                        if(rentedBoats.get(i).getPlate().equals(plate)){
                                boats.add(rentedBoats.get(i));
                                for (int j = 0; j < rents.size(); j++) {
                                    if(rents.get(j).getBoat().getPlate().equals(rentedBoats.get(i).getPlate())){
                                        RS.calculateParkingPrice(rents.get(j));
                                        deliveredRents.add(rents.get(j));
                                        rents.remove(j);
                                    }
                                
                            }
                                    
                                rentedBoats.remove(i);
                                System.out.println("alquilado");
                                break;
                            }    
                    System.out.println("Boat no exists");
                    }
                    break;

                case 4:
                    System.out.println("RENTS IN PROCESS");
                    for (DockingRent Rent : rents) {
                        System.out.println(Rent);
                    }
                    break;
                case 5:
                    System.out.println("DELIVERED RENTS");
                    for (DockingRent Rent : deliveredRents) {
                        System.out.println(Rent);
                    }
                    break;
                default:
                    break;


            }
        }while(!(6 == option));
        
        
        
        
//        try {
//            rent = rentServ.newRent("DIEGO ROMERO", 79881592, sdf.parse("30/8/2023"), null, sail1, 1);
//            
//            rentServ.calculateParkingPrice(rent);
//            // TODO code application logic here
//        } catch (ParseException ex) {
//            Logger.getLogger(Ejc1Extra_Herencias_BoatRentApp.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        
        
    }
    
    public static void menu(){
        System.out.println("MENU");
        System.out.println("1. AVALIABLE BOATS");
        System.out.println("2. RENT PARKING SLOT");
        System.out.println("3. DELIVER PARKINK SLOT");
        System.out.println("4. SHOW RENTS IN PROCESS");
        System.out.println("5. SHOW DELIVERED RENTS");
        System.out.println("6. EXIT");
        
    }
    
}
