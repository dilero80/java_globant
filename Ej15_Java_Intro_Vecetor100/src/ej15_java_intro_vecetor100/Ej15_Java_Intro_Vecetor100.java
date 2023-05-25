/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej15_java_intro_vecetor100;

/**
 *
 * @author drome
 * 15. Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
 * muestre por pantalla en orden descendente.
 */
public class Ej15_Java_Intro_Vecetor100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] vector = new int [100];
        
        for (int i=0; i<100; i++){
            vector[i] = i;
            
        }
        for (int i = 99; i >= 0; i--){
            System.out.println(vector[i]);
            
        }
        
    }
    
}
