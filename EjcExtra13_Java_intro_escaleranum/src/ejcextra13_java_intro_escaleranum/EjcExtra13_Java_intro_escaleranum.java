/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejcextra13_java_intro_escaleranum;
import java.util.Scanner;
/**
 *
 * @author drome
 */
public class EjcExtra13_Java_intro_escaleranum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Digite la altura de la escalera");
        int height;
        do
        {
            height = leer.nextInt();
        }while(!(height > 0));
    
        for (int i = 0; i < height ; i++){
            for (int j = 1; j <= i+1; j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
