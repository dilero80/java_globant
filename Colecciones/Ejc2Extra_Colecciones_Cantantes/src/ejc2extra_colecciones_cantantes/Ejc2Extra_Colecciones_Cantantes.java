/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejc2extra_colecciones_cantantes;


import Entities.FamousSinger;
import Services.SingerService;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y 
 * tendrá como atributos el nombre y discoConMasVentas. 
 * Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5 objetos 
 * de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de cada cantante 
 * y su disco con más ventas por pantalla.
 * Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de 
 * agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el usuario 
 * elija o de salir del programa. Al final se deberá mostrar la lista con todos los cambios
 * @author drome
 */
public class Ejc2Extra_Colecciones_Cantantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<FamousSinger> Singers = new ArrayList();
        SingerService ss = new SingerService();
        String name;
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        int optionMenu;
        
        
        do{
            menu();
            optionMenu = read.nextInt();
            switch(optionMenu){
                case 1:
                    ss.createSingerDefault(Singers);
                    
                    waitKey();
                    
                    break;
                case 2:
                    ss.showSingers(Singers);
                    waitKey();
                    break;
                case 3:
                    System.out.println("Digite el nombre del Cantante");
                    name = read.next();
                    System.out.println("Digite el album mas vendido");
                    String bestSale = read.next();
                    FamousSinger ns = ss.CreateSinger(name, bestSale) ;
                    Singers.add(ns);
                    waitKey();
                    break;
                case 4:
                    System.out.println("Digite el nombre del Cantante a Modificar");
                    name = read.next();
                    ss.replaceSinger(Singers, name);
                    waitKey();
                    break;
                case 5:
                    System.out.println("Digite el nombre del Cantante a Eliminar");
                    name = read.next();
                    ss.removeSingers(Singers, name);
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
        
        
        
    }
    
    /**
     * Menu opciones
     */
    public static void menu(){
        System.out.println("=============================");
        System.out.println("------------MENU-------------");
        System.out.println("=============================");
        System.out.println("1. Crear Lista Default");
        System.out.println("2. Mostrar Cantantes Famosos");
        System.out.println("3. Adicionar Cantante Famoso");
        System.out.println("4. Modificar Cantante Famoso");
        System.out.println("5. Eliminar Cantante Famoso");
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
    }
    
}
