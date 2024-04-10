/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejc3.pkg4_excepciones_divisionnumero;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author drome
 */
public class Ejc34_Excepciones_DivisionNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        String num1Str, num2Str;
        int num1, num2;
        
        try{
            
        
            System.out.println("Digite numero 1");
            num1 = read.nextInt();
            // num1 = Integer.parseInt(num1Str);
            System.out.println("Digite numero 2");
            num2Str = read.next();
            num2 = Integer.parseInt(num2Str);


            System.out.println("el Resultado de "+ num1 +"/"+ num2 +" = " + num1/num2);
        }catch(NumberFormatException e){
            System.out.println("Debe ser un numero entero");
        }
        catch(InputMismatchException e){
            System.out.println("Debe ser un Numero entero");
        }
        catch(ArithmeticException e){
            System.out.println("No se puede dividir por 0");
        }    
 
    }
    
}
