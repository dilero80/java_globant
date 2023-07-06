/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejc14_poo_tiendamovil;

import Entidades.Movil;
import Servicios.ServicioMovil;
import java.util.Scanner;

/**
 *
 * @author drome
 */
public class Ejc14_POO_tiendaMovil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        ServicioMovil SM = new ServicioMovil();
        
        System.out.println("Digite la cantidad de celulares a ingresar  ");
        int cant = leer.nextInt();
        int cont = 0;
        Movil C[] = new Movil[cant];
        
        int option = 0;
        do{
            menu();
            System.out.println("Digite la opcion deseada    ?");
            option = leer.nextInt();
            switch (option){
                case 1:
                    if (cont < cant){
                        C[cont] = SM.crearCel();
                        cont++;
                    }
                    else{
                        System.out.println("Ya estan llenas todas las celdas, puede modificar con opcion 3");
                    }
                    break;
                case 2:
                    System.out.println("digite el cel a verificar");
                    int celNum = leer.nextInt();
                    if (celNum <= cant) {
                        SM.MostrarCel(C[celNum-1]);
                    }
                    else{
                        System.out.println("no esta en el arreglo");
                    }
                    break;
                case 3:
                    option = 3;
                    break;
                default:
                    break;
            }
            
            
        }while(option != 3 );
        
    }
    
    public static void menu(){
        System.out.println("-------------------------------------------------");
        System.out.println("MENU");
        System.out.println("1. Ingresar nuevo cel");
        System.out.println("2. Verificar Cel");
        System.out.println("3. Salir");
        System.out.println("-------------------------------------------------");
    }
}
