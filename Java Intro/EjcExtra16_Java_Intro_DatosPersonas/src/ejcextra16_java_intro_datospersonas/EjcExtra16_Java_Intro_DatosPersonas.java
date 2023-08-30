/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejcextra16_java_intro_datospersonas;
import java.util.Scanner;
/**
 *
 * @author drome
 * Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
 * las personas ingresadas por teclado e indique si son mayores o menores de edad.
 * Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
 * mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
public class EjcExtra16_Java_Intro_DatosPersonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        int qtyPersons;
        
        System.out.println("Digite la cantidad de personas a ingresas");
        qtyPersons = leer.nextInt();
        
        int [] ages = new int[qtyPersons];
        String [] names = new String [qtyPersons];
        askUsers(names, ages, qtyPersons);
        showUser(names, ages, qtyPersons);
        
        
        
        
    }
    
    public static void askUsers(String [] names, int [] ages, int size){
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i < size; i++){
            System.out.println("Digite el nombre del usuario #" + (i+1));
            names[i] = leer.next();
            System.out.println("Digite la edad del usuario #" + (i+1));
            ages[i] = leer.nextInt();
           
        }
        
    }
     public static void showUser(String [] names, int [] ages, int size){
         Scanner leer = new Scanner(System.in);
         int cont = 0;
         String option;
         do{
             System.out.println("USUARIO #" + (cont+1));
             System.out.println("NOMBRE: " + names[cont] );
             System.out.println("EDAD: " + ages[cont]);
             if(ages[cont]>17){
                 System.out.println("Es mayor de edad");
             }
             else{
                 System.out.println("Es menor de edad");
             }
             cont++;
             if(cont == size){
                 System.out.println("Ya no hay mas usuarios");
                 break;
             }
             System.out.println("DESEA CONTINUAR (SI/NO)");
             option = leer.nextLine();
             option = option.toUpperCase();
             
         }while(!option.equals("NO") && cont < size);
         
         
     }
    
}
