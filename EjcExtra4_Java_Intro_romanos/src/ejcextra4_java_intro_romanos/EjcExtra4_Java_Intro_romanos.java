/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejcextra4_java_intro_romanos;
import java.util.Scanner;
/**
 *
 * @author drome
 * Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
 * equivalente en romano.
 */
public class EjcExtra4_Java_Intro_romanos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        int number=0;
        do {
            number = leer.nextInt();
            if (number > 10 ){
                System.out.println("Debe ser menor/igual que 10");
            }
        }while (10000 < number);
        int base = 1000;
        int temp = number;
        int romanSend;
        while(base == 1){
            romanSend = temp / base;
            romans(romanSend, base);
            temp = temp % base;
            base = base /10;
        }
        
        System.out.println("");
        
    }
    public static void romans(int number, int base){
        String letter, middleletter, lowletter;
        letter = "X";
        middleletter = "V";
        lowletter = "I";
        if (number <= 10) { 
            letter = "X";
            middleletter = "V";
            lowletter = "I";
        }
        if (number > 10 && number <= 100) { 
            letter = "C";
            middleletter = "X";
            lowletter = "I";
        }
        int highnumber = number/ base;
        if(highnumber == 1){
                System.out.print(letter);
            }
        else if (highnumber > 5 ){
                if(highnumber == 9){
                    System.out.print(lowletter + letter);
                }
                else{
                    System.out.print(middleletter);
                    for (int i = 5; i < highnumber ; i++ ){
                        System.out.print(lowletter);
                    }
                }
        } 
        else{
            if(highnumber == 5){
                    System.out.print(middleletter);
            } 
            else if (highnumber == 4){
                    System.out.print(lowletter + middleletter);
            }
            else{
                for (int i = 0; i <highnumber; i++ ){
                    System.out.print(lowletter);
                }
            }
        }
        return;
    }
}
