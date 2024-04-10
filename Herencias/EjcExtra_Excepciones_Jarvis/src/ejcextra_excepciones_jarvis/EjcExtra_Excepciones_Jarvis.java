/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejcextra_excepciones_jarvis;

import Entities.Armour;
import Services.ArmourService;
import java.util.Scanner;

/**
 *
 * @author drome
 */
public class EjcExtra_Excepciones_Jarvis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        int option = 0;
        ArmourService as = new ArmourService();
        Armour A = as.createArmour("red", "gold", 25d, 15d , 10d);
        
        do{
            menu();
            System.out.println("ESCOGE UNA OPCION");
            option = read.nextInt();
            switch (option){
                case 1:
                    try{
                        as.walk(A, 60d);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try{
                        as.fly(A, 120d);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    
                    break;
                case 3:
                    try{
                        as.shoot(A, 5d);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    
                    break;

                case 4:
                    try{
                        as.getState(A);
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                    
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
        System.out.println("1. WALK");
        System.out.println("2. FLY");
        System.out.println("3. SHOOT");
        System.out.println("4. SHOW STATUS");
        System.out.println("5. SIMULATED");
        System.out.println("6. EXIT");
        
    }
    
}
    
    

