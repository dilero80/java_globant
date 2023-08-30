/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9_guia_java_intro;
import java.util.Scanner;

/**
 *
 * @author drome
 */
public class Ejercicio9_guia_java_intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int cont = 0;
        int sum = 0;
        do {
        System.out.println("Digite un numero");
        int num = leer.nextInt();
            if (num > 0){
                sum = sum + num;
            }
            cont++; 
            if (num == 0){
                System.out.println("Capture el numero 0");
                break;
            }
        } while ( cont < 20 );
        System.out.println("La suma de los numeros positivos es: "+sum);
    }
    
}
