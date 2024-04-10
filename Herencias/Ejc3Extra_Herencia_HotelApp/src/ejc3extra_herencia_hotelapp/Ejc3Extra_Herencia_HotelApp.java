/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejc3extra_herencia_hotelapp;

import Entities.Camping;
import Entities.Hostal;
import Entities.Hotel4;
import Entities.Hotel5;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author drome
 */
public class Ejc3Extra_Herencia_HotelApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        ArrayList <Hostal> hostals = new ArrayList();
        
        int option;
        // HOTEL 4 STARS
        Hotel4 h41 = new Hotel4(15, 30, 4, true, 'A',  "Hotel 4 rest", 29, "Calle 2 con 3", "Hotel 4 - 2 Estrellas", "San Fernando", "Quecan");
        hostals.add(h41);
        Hotel4 h42 = new Hotel4(25, 45, 5, true, 'A',  "Hotel 42 rest", 45, "Calle 29 con 34", "Hotel 4- 1 Estrellas", "San vicente", "Nizo");
        hostals.add(h42);
        //HOTEL 5 STARS
        //Hotel5(Integer conferenceRooms, Integer suites, Integer limos, Integer rooms, Integer beds, Integer floors, boolean gym, char gymType, String restaurantName, Integer restaurantCapacity, String address, String name, String locality, String manager)
        Hotel5 h51 = new Hotel5(2, 5, 4, 35, 120, 15, true, 'A', "DAGOS", 80, "CARRRERA 25 CALLE 8 ", "HOTEL 5 UNO", "BOGOTA", "DAGO");
        hostals.add(h51);
        Hotel5 h52 = new Hotel5(1, 2, 1, 25, 50, 10, true, 'B', "PEPIS", 30, "CALLE 8 NUM 45 ", "HOTEL 5 DOS", "CALI", "PEPI");
        hostals.add(h52);
        //CAMPINGS
        Camping c1 = new Camping(2, 45, true, 2500d, true, "GUATAVITA", "GUTACAMP", "GUATAVITA", "QQUIEON");
        hostals.add(c1);
        
        
        
        
        
        
        
        do{
            menu();
            System.out.println("Choose an option");
            option = read.nextInt();
            switch (option){
                case 1:
                    for (Hostal hotel : hostals ) {
                        System.out.println(hotel);
                        
                    }
                    break;
                case 2:
                    for (Hostal hotel : hostals ) {
                        System.out.println(hotel.getClass().toString());
                        
                        if(hotel.getClass().toString().equals("Entities.Hotel4")){
                            System.out.println(hotel);
                        }
                        
                        
                    }                
                    break;
                case 3:
                    
                    break;

                case 4:
                    
                    
                    break;
                case 5:
                    
                    break;
                default:
                    break;


            }
        }while(!(6 == option));
        
        
        
      
        
        
        
    }
    
    public static void menu(){
        System.out.println("MENU");
        System.out.println("1. AVALIABLE HOSTALS");
        System.out.println("2. LIST HOTELS");
        System.out.println("3. LIST CAMPINGS");
        System.out.println("4. LIST RESINDECIES WITH DISCOUNT");
        System.out.println("5. ");
        System.out.println("6. EXIT");
        
    }
    
        
    
    
}
