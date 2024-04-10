/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejc5_excepciones_guessnumber;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author drome
 */
public class Ejc5_Excepciones_GuessNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        int userNumber, guessNumber;
        int cont = 0;
        guessNumber = (int)(Math.random() *500 +1);
        userNumber = 0;
        do{
            try{
                cont ++;
                System.out.println("OPORTUNIDAD NUMERO "+ cont);
                System.out.println("Digite el numero a adivinar");
                userNumber = read.nextInt();
                
                if(userNumber > 500){
                    throw new Exception("No puede ser mayor a 500, intente de nuevo");
                }
                else if(userNumber > guessNumber){
                    System.out.println("Es mayor");
                }
                else if(userNumber < guessNumber){
                    System.out.println("Es menor");
                }
                else if(userNumber == guessNumber){
                    System.out.println("Adivino ");
                }
                
            
            }
            catch(InputMismatchException e){
                System.out.println("Debe ser un Numero entero");
                          
                read.next();
                
            }
            catch(Exception e){
                System.out.println("No puede ser mayor a 500");
                
            }
            finally{
                
            }
        
            
        }while(userNumber != guessNumber);
    }
    
}
