/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejcaprendizaje3_mayusc_minis;
import java.util.Scanner;
/**
 *
 * @author drome
 */
public class EjcAprendizaje3_mayusc_minis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite una frase");
        String frase = leer.nextLine();
        
        System.out.println("La frase en Maysuculas es "+frase.toUpperCase());
        
        System.out.println("La frase en Minusculas es "+frase.toLowerCase());
        
        
    }
    
}
