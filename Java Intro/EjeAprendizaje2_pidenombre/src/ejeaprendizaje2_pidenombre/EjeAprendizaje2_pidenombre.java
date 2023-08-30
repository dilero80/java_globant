/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejeaprendizaje2_pidenombre;
import java.util.Scanner;

/**
 *
 * @author drome
 */
public class EjeAprendizaje2_pidenombre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        
        System.out.println("digite su nombre");
        String name = leer.nextLine();  
        
        
        System.out.println("Hola "+name);
                
    }
    
}
