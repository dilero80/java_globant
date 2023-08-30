/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejc13_java_intro_vector_matriz;
import java.util.Scanner;
/**
 *
 * @author drome
 */
public class Ejc13_java_intro_Vector_matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int cant = 9;
                
        String[] Equipo = new String[cant];
        
        for (int i = 0; i < cant; i++){
            System.out.println("Digite Nombre "+i);
            Equipo[i] = leer.nextLine();
            System.out.println("La posicion "+i+" contiene el nombre " + Equipo[i] );
           
               
        }
    }
    
}
