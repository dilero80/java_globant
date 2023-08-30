/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejc11_java_intro_menu_arimetico;
import java.util.Scanner;
/**
 *
 * @author drome
 */
public class Ejc11_java_intro_menu_arimetico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite numero 1");
        int num1 = leer.nextInt();
        System.out.println("Digite numero2");
        int num2 = leer.nextInt();
        
        boolean exitOption = true;
        do {
            menu();
            int optionMenu = leer.nextInt();
            switch (optionMenu){
                case 1:
                    System.out.println("La Suma es "+ (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta es"+ (num1 - num2));
                    break;
                case 3:
                    System.out.println("La multiplicacion es:" + (num1*num2));
                    break;
                case 4:
                    System.out.println("La division es:"+ (num1/num2));
                    break;
                case 5:
                    System.out.println("Esta Seguro que desea salir S/N");
                    String salir = leer.next();
                    if ("S".equals(salir) || "s".equals(salir)){
                        exitOption=false;
                        }
                        break;
                    default :
                        break;
                }              
        }
        while (exitOption);
    }            
    
    public static void menu(){
        System.out.println("MENU");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5.Salir");
        System.out.println("Elija opcion");
    }
}
    

