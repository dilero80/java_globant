/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejc4_colecciones_peliapp;

import Services.MovieService;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author drome
 */
public class Ejc4_Colecciones_PeliApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        MovieService ms = new MovieService();
        int optionMenu;
        
        
        do{
            menu();
            optionMenu = read.nextInt();
            switch(optionMenu){
                case 1:
                    ms.addMovies();
                    waitKey();
                    
                    break;
                case 2:
                    ms.showMovies();
                    waitKey();
                    break;
                case 3:
                    ms.orderByDurationAsc();
                    waitKey();
                    
                    break;
                case 4:
                    ms.orderByDurationDesc();
                    waitKey();
                    break;
                case 5:
                    ms.showMoviesUp1();
                    waitKey();
                    break;
                case 6:
                    ms.orderBytitle();
                    waitKey();
                    break;
                case 7:
                    ms.orderByDirector();
                    waitKey();
                    break;
                case 8:
                    ms.addMoviesFixed();
                    waitKey();
                    break;
                case 9:
                    optionMenu= 9;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while(!(9 == optionMenu));
      
    }
    
    
    public static void menu(){
        System.out.println("=============================");
        System.out.println("------------MENU-------------");
        System.out.println("=============================");
        System.out.println("1. Crear Peliculas");
        System.out.println("2. Listar Peliculas");
        System.out.println("3. Listar ordenado por duracion de Mayor a Menor");
        System.out.println("4. Listar ordenado por duracion de Menor a Mayor");
        System.out.println("5. Listar Peliculas duracion mayor a una hora");
        System.out.println("6. Listar Peliculas Ordenadas por titulo");
        System.out.println("7. Listar Peliculas ordenadas por director");
        System.out.println("8. Crear Peliculas FIxed");
        System.out.println("9.Salir");
        System.out.println("=============================");
        System.out.println("Digite su opcion? ");
    }
    
    public static void waitKey(){
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        String option;
        do{
            System.out.println("Presione enter para continuar ");
            
            option = read.next();
        }while(!(option.equalsIgnoreCase("")));
        System.out.println("SALI");
    }
    
}
