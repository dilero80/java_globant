/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;


/**
 *
 * @author drome
 */
public class PersonaService {
    Scanner leer = new Scanner(System.in);
    
    public Persona CrearPersona(){
        int anio, mes, dia;
        System.out.println("Digite su nombre");
        String name = leer.nextLine();
        System.out.println("Digite Su fecha de nacimiento");
        System.out.println("Año: ");
        do{
            anio = leer.nextInt();
        }while(1900 > anio );
        anio = anio-1900;
        System.out.println("mes: ");
        do{
            mes = leer.nextInt();
        }while(!(mes > 0 && mes <= 12));
        mes = mes; 
        System.out.println("dia: ");
        do{
            dia = leer.nextInt();
        }while(!(dia > 0 && dia <= 31));
        
        Date fecha;
        fecha = new Date(anio,mes,dia);
        
        Persona P = new Persona(name, fecha);
        return P;
    }
    
    public int calcularEdad(Persona P){
        int edad;
        Date hoy = new Date();
        edad = hoy.getYear()-P.getBorn().getYear();
        return edad;
    }
    
    /**
     * Si edad enviada es menor devuelve true de lo contrario false
     * @param P
     * @param edadCompare
     * @return 
     */
    public boolean menorQue(Persona P, int edadCompare){
        return (edadCompare < calcularEdad(P));
    }
    
    /**
     * 
     * @param P 
     */
    
    public void mostrarPersona(Persona P){
        System.out.println("El nombre de la persona es " + P.getName());
        System.out.println("y su fecha de nacimiento es " + P.getBorn().getYear() + "/" + P.getBorn().getMonth() + "/" + P.getBorn().getDay());
    }
}
