/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author drome
 */
public class RectanguloService {
    
    public Rectangulo crearRectangulo(){
        Scanner leer = new Scanner(System.in);
        System.out.println("digite la base");
        int base = leer.nextInt();
        System.out.println("digite la altura");
        int altura = leer.nextInt();
        Rectangulo rectangle = new Rectangulo(base, altura);
        return rectangle;
    }
    
    public void ChangeAltura(Rectangulo square, int newaltura){
        square.setAltura(newaltura);
    }
    
    public void ChangeBase(Rectangulo square, int newbase){
        square.setBase(newbase);
    }
    
    public int superficie(Rectangulo square){
        return square.getAltura() * square.getBase();
    } 
    
    public int perimetro (Rectangulo square){
        return (2 * (square.getAltura() * square.getBase()));
    }
    
    public void pintaRectangulo (Rectangulo square){
        for (int i = 0; i < square.getAltura(); i++){
            for (int j = 0; j < square.getBase(); j++){
                if (i == 0 || i == (square.getAltura()-1) ){
                    System.out.print("*");
                }
                else if (j == 0 || j == (square.getBase()-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
                

    }
}
