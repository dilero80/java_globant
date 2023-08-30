/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejc3_relacion_clases_spaincarts;

import Entities.Deck;
import Services.DeckService;
import java.util.Scanner;


/**
 *
 * @author drome
 */
public class Ejc3_Relacion_Clases_SpainCarts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        DeckService ds = new DeckService();
        
        
        Deck D = ds.createDeck();
        ds.shuffleDeckInitial(D);
        int optionMenu;
        
        do{
            menu();
            optionMenu = read.nextInt();
            
            switch(optionMenu){
                case 1:
                    
                    ds.showCards(D);
                    waitKey();
                    
                    break;
                case 2:
                    ds.showCardsShuffle(D);
                    waitKey();
                    break;
                case 3:
                    ds.shuffleDeck(D);
                    waitKey();
                    break;
                case 4:
                    ds.showCardsUsed(D);
                    waitKey();
                    break;
                case 5:
                    ds.giveCard(D);
                    waitKey();
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
        System.out.println("1. Crear Baraja");
        System.out.println("2. Mostrar Baraja disponible");
        System.out.println("3. Mezclar Baraja ");
        System.out.println("4. mostrar cartas dadas");
        System.out.println("5. Dar Carta");
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
  

