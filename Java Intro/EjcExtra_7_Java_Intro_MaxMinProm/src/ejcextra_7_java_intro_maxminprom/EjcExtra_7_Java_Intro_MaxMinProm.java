/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejcextra_7_java_intro_maxminprom;
import java.util.Scanner;
/**
 *
 * @author drome
 */
public class EjcExtra_7_Java_Intro_MaxMinProm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Digite la cantidad de numeros a evaluar");
        int n = leer.nextInt();
        int cont = 0;
        int num, max, min, prom;
        max = 0;
        min = (int) Float.POSITIVE_INFINITY ;
        prom = 0;
//        while( cont < n){
//            cont++;
//            System.out.println("Digite numero #"+cont);
//            num = leer.nextInt();
//            if (num>max){
//                max = num;
//            }
//            if (num < min){
//                min = num;
//            }
//            prom = prom + num;
//            
//        }
        do{
            cont++;
            System.out.println("Digite numero #"+cont);
            num = leer.nextInt();
            if (num>max){
                max = num;
            }
            if (num < min){
                min = num;
            }
        }while(cont < n);
        System.out.println("El maximo es "+ max + ", el minimo es "+ min + " y el promedio es "+ prom/n);
        
    }
    
}
