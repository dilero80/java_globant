/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejc2_relaciones_clases_ruletarusaapp;

import Entities.Game;
import Services.PistolAppService;
import java.util.Scanner;

/**
 *
 * @author drome
 */
public class Ejc2_Relaciones_Clases_RuletaRusaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        PistolAppService ps = new PistolAppService();
        Game newGame = ps.fillGame();
        ps.playGame(newGame);
        
        /*int optionMenu;
        
        do{
            menu();
            optionMenu = read.nextInt();
            switch(optionMenu){
                case 1:
                    
                    waitKey();
                    
                    break;
                case 2:
                    
                    waitKey();
                    break;
                case 3:
                    waitKey();
                    break;
                case 4:
                    waitKey();
                    break;
                case 5:
                    
                    break;
                case 6:
                    optionMenu = 6;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    optionMenu = 0;
                    break;
            }
        }while(!(6 == optionMenu));
        
        */
        
    }
    
    /**
     * Menu opciones
     */
    /*
    public static void menu(){
        System.out.println("=============================");
        System.out.println("------------MENU-------------");
        System.out.println("=============================");
        System.out.println("1. Crear Libro");
        System.out.println("2. Mostrar Libros");
        System.out.println("3. Prestar Libro ");
        System.out.println("4. Retornar Libro");
        System.out.println("5. Eliminar Libro");
        System.out.println("6. Salir");
        System.out.println("=============================");
        System.out.println("Digite su opcion? ");
    }
    
    public static void waitKey(){
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        String option;
        do{
            System.out.println("Presione C + ENTER para continuar ");
            
            option = read.next();
        }while(!(option.equalsIgnoreCase("C")));
        System.out.println("SALI");
    
    }*/
    
}
