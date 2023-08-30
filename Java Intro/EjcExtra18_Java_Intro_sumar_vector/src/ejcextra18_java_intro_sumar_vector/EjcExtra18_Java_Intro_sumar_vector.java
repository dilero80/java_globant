/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejcextra18_java_intro_sumar_vector;
import java.util.Scanner;
/**
 *
 * @author drome
 * Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
 * N, con los valores ingresados por el usuario.
 */
public class EjcExtra18_Java_Intro_sumar_vector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int n, sum;
        
        System.out.println("digite el tamaño del vector");
        n = leer.nextInt();
        int [] vector = new int [n];
        
        fillVector(vector,n);
        
        sum = sumVector(vector,n);
        
        System.out.println("La suma de los valores ingresados al vector es " + sum);
    }
    
    
    public static void fillVector(int [] vector, int size){
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i< size; i++){
            System.out.println("Digite el valor de la posicion #" + (i+1));
            vector[i] = leer.nextInt();
        }
    }
    
    public static int sumVector(int [] vector, int size){
        int sum = 0;
        for (int i = 0; i< size; i++){
            sum = sum + vector[i]; 
        }
        return sum;
    }
}
