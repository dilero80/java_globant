/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Raices;
import java.util.Scanner;

/**
 *
 * @author drome
 */
public class ServicioRaices {
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    public Raices CrearRaices(){
        System.out.println("Vamos a crear una eucacion");
        System.out.println("digite el valor a");
        float a = leer.nextFloat();
        
        System.out.println("digite el valor b");
        float b = leer.nextFloat();
        
        System.out.println("digite el valor c");
        float c = leer.nextFloat();
        
        Raices R = new Raices(a,b,c);
        return R;
    }
    
    /**
     * devuelve el valor del discriminante (double). El
     * discriminante tiene la siguiente formula: (b^2)-4*a*c
     * @param R
     * @return Discrimante 
     */   
    public double getDiscriminante(Raices R){
        double a = R.getA();
        double b = R.getB();
        double c = R.getC();
        double D = (Math.pow(b, 2) - 4 * a * c);
        return D;
    }
            
    /**
     * devuelve un booleano indicando si tiene dos soluciones, para
     * que esto ocurra, el discriminante debe ser mayor o igual que 0.
     * @param R
     * @return 
     */        
    public boolean tieneRaices(Raices R){
        double D = this.getDiscriminante(R);
        if (D > 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    /**
     * devuelve un booleano indicando si tiene una única solución, para
     * que esto ocurra, el discriminante debe ser igual que 0.
     * @param R
     * @return 
     */
    public boolean tieneRaiz(Raices R){
        double D = this.getDiscriminante(R);
        if (D == 0){
            return true;
        }
        else{
            return false;
        }
    }
    /**
     * llama a tieneRaíces() y si devolvió́ true, imprime las 2
     * posibles soluciones.
     * Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo
     * delante de -b
     * @param R 
     */
    public void obtenerRaices(Raices R){
        double a = R.getA();
        double b = R.getB();
        double c = R.getC();
        if(this.tieneRaices(R)){
            double r1= (-1 * b) + Math.sqrt((Math.pow(b, 2))-(4 * a * c))/(2 * a);
            double r2= (-1 * b) - Math.sqrt((Math.pow(b, 2))-(4 * a * c))/(2 * a);
            System.out.println("La Raiz 1 es " + r1 + "y la Raiz 2 es " + r2);
        }
        else{
            System.out.println("No tiene 2 Raices");
        }
    } 
    
    public void obtenerRaiz(Raices R){
        double a = R.getA();
        double b = R.getB();
        double c = R.getC();
        if(this.tieneRaiz(R)){
            double r1= (-1 * b) + Math.sqrt((Math.pow(b, 2))-(4 * a * c))/(2 * a);
            System.out.println("La Raiz es " + r1 );
        }
        else{
            System.out.println("Tiene 2 raices");
        }
        
    }
    
    public void calcular(Raices R){
        this.obtenerRaices(R);
        this.obtenerRaiz(R);
        if(!(this.tieneRaices(R)|| this.tieneRaiz(R))){
            System.out.println("No tiene solucion");
        }
        
    }
    
    
}
