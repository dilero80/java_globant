/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Puntos;
import java.util.Scanner;

/**
 *
 * @author drome
 */
public class ServicioPuntos {
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    
    public Puntos CrearPuntos(){
        Puntos P = new Puntos();
        
        System.out.println("Vamos a crear un Punto Coordenada");
        System.out.println("digite Punto X1");
        P.setX1(leer.nextFloat());
        System.out.println("Digite Punto Y1");
        P.setY1(leer.nextFloat());
        System.out.println("Vamos Punto X2");
        P.setX2(leer.nextFloat());
        System.out.println("Digite Punto Y2");
        P.setY2(leer.nextFloat());
        
        return P;
    }
    
    public double calcularDistancia(Puntos P){
        double distance;
        distance = (double)(Math.pow(P.getX2()-P.getX1(),2))-(double)(Math.pow(P.getY2()-P.getY1(),2));
        System.out.println("distnacia amntes" + distance);
        distance = (double)Math.sqrt(distance);
        return distance;
    }
    
    
}
