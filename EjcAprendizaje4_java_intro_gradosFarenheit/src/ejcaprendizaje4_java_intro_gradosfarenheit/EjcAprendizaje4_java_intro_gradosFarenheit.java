/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejcaprendizaje4_java_intro_gradosfarenheit;
import java.util.Scanner;
/**
 *
 * @author drome
 */
public class EjcAprendizaje4_java_intro_gradosFarenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Digite la temperatura en Celsius");
        float C = leer.nextFloat();
        float F = 32 + (9*C/5);
        
        System.out.println("La temperatura en Farenheit es "+ F);
    }
    
}
