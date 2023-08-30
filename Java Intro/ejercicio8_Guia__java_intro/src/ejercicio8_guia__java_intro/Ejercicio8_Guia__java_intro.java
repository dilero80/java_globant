/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8_guia__java_intro;
import java.util.Scanner;

/**
 *
 * @author drome
 */
public class Ejercicio8_Guia__java_intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        
        int num = 11;
        while (num >10){
            System.out.println("Ingresa numero entre 1 y 10 ");
            num = leer.nextInt();
        }
        
    }
    
}
