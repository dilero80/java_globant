/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejcextra14_java_intro_prom_edad;
import java.util.Scanner;
/**
 *
 * @author drome
 * Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
 * hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
 * de hijos para averiguar la media de edad de los hijos de todas las familias.
 */
public class EjcExtra14_Java_Intro_prom_edad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        int nfamilias;
        int promEdad;
        
        System.out.println("Digite el numero de familias");
        nfamilias = leer.nextInt();
        int []mhijos = new int[nfamilias];
        
        for (int i = 0; i < nfamilias; i++){
            System.out.println("Digite el numero de hijos de la familia #" + (i+1));
            mhijos[i] = leer.nextInt();
        }
        
        for (int i = 0; i < nfamilias; i++){
            promEdad = calcProm(mhijos[i], i);
            System.out.println("El promedio de edad de la familia #" + (i+1) +  " es " + promEdad);
        }
    }
    public static int calcProm(int n, int numfam){
        Scanner leer = new Scanner(System.in);
        int prom = 0;
        int edad;
        for (int i = 0; i < n; i++){
            System.out.println("digita la edad del hijo #"+(i+1)+" de la familia "+ (numfam+1));
            edad = leer.nextInt();
            prom = prom + edad;
            
        }
        prom = prom / n;
        return prom;
    }
}
