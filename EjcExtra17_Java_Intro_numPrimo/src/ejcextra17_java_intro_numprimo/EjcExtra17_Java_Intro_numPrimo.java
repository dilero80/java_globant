/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejcextra17_java_intro_numprimo;
import java.util.Scanner;
/**
 *
 * @author drome
 * Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos
 * por parámetro para que nos indique si es o no un número primo, debe devolver true si es
 * primo, sino false.
 */
public class EjcExtra17_Java_Intro_numPrimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num;
        boolean prime;
        System.out.println("Digite un numero entero");
        num = leer.nextInt();
        
        prime = isPrime(num);
        
        if (prime){
            System.out.println("Es primo");
        }else{
            System.out.println("NO es primo");
        }
        
    }
    
    public static boolean isPrime(int num){
        boolean prime = true;
        
        for(int i = 2; i < num; i++){
            if (num % i == 0){
                prime = false;
                return prime;
            }
        }
        return prime;
    }
    
}
