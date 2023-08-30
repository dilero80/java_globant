/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejc2extra_relaciones_clases_theathersapp;

import Entities.Movie;
import Entities.Seat;
import Entities.Theater;
import Entities.User;
import Services.MovieService;
import Services.TheaterService;
import Services.UserService;

/**
 *
 * @author drome
 */
public class Ejc2Extra_Relaciones_Clases_TheathersApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TheaterService ts = new TheaterService();
        MovieService ms = new MovieService();
        UserService us = new UserService();
        
        Movie m1 = ms.createMovie("UN DIARIO", "director", 12, 85d);
        
        
        User u1 = us.createUser("DIEGO", 43, 15000);
        User u2 = us.createUser("ALEX", 56, 25000);
        
        
        Theater t1 = ts.createTheater("CASA", m1, 16000D);
        System.out.println("cree teatro");
        
//        Seat s= new Seat();
//        
//        System.out.println(s);
        System.out.println((u1.getMoney() >= t1.getPrice()) && (u1.getAge() >= t1.getMovie().getMinAge()));// && (t1.getFree() > 0));  
        ts.assignSeat(u1, t1);
        ts.assignSeat(u2, t1);
//      
        System.out.println(u1);
        ts.showTheater(t1);
        
   
    
    }
    
}
