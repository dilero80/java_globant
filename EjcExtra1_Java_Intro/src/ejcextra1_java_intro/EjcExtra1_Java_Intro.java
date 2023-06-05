/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejcextra1_java_intro;
import java.util.Scanner;

/**
 *
 * @author drome
 * Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el 
 * usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
public class EjcExtra1_Java_Intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Digite tiempo en minutos");
        int timeInMinutes = leer.nextInt();
        
        calcDays(timeInMinutes);
        
        
    }
    public static void calcDays(int minutes){
        int days = 0;
        int hours = 0;
        int temp = 0;
        days = minutes /  1440;
        temp = minutes % 1440;
        hours = temp / 60;
        System.out.println("El numero de dias es " + days);
        System.out.println("El numero de horas es " + hours);
        System.out.println("Y sobran "+ (temp % 60) + " minutos" );
        
    }
    
}
