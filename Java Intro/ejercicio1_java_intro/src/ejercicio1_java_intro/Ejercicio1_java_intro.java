/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_java_intro;
import java.util.Scanner;
/**
 *
 * @author drome
 */
public class Ejercicio1_java_intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa tu nombre");
        String nombreUser = leer.nextLine();
        System.out.println("Ingresa tu edad");
        int edad = leer.nextInt();
             
        
        
        System.out.println("El usuario se llama " + nombreUser );
        System.out.println(" y tiene " + edad + " Años" );
        
                
                
    }
    
}
