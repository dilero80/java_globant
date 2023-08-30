/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejc16_java_intro_nale;
import java.util.Scanner;
/**
 *
 * @author drome
 */
public class Ejc16_Java_Intro_NAle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite le tamaño del vector n=");
        int n = leer.nextInt();
        
        int vector[] = new int [n];
        
        for (int i = 0; i < n; i++){
            vector[i] = (int) (Math.random() * 100);
        }
        
        System.out.println("Digite el numero a buscar de 0 a 100");
        int num = leer.nextInt();
        findNumber(vector, num, n);
        
        
            
    }
    public static void findNumber(int [] vector, int num, int size){
        boolean flag = false;
        for (int i = 0; i < size; i++){
            if (vector[i] == num){
                if (flag){
                    System.out.println("Tambien se encuentra en la posicion: " + i );                   
                }
                else{
                    System.out.println("Se encuentra en la posicion: " + i );
                }
                flag = true;
            }
            
        }
        if (!flag){
            System.out.println("No se encuentra en el vector");
        }
    }    
}
