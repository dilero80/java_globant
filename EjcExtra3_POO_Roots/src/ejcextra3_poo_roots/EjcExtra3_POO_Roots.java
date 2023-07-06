/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejcextra3_poo_roots;

import Entidades.Raices;
import Servicios.ServicioRaices;
import java.util.Scanner;

/**
 *
 * @author drome
 */
public class EjcExtra3_POO_Roots {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        ServicioRaices SR = new ServicioRaices();
        Raices R = SR.CrearRaices();
        int option = 0;
        
        do{
            System.out.println("----------------------------");
            System.out.println("Calcula raices de una ecuacion");
            System.out.println("----------------------------");
            menu();
            System.out.println("Digite la opcion deseada    ?");
            option = leer.nextInt();
            switch (option){
                case 1:
                    System.out.println("Digite el nuevo a");
                    R.setA(leer.nextDouble());
                    System.out.println("Digite el nuevo b");
                    R.setB(leer.nextDouble());
                    System.out.println("Digite el nuevo c");
                    R.setC(leer.nextDouble());
                    break;
                case 2:
                    SR.calcular(R);
                    break;
                case 3:
                    System.out.println(SR.getDiscriminante(R));
                    break;
                case 4:
                    break;
                case 5:
                    option = 5;
                    break;
                default:
                    break;
            }
            
            
        }while(option != 5);
    }    
    
     public static void menu(){
        System.out.println("-------------------------------------------------");
        System.out.println("MENU");
        System.out.println("1. Cambiar numeros");
        System.out.println("2. Calcular raices");
        System.out.println("3. Discriminante");
        System.out.println("4. ");
        System.out.println("5. Salir");
        System.out.println("-------------------------------------------------");
    }
}
