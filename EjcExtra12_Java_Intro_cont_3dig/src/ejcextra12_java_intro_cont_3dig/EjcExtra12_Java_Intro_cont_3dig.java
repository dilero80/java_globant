/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejcextra12_java_intro_cont_3dig;

import static java.lang.Thread.sleep;
import java.util.Scanner;
/**
 *
 * @author drome
 * Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
 * 0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
 */
public class EjcExtra12_Java_Intro_cont_3dig {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        String cont1, cont2, cont3;
        
        boolean exit = true;
        do{
            for (int i = 0; i < 10; i++){
                for (int j = 0; j < 10; j++ ){
                    for (int k = 0; k < 10 ; k++){
                        
                        cont1 = String.valueOf(i);
                        cont2 = String.valueOf(j);
                        cont3 = String.valueOf(k);
                        if (cont1.equals("3")){
                            cont1 = "E";
                        }
                        if (cont2.equals("3")){
                            cont2="E";
                        }
                        if (cont3.equals("3")){
                            cont3="E";
                        }
                        System.out.println(cont1 + "-" + cont2 + "-" + cont3);
                        sleep(500);
                        
                    }
                }
            }
            
        }while(exit);
    }
    
}
