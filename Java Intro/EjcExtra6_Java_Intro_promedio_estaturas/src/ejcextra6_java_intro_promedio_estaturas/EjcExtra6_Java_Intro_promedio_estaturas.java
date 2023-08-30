/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejcextra6_java_intro_promedio_estaturas;
import java.util.Scanner;
/**
 *
 * @author drome
 */
public class EjcExtra6_Java_Intro_promedio_estaturas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("digite cantidad de alturas");
        int n = leer.nextInt();
        int prom = 0;
        int prom160 = 0;
        int cont160 = 0;
        int hights[] = new int [n];
        for (int i = 0; i < n; i++){
            System.out.println("Digite altura #"+(i+1));
            hights[i]=leer.nextInt();
            if (hights[i]<=160){
                prom160 = prom160 + hights[i];
                cont160 ++;
            }
            prom = prom + hights[i];
        }
        System.out.println("El numero de personas con estatura menor o igual a 160cm es "+ cont160 + "y el promedio es "+(prom160/cont160));
        System.out.println("El promedio total de alturas es "+ (prom / n));
        
        
    }
    
}
