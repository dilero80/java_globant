/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejc3_poo_operacion;

import Entidades.Operacion;
import Servicios.OperService;
import java.util.Scanner;

/**
 *
 * @author drome
 */
public class Ejc3_POO_Operacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        OperService oper = new OperService();
        Operacion oper1 = oper.crearOperacion();
        int menu = 6;
        
        do{
            System.out.println("Digite la opcion");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Cambiar numeros");
            System.out.println("6. Salir");
            menu = leer.nextInt();
        
            switch (menu){
                case 1:
                    System.out.println("La suma da " + oper.SumaOper(oper1));
                    break;
                case 2:
                    System.out.println("La resta da " + oper.RestaOper(oper1));
                    break;
                case 3:
                    if(oper.MultiOper(oper1)!=0){
                        System.out.println("La multiplicacion da " + oper.MultiOper(oper1));
                    }
                    break;
                case 4:
                    if(oper.DiviOper(oper1)!=0){
                        System.out.println("La division da " + oper.DiviOper(oper1));
                    }
                    break;
                case 5:
                    oper.changeOperacion(oper1);
                    break;
                case 6:
                    System.out.println("Gracias");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            } 
            
        }while (menu != 6 || 6 < menu);
                
        
        
    }
    
}
