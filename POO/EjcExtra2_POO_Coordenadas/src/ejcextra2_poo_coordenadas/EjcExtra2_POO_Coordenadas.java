/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejcextra2_poo_coordenadas;

import Entidades.Puntos;
import Servicios.ServicioPuntos;

/**
 *
 * @author drome
 */
public class EjcExtra2_POO_Coordenadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioPuntos SP = new ServicioPuntos();
        Puntos P = SP.CrearPuntos();
        
        System.out.println("La distancia entre los puntos es " + SP.calcularDistancia(P) );
        
    }
    
}
