/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejcaprendizaje5_java_intro_doble_triple;
import java.util.Scanner;
/**
 *
 * @author drome
 * Escribir un programa que lea un número entero por teclado y muestre por pantalla el
 * doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
public class Ejcaprendizaje5_Java_intro_doble_triple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        
        System.out.println("digite un numero entero");
        int num = leer.nextInt();
        
        System.out.println("El doble es " + num*2);
        System.out.println("el triple es " + num*3);
        System.out.println("La raiz cuadrada es "+Math.sqrt(num));
        
        
        
        
        
    }
    
}
