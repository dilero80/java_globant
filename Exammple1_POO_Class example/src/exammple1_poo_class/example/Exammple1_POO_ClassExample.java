/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exammple1_poo_class.example;
import java.util.Scanner;
import Entidad.Persona;
import Servicios.PersonaService;
/**
 *
 * @author drome
 */
public class Exammple1_POO_ClassExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersonaService persServ = new PersonaService();
        
        Persona primerPersona = persServ.crearPersona();
        Persona segundaPersona = persServ.crearPersona();
        
        persServ.showPersona(primerPersona);
        
        
        
        
        
    }
    
}
