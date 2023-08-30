/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejcextra_15_java_intro;
import java.util.Scanner;

/**
 *
 * @author drome
 * Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
 * restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
 * matemática y deben devolver sus resultados para imprimirlos en el main.
 */
public class EjcExtra_15_Java_Intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        String opcion;
        
        System.out.println("Digite Numero 1");
        int num1 = leer.nextInt();
        System.out.println("Digite numero 2");
        int num2 = leer.nextInt();
        
        
        do{
            menu();
            opcion =leer.next();
            opcion = opcion.toUpperCase();
            switch (opcion){
                case "A":
                    System.out.println("El resutaldo de la suma es " + (sum(num1, num2)));
                    break;
                case "B":
                    System.out.println("El resultado de la resta es " +(res(num1, num2)));
                    break;
                case "C":
                    System.out.println("El resultado de la multiplicacion es " + (mul(num1,num2)));
                    break;
                case "D":
                    System.out.println("El resultado de la division " + (div(num1, num2)));
                    break;
                case "E":
                    System.out.println("Gracias");
                    break;
                default:
                    System.out.println("No es una opcion valida");
                    break;
            }
                    
                    
        }while(!opcion.equals("E"));
           
        
        
        
        
    }
    
    
    public static void menu(){
        System.out.println("MENU");
        System.out.println("A. SUMAR");
        System.out.println("B. RESTAR");
        System.out.println("C. MULTIPLICAR");
        System.out.println("D. DIVIDIR");
        System.out.println("E. SALIR.");
        System.out.println("Digite su opcion");
    }
    public static int sum(int num1, int num2){
        return num1 + num2;
        
    }
    public static int res(int num1, int num2){
        return num1 - num2;
        
    }
    public static int mul(int num1, int num2){
        return num1 * num2;
    }
    public static float div(int num1, int num2){
        return (float)(num1 / num2);
    }
    
}
