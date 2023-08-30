/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejc1_relacion_clases_adoptdogapp;

import Entities.Dog;
import Entities.Person;
import Enumerators.Sizes;
import Services.DogService;
import Services.PersonService;
import java.util.Scanner;

/**
 *
 * @author drome
 */
public class Ejc1_Relacion_Clases_AdoptDogApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        
        PersonService ps = new PersonService();
        DogService ds = new DogService();
        
//        Dog d1 = ds.CreateDog("Rambo", "Pincher", 3, Sizes.SMALL.toString() );
//        Dog d2 = ds.CreateDog("Snoopy", "Poodle", 5, Sizes.MEDIUM.toString());
        
//        Person p1 = ps.createPerson("Diego", "Romero", 43, 79881592, d1);
//        Person p2 = ps.createPerson("Alex", "Hernandez", 52, 79517316, d2);
        
//        System.out.println(p1);
//        System.out.println(p2);
        int optionMenu;
        String optionYes;
        do{
            menu();
            optionMenu = read.nextInt();
            optionYes = "N";
            switch(optionMenu){
                case 1:
                    do {
                        ps.createPersoninList();
                        System.out.println("Desea agregar otra persona S/N");
                        do {                            
                            optionYes=read.next();
                            
                        } while (!(optionYes.equalsIgnoreCase("S") || optionYes.equalsIgnoreCase("N")));
                        
                        
                    } while (optionYes.equalsIgnoreCase("S"));
                    
                    
                    waitKey();
                    
                    break;
                case 2:
                    do {
                        ds.createDoginList();
                        System.out.println("Desea agregar otro perro S/N");
                        do {                            
                            optionYes=read.next();
                            
                        } while (!(optionYes.equalsIgnoreCase("S") || optionYes.equalsIgnoreCase("N")));
                        
                        
                    } while (optionYes.equalsIgnoreCase("S"));
                    
                    waitKey();
                    break;
                case 3:
                    ps.listPersons();
                    waitKey();
                    break;
                case 4:
                    ds.listDog();
                    waitKey();
                    break;
                case 5:
                    if(ps.assignDog(ds))
                    {
                        System.out.println("Mascota asignada correctamente");
                    }
                    else{
                        System.out.println("Ocurrio un error asignando mascosta, revise el nombre o si alguno de los dos ya tiene mascota o dueño asignado");
                    }
                    waitKey();
                    break;
                case 6:
                    ds.listDogfilter();
                    waitKey();
                    break;
                case 7:
                    ps.listPersonsfilter();
                    waitKey();
                    break;
                case 8:
                    ps.createPersonsTemplate();
                    ds.createDogsTemplate();
                    waitKey();
                    
                    break;
                case 9:
                    optionMenu = 9;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    optionMenu = 0;
                    break;
            }
        }while(!(9 == optionMenu));
        
        
        
    }
    
    /**
     * Menu opciones
     */
    
    public static void menu(){
        System.out.println("=============================");
        System.out.println("------------MENU-------------");
        System.out.println("=============================");
        System.out.println("1. Crear Persona");
        System.out.println("2. Crear Mascota");
        System.out.println("3. Listar Personas");
        System.out.println("4. Listar Mascotas");
        System.out.println("5. Asociar Mascota");
        System.out.println("6. Listar Mascotas Disponibles");
        System.out.println("7. Listar Personas Sin Mascota");
        System.out.println("8. Crear lista prederteminada");
        System.out.println("9. Salir");
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
