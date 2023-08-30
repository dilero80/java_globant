/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6_guia1_java_intro;
import java.util.Scanner;
/**
 *
 * @author drome
 */
public class Ejercicio6_guia1_java_intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa numero 1");
        int num1 = leer.nextInt();
        System.out.println("Ingresa numero 2");
        int num2 = leer.nextInt();
        
        if (num1 >= 25 && num2 >= 25) {
            System.out.println("Los dos son mayores a 25");
        }else if (num1>=25 || num2 >=25){
            System.out.println("Alguno es mayor que 25");
        }else{
            System.out.println("Los dos son menores de 25");
        }
        
        
    
    }
    
}
