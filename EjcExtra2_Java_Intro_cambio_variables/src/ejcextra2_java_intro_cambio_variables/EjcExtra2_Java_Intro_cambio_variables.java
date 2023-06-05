/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejcextra2_java_intro_cambio_variables;
import java.util.Scanner;
/**
 *
 * @author drome
 */
public class EjcExtra2_Java_Intro_cambio_variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int a, b, c, d, temp;
        System.out.println("Digite la variable A");
        a = leer.nextInt();
        System.out.println("Digite la variable B");
        b = leer.nextInt();
        System.out.println("Digite la variable C");
        c = leer.nextInt();
        System.out.println("Digite la variable D");
        d = leer.nextInt();
        
        System.out.println("La variable a = "+ a + " b =  " + b + " c = "+ c + " d = "+ d);
        
        temp = a;
        a = d;
        d = b;
        b = c;
        c = temp;
        
        System.out.println("al cambiarlas ahora a = d => " + a + " b = c => " + b + " c = a => " + c + " d = b => " + d);
        
        
    }
    
}
