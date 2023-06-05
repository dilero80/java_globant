/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejcextra3_java_intro_detecta_vocal;
import java.util.Scanner;
/**
 *
 * @author drome
 * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
 * Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */
public class EjcExtra3_Java_Intro_detecta_vocal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        String letter;
        
        System.out.println("Digite una letra/vocal");
        letter = leer.next();
        letter = letter.toLowerCase();
        if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u") ){
            System.out.println("Es una vocal");
        } 
        else {
            System.out.println("Es una consonante");
            
        }
                
        
    }
    
}
