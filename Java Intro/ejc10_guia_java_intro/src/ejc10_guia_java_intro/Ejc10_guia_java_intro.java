/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejc10_guia_java_intro;
import java.util.Scanner;
/**
 *
 * @author drome
 */
public class Ejc10_guia_java_intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite el numero "+ (i+1));
            int num = leer.nextInt();
            System.out.print(num);
            for (int j = 0; j < num; j++) {
                System.out.print("*");
                
            }
            System.out.println("");
        }
        
        
        
        
        
            
        }
    
}
