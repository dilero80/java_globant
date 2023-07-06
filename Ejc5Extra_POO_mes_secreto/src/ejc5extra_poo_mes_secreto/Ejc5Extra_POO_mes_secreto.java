/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejc5extra_poo_mes_secreto;

import Entidades.MesSecreto;
import Servicios.ServicioMes;
import java.util.Scanner;

/**
 *
 * @author drome
 */
public class Ejc5Extra_POO_mes_secreto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        int option = 0;
        ServicioMes SM = new ServicioMes();
        MesSecreto M = SM.crearMesSecreto();
        
        do{
            System.out.println("----------------------------");
            System.out.println("MENU MES SECRETO");
            System.out.println("----------------------------");
            menu();
            System.out.println("Digite la opcion deseada    ?");
            option = leer.nextInt();
            switch (option){
                case 1:
                    boolean flagMes = false;
                    boolean flagAdivino = false;
                    String mesText;
                    String [] meses = M.getMeses();
                    do{
                        
                        do{
                            System.out.println("Digite el Mes en minusculas");
                            mesText = leer.next();
                            for (String mese : meses) {
                                
                                if (mesText.equals(mese)) {
                                    
                                    flagMes = true;
                                }
                            }
                            
                        }while(!flagMes);
                        
                        if(SM.compararMeses(M, mesText)){
                            System.out.println("Lo Adivinaste");
                            flagAdivino = true;
                        }
                        else{
                            System.out.println("Intentalo de nuevo");
                        }
                    
                    }while(!flagAdivino);
                    break;
                case 2:
                    System.out.println("El MES SECRETO ES:");
                    System.out.println(SM.verMes(M));
                    break;
                case 3:
                    System.out.println("Vamos a cambiar el mes");
                    SM.cambiarMes(M);
                    System.out.println("MES CAMBIADO...");
                    break;
                case 4:
                    option = 4;
                    break;
                default:
                    break;
            }
            
            
        }while(option != 4);
    }    
    
     public static void menu(){
        System.out.println("-------------------------------------------------");
        System.out.println("MENU");
        System.out.println("1. Adivinar Mes Secreto");
        System.out.println("2. Mostrar Mes Secreto");
        System.out.println("3. Cammbiar Mes Secreto");
        System.out.println("4. ");
        System.out.println("5. Salir");
        System.out.println("-------------------------------------------------");
    }
    
}
