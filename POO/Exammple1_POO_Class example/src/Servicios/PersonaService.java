/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;
import java.util.Scanner;
import Entidad.Persona;

/**
 *
 * @author drome
 */
public class PersonaService {
    
    public Persona crearPersona(){
        Scanner leer = new Scanner(System.in);
        Persona personaCompleta = new Persona();
        System.out.println("Ingrese nombre de la persona");
        personaCompleta.setName(leer.next());
        System.out.println("Ingrese Apellido");
        personaCompleta.setLastname(leer.next());
        System.out.println("Ingrese la edad");
        personaCompleta.setAge(leer.nextInt());
        return personaCompleta;
    }
    
    public Persona showPersona(Persona name){
        
        System.out.println("El nombre es " + name.getName() );
        System.out.println("El apellido es " + name.getLastname());
        System.out.println("Su edad es " + name.getAge());
        return null;
        
        
        
    }
    
    
}
