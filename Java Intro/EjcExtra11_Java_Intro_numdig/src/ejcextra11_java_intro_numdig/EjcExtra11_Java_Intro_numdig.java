/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejcextra11_java_intro_numdig;
import java.util.Scanner;
/**
 *
 * @author drome
 * Escribir un programa que lea un número entero y devuelva el número de dígitos que
 * componen ese número. Por ejemplo, si introducimos el número 12345, el programa 
 * deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador 
 * de división. Nota: recordar que las variables de tipo entero truncan los números o
 * resultados.
 */
public class EjcExtra11_Java_Intro_numdig {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Digite un numero entero");
        int num = leer.nextInt();
        
        int temp = num;
        int cont = 0;
        do{
            temp = temp / 10;
            cont++;
            
        }while(temp != 0);
        
        System.out.println("La cantidad de digitos es "+cont);
        
    }
    
}
