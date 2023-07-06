/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejcextra6_poo_juego_ahorcado;

import Entidades.Ahorcado;
import Servicios.ServicioAhorcado;
import java.util.Scanner;
import static javafx.scene.input.KeyCode.M;

/**
 *
 * @author drome
 */
public class EjcExtra6_POO_juego_Ahorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        int option = 0;
        ServicioAhorcado SA = new ServicioAhorcado();
        Ahorcado A = SA.crearAhorcado();
        do{
            System.out.println("----------------------------");
            System.out.println("MENU AHORCADO");
            System.out.println("----------------------------");
            menu();
            System.out.println("Digite la opcion deseada    ?");
            option = leer.nextInt();
            switch (option){
                case 1:
                    int jugadas = SA.intentos(A);
                    if(SA.juego(A)){
                        System.out.println("-----------------------");
                        System.out.println("GANASTE");
                         System.out.println("-----------------------");
                    }
                    else{
                        System.out.println("-----------------------");
                        System.out.println("PERDISTE");
                        System.out.println("-----------------------");
                    }
                    SA.reempezarJuego(A, jugadas);
                    break;
                case 2:
                    System.out.println("Digite la palabra nueva");
                    A.setWord(leer.next());
                    System.out.println("Palabra cambiada");
                    break;
                case 3:
                    System.out.println("La palabra es " + A.getWord());
                    break;
                case 4:
                    SA.mostrarVector(A);
                    break;
                default:
                    option = 5;
                    break;
            }
            
            
        }while(option != 5);
    }    
    
     public static void menu(){
        System.out.println("-------------------------------------------------");
        System.out.println("MENU");
        System.out.println("1. Jugar");
        System.out.println("2. Cambiar Palabra");
        System.out.println("3. Mostrar Palabra");
        System.out.println("4. Mostrar vector");
        System.out.println("5. Salir");
        System.out.println("-------------------------------------------------");
    }
    
    
    
}
