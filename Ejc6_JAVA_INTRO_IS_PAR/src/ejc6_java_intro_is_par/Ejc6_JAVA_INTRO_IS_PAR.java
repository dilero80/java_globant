/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejc6_java_intro_is_par;
import java.util.Scanner;
/**
 *
 * @author drome
 * Crear un programa que dado un numero determine si es par o impar.
 */
public class Ejc6_JAVA_INTRO_IS_PAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Digite un numero entero");
        int num = leer.nextInt();
        
        boolean isPair = isItPair(num);
        if (isPair){
            System.out.println("El numero ingresado es par");
        }
        else{
            System.out.println("El numero ingresado es impar");
        }
        
    }
    
    public static boolean isItPair(int num){
        if (num % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}

