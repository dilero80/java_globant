/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra1;

import Service.VehiculoService;
import Entity.Vehiculo;

/**
 *
 * @author Daniel Plasencia
 */
public class EjercicioExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        VehiculoService vs = new VehiculoService();
        Vehiculo v1 = vs.crearVehiculo();
        Vehiculo v2 = vs.crearVehiculo();
        Vehiculo v3 = vs.crearVehiculo();
        
        
        
        
        // Avanzando 5 segundos
        System.out.println("AVANZANDO 5 SEGUNDOS\n###########");
        vs.moverse(v1, 5);
        vs.moverse(v2, 5);
        vs.moverse(v3, 5);
        
        vs.frenarse(v1);
        vs.frenarse(v2);
        vs.frenarse(v3);
        
        System.out.println("El vehiculo 1 ("+vs.getTipo(v1)+") avanzó un total de "+vs.getDistancia(v1));
        System.out.println("El vehiculo 2 ("+vs.getTipo(v2)+") avanzó un total de "+vs.getDistancia(v2));
        System.out.println("El vehiculo 3 ("+vs.getTipo(v3)+") avanzó un total de "+vs.getDistancia(v3));
        System.out.println("\n");
   
        vs.reiniciar(v1);
        vs.reiniciar(v2);
        vs.reiniciar(v3);
        
        //// Avanzo 10 segundos
        
        System.out.println("AVANZANDO 10 SEGUNDOS\n###########");
        vs.moverse(v1, 10);
        vs.moverse(v2, 10);
        vs.moverse(v3, 10);
        
        vs.frenarse(v1);
        vs.frenarse(v2);
        vs.frenarse(v3);
        
        System.out.println("El vehiculo 1 ("+vs.getTipo(v1)+") avanzó un total de "+vs.getDistancia(v1));
        System.out.println("El vehiculo 2 ("+vs.getTipo(v2)+") avanzó un total de "+vs.getDistancia(v2));
        System.out.println("El vehiculo 3 ("+vs.getTipo(v3)+") avanzó un total de "+vs.getDistancia(v3));
        System.out.println("\n");
        
        vs.reiniciar(v1);
        vs.reiniciar(v2);
        vs.reiniciar(v3);
        
        // Avanzo 1 minuto
        
        System.out.println("AVANZANDO 60 SEGUNDOS\n###########");
        vs.moverse(v1, 60);
        vs.moverse(v2, 60);
        vs.moverse(v3, 60);
        
        vs.frenarse(v1);
        vs.frenarse(v2);
        vs.frenarse(v3);
        
        System.out.println("El vehiculo 1 ("+vs.getTipo(v1)+") avanzó un total de "+vs.getDistancia(v1));
        System.out.println("El vehiculo 2 ("+vs.getTipo(v2)+") avanzó un total de "+vs.getDistancia(v2));
        System.out.println("El vehiculo 3 ("+vs.getTipo(v3)+") avanzó un total de "+vs.getDistancia(v3));
        System.out.println("\n");
        
        vs.reiniciar(v1);
        vs.reiniciar(v2);
        vs.reiniciar(v3);
        
        ///// 5 min + freno
        
        System.out.println("AVANZANDO 300 SEGUNDOS\n###########");
        vs.moverse(v1, 300);
        vs.moverse(v2, 300);
        vs.moverse(v3, 300);
        
        vs.frenarse(v1);
        vs.frenarse(v2);
        vs.frenarse(v3);
        
        System.out.println("El vehiculo 1 ("+vs.getTipo(v1)+") avanzó un total de "+vs.getDistancia(v1));
        System.out.println("El vehiculo 2 ("+vs.getTipo(v2)+") avanzó un total de "+vs.getDistancia(v2));
        System.out.println("El vehiculo 3 ("+vs.getTipo(v3)+") avanzó un total de "+vs.getDistancia(v3));
   
        vs.reiniciar(v1);
        vs.reiniciar(v2);
        vs.reiniciar(v3);
        
    }
    
}