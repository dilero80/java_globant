/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejcextra10_java_intro_adivina_multi;
import java.util.Scanner;
//import java.lang.Math;

/**
 *
 * @author drome
 */
public class EjcExtra10_Java_Intro_Adivina_multi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        int num1, num2, adivina;
        do{
            num1 = (int) (Math.random()*10);
            num2 = (int) (Math.random()*10);
        
        }while((num1 == 0) || (num2 == 0));
        
        int result = num1 * num2;
        
        do{
            System.out.println("Adivine el resultado de dos numeros enteros de 1 a 9");
            adivina = leer.nextInt();
        }while(result != adivina);
        
        System.out.println("num1="+ num1 + " num2=" + num2 + " resultado =" +result);
        
    }
    
}
