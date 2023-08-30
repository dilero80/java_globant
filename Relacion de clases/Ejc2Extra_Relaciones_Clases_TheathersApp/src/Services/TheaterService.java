/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Movie;
import Entities.Theater;
import Entities.User;
import java.util.Scanner;

/**
 *
 * @author drome
 */
public class TheaterService {
    Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    
    public TheaterService() {
    }
    
    public Theater createTheater(){
        String name;
        String movieName;
        Double price;
        System.out.println("-------CREATE MOVIE THEATER-------------------");
        System.out.print("Insert Theater name:  ");
        name = read.next();
        System.out.print("Insert Theater price: $ ");
        price = read.nextDouble();
        
        
        return new Theater(name, null, price);
    }
    
    public Theater createTheater(String name, Movie movie, Double price){
       return new Theater(name, movie, price);
    }
    
    public boolean assignSeat(User u, Theater t){
        
        boolean flag =false;
        int linePos;
        int colPos;
        if ((u.getMoney() >= t.getPrice()) && (u.getAge() >= t.getMovie().getMinAge()) && (t.getFree() > 0)){
            System.out.println("usuario valido");
            do{
                linePos = (int)(Math.random() * 8);
                colPos = (int)(Math.random() * 6);
                if(!t.getSeats()[linePos][colPos].isOccupied()){
                    
                    t.getSeats()[linePos][colPos].setOccupied(true);
                    t.getSeats()[linePos][colPos].setUser(u);
                    t.setFree(t.getFree()-1);
                    System.out.println("Seat Assigned " + this.seatNumber(linePos, colPos));
                    flag = true;
                    return flag;
                }
           }while(flag);    
        }else{
            System.out.println("Usuario no Valido, no fue asignado");
        }
            
        return flag;
    }
    
    
    public String seatNumber(int line, int column){
        String seatPos="";
        switch (column){
            case 0:
                seatPos= String.valueOf(line).concat("A");
                break;
            case 1:
                seatPos= String.valueOf(line).concat("B");
                break;
            case 2:
                seatPos= String.valueOf(line).concat("C");
                break;
            case 3:
                seatPos= String.valueOf(line).concat("D");
                break;
            case 4:
                seatPos= String.valueOf(line).concat("E");
                break;
            case 5:
                seatPos= String.valueOf(line).concat("F");
                break;
            default:
                break;
                
        }
        
        
        return seatPos;
    }
    
    public void showTheater(Theater t){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("[(" +this.seatNumber(i, j) + ")" );
                if (t.getSeats()[i][j].isOccupied()){
                    System.out.print("X]");
                }
                else{
                    System.out.print(" ]");
                }
            }
            System.out.println("");
            
        }
    }
}
