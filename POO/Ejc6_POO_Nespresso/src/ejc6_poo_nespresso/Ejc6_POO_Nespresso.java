/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejc6_poo_nespresso;

import Entidades.Cafetera;
import Servicios.CafeteraServicio;

/**
 *
 * @author drome
 */
public class Ejc6_POO_Nespresso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CafeteraServicio CofeeMachine = new CafeteraServicio();
        Cafetera C1 = CofeeMachine.CrearCafetera();
        
        CofeeMachine.LlenarCafetera(C1);
        
        CofeeMachine.ServirTaza(C1);
        
        CofeeMachine.AgregarCafe(C1, 100);
        
        CofeeMachine.ServirTaza(C1);
        
        CofeeMachine.VaciarCafetera(C1);
        
        
        
        
    }
    
}
