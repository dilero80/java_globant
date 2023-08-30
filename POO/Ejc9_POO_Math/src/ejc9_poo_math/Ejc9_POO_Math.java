/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejc9_poo_math;

import Entidades.Matematica;
import Servicios.MathService;
import java.util.Scanner;

/**
 *
 * @author drome
 */
public class Ejc9_POO_Math {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int option = 0;
        long num1 = (long) (Math.random()*100);
        long num2 = (long) (Math.random()*100);
        MathService M = new MathService();
        Matematica Mat = M.CrearMatematica(num1, num2);
        
        do{
            System.out.println("----------------------------");
            System.out.println("Los Numeros son " + Mat.getNum1() + " y " + Mat.getNum2());
            System.out.println("----------------------------");
            menu();
            System.out.println("Digite la opcion deseada    ?");
            option = leer.nextInt();
            switch (option){
                case 1:
                    num1 = (long) (Math.random()*100);
                    num2 = (long) (Math.random()*100);
                    Mat.setNum1(num1);
                    Mat.setNum2(num2);
                    
                    System.out.println("Los nuevos Numeros son " + Mat.getNum1() + " y " + Mat.getNum2());
                    break;
                case 2:
                    System.out.println("El numero mayor es " + M.devolverMayor(Mat));
                    break;
                case 3:
                    System.out.println("El " + M.devolverMayor(Mat) + " eleveado al " + M.devolverMenor(Mat) + " da " + M.calcularPotencia(Mat));
                    break;
                case 4:
                    System.out.println("La raiz del numero menor " +M.devolverMenor(Mat) + " es  " + M.calcularRaiz(Mat));
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
        System.out.println("2. Cual es mayor");
        System.out.println("3. Calcular Potencia");
        System.out.println("4. Calcular Raiz");
        System.out.println("5. Salir");
        System.out.println("-------------------------------------------------");
    }
}
