/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejcextra9_java_intro_divresta;
import java.util.Scanner;
/**
 *
 * @author drome
 * Simular la división usando solamente restas. Dados dos números enteros mayores que
 * uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
 * Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
 * resultado es el residuo, y el número de restas realizadas es el cociente.
 */
public class EjcExtra9_Java_Intro_Divresta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int dividendo = 0;
        int divisor = 0;
        int cociente = 0;
        int residuo = 0;
        
        do{
            System.out.println("Digite el dividendo");
            dividendo = leer.nextInt();
            System.out.println("Digite el divisor");
            divisor = leer.nextInt();
        }while (dividendo < 1 && divisor < 1);
        do{
            residuo = dividendo - divisor;
            cociente++;
            dividendo = residuo;
        }while(divisor < residuo);
        
        System.out.println("El cociente es " + cociente + " y el residuo es " + residuo);
        
        
        
        
    }
    
}
