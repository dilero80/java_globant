/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejc12_java_intro_esmultiplo;
import java.util.Scanner;
/**
 *
 * @author drome
 */
public class Ejc12_java_intro_EsMultiplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
         System.out.println("Digite primer numero");
         int num1 = leer.nextInt();
         System.out.println("Digite segundo numero");
         int num2 = leer.nextInt();
         
         esMultiplo(num1,num2);
         
         
    }
    public static void esMultiplo(int num1, int num2){
        if (num1 % num2 == 0){
        System.out.println("El numero "+ num2 +" es multiplo de "+ num1 );
        }
        else{
                System.out.println("El numero "+ num2 +" NO es multiplo de "+ num1 );
        }
    return;
    }
    
    
}
