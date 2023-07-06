/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cafetera;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author drome
 */
public class CafeteraServicio {
    Scanner leer = new Scanner(System.in);
    
    public Cafetera CrearCafetera(){
        System.out.println("Estas creando una Cafetera");
        System.out.println("Digita la cantidad Maxima de Cafe que soporta");
        int cantMax = leer.nextInt();
        Cafetera C = new Cafetera(cantMax, 0);
        return C;
        
    }
    
    public void LlenarCafetera(Cafetera C){
        C.setCantActual(C.getCantMaxi());
        System.out.println("La Cafetera se ha llenado");
    }
    
    public void ServirTaza(Cafetera C){
        System.out.println("Vamos a servir una taza");
        System.out.println("Digite el tamaño de la taza");
        float size = leer.nextFloat();
        float actual =  C.getCantActual();
        if (actual < size){
            System.out.println("No esta disponible toda la cantidad deseada.");
            System.out.println("su taza sera llenada con solo " + actual);
            System.out.println("Taza no fue llenada completamente");
            C.setCantActual(0);
            
        }
        else{
            System.out.println("Taza completamnete llena");
            C.setCantActual(actual - size);
        }
    }
    
    public void VaciarCafetera(Cafetera C){
        C.setCantActual(0);
    }
    
    public void AgregarCafe(Cafetera C, float cafe){
        float max = C.getCantMaxi();
        float actual = C.getCantActual();
        if(cafe > (max-actual)){
            System.out.println("No puedes ingresar esa cantidad");
            System.out.println("Solo puedes ingresar " + (max -actual) +" de cafe");
        }
        else{
            System.out.println("Has ingresado " + cafe + "de cafe" );
            System.out.println("la cafetera tiene ahora " + C.getCantActual() +" de cafe");
            C.setCantActual(actual+cafe);
        }
    }
            
    
    
}
