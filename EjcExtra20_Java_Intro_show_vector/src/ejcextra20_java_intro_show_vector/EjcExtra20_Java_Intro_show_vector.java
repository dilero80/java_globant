/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejcextra20_java_intro_show_vector;
import java.util.Scanner;
/**
 *
 * @author drome
 */
public class EjcExtra20_Java_Intro_show_vector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("digite el tamaño del vector");
        int n = leer.nextInt();
        int [] vector = new int [n];
        fillVector(vector,n);
        
        printVector(vector,n);
        
        
        
    }
    
    public static void fillVector(int [] vector, int size){   
        for (int i = 0; i < size; i++){
            vector[i] = (int) (Math.random() * 100);
        }       
    }
    
    public static void printVector(int [] vector, int size){   
        for (int i = 0; i < size; i++){
            System.out.print("[" + vector[i] + "]"); 
        }
        System.out.println("");
    }
    
}
