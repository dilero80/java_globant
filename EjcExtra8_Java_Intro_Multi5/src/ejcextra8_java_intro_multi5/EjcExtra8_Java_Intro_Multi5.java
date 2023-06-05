/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejcextra8_java_intro_multi5;
import java.util.Scanner;
/**
 *
 * @author drome
 */
public class EjcExtra8_Java_Intro_Multi5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num = 0;
        int pair = 0;
        int inpair = 0;
        int cont = 0;
        do{
            System.out.println("Ingrese Numero");
            num = leer.nextInt();
            if (num<0){
                continue;
            }
            if (num % 2 == 0){
                pair++;
            }
            else{
                inpair++;
            }
            cont++;
        }while(num % 5 != 0 );
        System.out.println("La cantidad de numeros leidos es " + cont + ", los cantidad de pares es " + pair + ", y de impares es " + inpair );
    }
    
}

