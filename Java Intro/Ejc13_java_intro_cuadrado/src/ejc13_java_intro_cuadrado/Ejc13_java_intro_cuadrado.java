/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejc13_java_intro_cuadrado;
import java.util.Scanner;
/**
 *
 * @author drome
 */
public class Ejc13_java_intro_cuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite cantidad de *");
        int cant = leer.nextInt();
        for (int i = 1; i <= cant; i++){
            if (i == 1 || i == cant ){
                for (int j = 1; j <= cant; j++){
                    System.out.print("*");
                }
            }
            else
            {
                System.out.print("*");
                for (int k = 2; k < cant; k++){
                        System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println("");
        }
        
        
    }
    
}
