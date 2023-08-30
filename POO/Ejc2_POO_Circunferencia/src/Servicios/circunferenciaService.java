package Servicios;


import Entidades.Circunferencia;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author drome
 */
public class circunferenciaService {
    
    /**
     *
     * @return
     */
    public Circunferencia crearCircunferencia(){
        Scanner leer = new Scanner(System.in);
        Circunferencia circle = new Circunferencia();
        System.out.println("Digite el radio");
        circle.setRadio(leer.nextFloat());
        return circle;
    }

    public float AreaCircle(Circunferencia circle){
        float area = (float) (Math.PI * (Math.pow(circle.getRadio(),2)));
        return area;
    }
    
    public float PerimeterCircle(Circunferencia circle){
        float perimeter = (float) (2 * Math.PI * circle.getRadio());
        return perimeter;
    }
    
    
    
    
    
    
}
