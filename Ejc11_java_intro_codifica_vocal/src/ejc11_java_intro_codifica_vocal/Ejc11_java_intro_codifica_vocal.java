/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejc11_java_intro_codifica_vocal;

/**
 *
 * @author drome
 */

import java.util.Scanner;
       



public class Ejc11_java_intro_codifica_vocal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
         String frase = leer.nextLine();
         String frasecodified = codified(frase);
         System.out.println(frasecodified);
         
         
         
        
                 
         
    }
    public static String codified(String frase){
        int largo = frase.length();
        String fraseCode ="";
        frase = frase.toLowerCase();
        for (int i = 0; i < largo; i++){
            char pos = frase.charAt(i);
            switch (pos) {
                case 'a':
                    fraseCode = fraseCode.concat("@");
                    break;
                case 'e':
                    fraseCode = fraseCode.concat("#");
                    break;
                case 'i':
                    fraseCode = fraseCode.concat("$");
                    break;
                case 'o':
                    fraseCode = fraseCode.concat("%");
                    break;
                case 'u':
                    fraseCode = fraseCode.concat("*");
                    break;
                default:
                    fraseCode = fraseCode+pos;
                    break;
            }          
        }
        fraseCode = fraseCode.toUpperCase();
        return fraseCode;
       
        
    } 
    
}

