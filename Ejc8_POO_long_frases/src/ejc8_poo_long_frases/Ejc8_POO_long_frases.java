/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejc8_poo_long_frases;
import Entidades.Cadena;
import Servicios.CadenaServ;
import java.util.Scanner;
/**
 *
 * @author drome
 */
public class Ejc8_POO_long_frases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        CadenaServ newString = new CadenaServ();
        Cadena C = newString.crearCadena();
        int option = 0;
        do{
            menu();
            System.out.println("Digite la opcion deseada    ?");
            option = leer.nextInt();
            switch (option){
                case 1:
                    System.out.println("La cantidad de vocales que contiene la frase es " + newString.mostrarVocales(C));
                    break;
                case 2:
                    System.out.println("La frase al reves es " +newString.invertirFrase(C) );
                    break;
                case 3:
                    newString.vecesRepetido(C);
                    break;
                case 4:
                    newString.compararFrase(C);
                    break;
                case 5:
                    newString.unirFrases(C);
                    break;
                case 6:
                    newString.reemplazarChar(C);
                    break;
                case 7:
                    newString.contarChar(C);
                    break;
                case 8:
                    option = 8;
                    break;
                default:
                    break;
            }
            
            
        }while(option != 8 );
        
        
        
    }
    
    public static void menu(){
        System.out.println("-------------------------------------------------");
        System.out.println("MENU");
        System.out.println("1. Contar Vocales");
        System.out.println("2. Invertir frase");
        System.out.println("3. Veces repetido");
        System.out.println("4. Comparar longitud");
        System.out.println("5. Unir Frases");
        System.out.println("6. Reemplazar Caracter");
        System.out.println("7. Contiene Caracter");
        System.out.println("8. Salir");
        System.out.println("-------------------------------------------------");
    }
    
}
