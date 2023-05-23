/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejcaprendizaje1_java_intro_suma2;
import java.util.Scanner;

/**
 *
 * @author drome
 */
public class EjcAprendizaje1_Java_intro_suma2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer  = new Scanner(System.in);
        
        System.out.println("Digite numero 1");
        int num1 = leer.nextInt();
        
        System.out.println("Digite numero 2");
        int num2 = leer.nextInt();
        
        int suma = num1 + num2 ;
        
        System.out.println("La suma da como resultado = "+suma);
        
    }
    
}
