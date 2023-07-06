/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejc12_poo_personas;

import Entidades.Persona;
import Servicios.PersonaService;
import java.util.Scanner;

/**
 *
 * @author drome
 */
public class Ejc12_POO_Personas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        PersonaService PS = new PersonaService();
        Persona P1 = PS.CrearPersona();
        
        System.out.println("La persona tiene " + PS.calcularEdad(P1)+ " Años");
        System.out.println("Digite una edad de otra persona");
        int edad = leer.nextInt();
        if(PS.menorQue(P1, edad)){
            System.out.println("Es menor");
        }
        else{
            System.out.println("Es mayor");
        }
        
       PS.mostrarPersona(P1);
        System.out.println(P1); 
        
        
                
    }
    
}
