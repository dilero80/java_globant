/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejcextragrupal2_poo_gymapp;

import Entidades.Cliente;
import Entidades.Rutina;
import Servicios.ServicioCliente;
import Servicios.ServicioRutina;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author drome
 */
public class EjcExtraGrupal2_POO_GymApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        int option;
        String id;
        ArrayList<Cliente> CL = new ArrayList<>();
        ArrayList<Rutina> RL = new ArrayList<>();
        ServicioCliente SC = new ServicioCliente();
        ServicioRutina SR = new ServicioRutina();
        
        do{
            System.out.println("----------------------------");
            System.out.println("MENU GYM");
            System.out.println("----------------------------");
            menu();
            System.out.println("Digite la opcion deseada    ?");
            option = leer.nextInt();
            switch (option){
                case 1:
                    Cliente C = SC.registrarCliente();
                    CL.add(C);
                    break;
                case 2:
                    SC.obtenerClientes(CL);
                    break;
                case 3:
                    
                    System.out.println("Digite el ID del cliente a actualizar");
                    id = leer.next();
                    SC.actualizarCliente(CL, id);
                    break;
                case 4:
                    System.out.println("Digite el ID del cliente a borrar");
                    id = leer.next();
                    SC.eliminarCliente(CL, id);
                    break;
                case 5:
                    Rutina R = SR.crearRutina();
                    RL.add(R);
                    break;
                case 6:
                    SR.obtenerRutinas(RL);
                    break;
                case 7:
                    System.out.println("Digite el ID de Rutina a actualizar");
                    id = leer.next();
                    SR.actualizarRutina(RL, id);
                    break;
                case 8:
                    System.out.println("Digite el ID del Rutina a borrar");
                    id = leer.next();
                    SR.eliminarRutina(RL, id);
                    break;
                case 9:
                    System.out.println("Digite el ID del cliente a mostrar");
                    id = leer.next();
                    SC.verCliente(CL, id);
                    break;
                case 10:
                    System.out.println("Digite el ID de rutina a mostrar");
                    id = leer.next();
                    SR.verRutina(RL, id);
                    break;
                case 11:
                    option = 11;
                    break;
                default:
                    
                    break;
            }
            
            
        }while(option != 11);
        
        
    }
    



    public static void menu(){
        System.out.println("-------------------------------------------------");
        System.out.println("MENU");
        System.out.println("1. Crear Cliente");
        System.out.println("2. Listar Clientes");
        System.out.println("3. Modificar Cliente");
        System.out.println("4. Borrar Cliente");
        System.out.println("5. Crear Rutina");
        System.out.println("6. Listar Rutinas");
        System.out.println("7. Modificar Rutinas");
        System.out.println("8. Borrar Rutinas");
        System.out.println("9. Ver Cliente por ID");
        System.out.println("10. Ver Rutina por ID");
        System.out.println("11. Salir");
        System.out.println("-------------------------------------------------");
    }

}