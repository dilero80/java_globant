/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejcextra4_poo_digitoverificador;

import Entidades.NIF;
import Servicios.ServicioNif;
import java.util.Scanner;
import static javafx.scene.input.KeyCode.R;

/**
 *
 * @author drome
 */
public class EjcExtra4_POO_DigitoVerificador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        int option = 0;
        ServicioNif SN = new ServicioNif();
        NIF N = SN.crearNIF();
        
        do{
            System.out.println("----------------------------");
            System.out.println("MENU NIF");
            System.out.println("----------------------------");
            menu();
            System.out.println("Digite la opcion deseada    ?");
            option = leer.nextInt();
            switch (option){
                case 1:
                    int dni;
                    String dnilong;
                    System.out.println("Digite el nuevo DNI");
                    System.out.println("Digite el DNI 8 digitos");
                    do{
                        dni = leer.nextInt();
                        dnilong = Integer.toString(dni);
                    }while(!(dnilong.length() == 8));
                    SN.ponerDNI(N, dni);
                    SN.ponerLetra(N);
                    System.out.println("NIF CAMBIADO EXITOSO");
                    break;
                case 2:
                    System.out.println("El NIF es:");
                    System.out.println(SN.mostrarNIF(N));
                    break;
                case 3:
                    option = 3;
                    break;
                default:
                    break;
            }
            
            
        }while(option != 3);
    }    
    
     public static void menu(){
        System.out.println("-------------------------------------------------");
        System.out.println("MENU");
        System.out.println("1. Modificar NIF");
        System.out.println("2. Mostrar NIF");
        System.out.println("3. ");
        System.out.println("4. ");
        System.out.println("5. Salir");
        System.out.println("-------------------------------------------------");
    }
    
}
