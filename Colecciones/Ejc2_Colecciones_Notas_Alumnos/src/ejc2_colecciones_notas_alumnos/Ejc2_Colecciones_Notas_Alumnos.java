/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejc2_colecciones_notas_alumnos;

import Services.AlumnService;
import java.util.Scanner;

/**
 *
 * @author drome
 */
public class Ejc2_Colecciones_Notas_Alumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        AlumnService as = new AlumnService();
        int optionMenu;
        
        
        do{
            menu();
            optionMenu = read.nextInt();
            switch(optionMenu){
                case 1:
                    as.createAlumns();
                    waitKey();
                    
                    break;
                case 2:
                    System.out.println("Digite el nombre del alumno que quiere calcular la nota final");
                    System.out.println("La nota final es " + as.finalNote(read.next()));
                    waitKey();
                    break;
                case 3:
                    as.showAlumns();
                    waitKey();
                    optionMenu = 0;
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while(!(4 == optionMenu));
      
    }
    
    
    public static void menu(){
        System.out.println("=============================");
        System.out.println("------------MENU-------------");
        System.out.println("=============================");
        System.out.println("1.CREAR ALUMNOS");
        System.out.println("2.CALCULAR NOTA FINAL ALUMNO POR NOMBRE");
        System.out.println("3. Listar Alumnos");
        System.out.println("4.Salir");
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
