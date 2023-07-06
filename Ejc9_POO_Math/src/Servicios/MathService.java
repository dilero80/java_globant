/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Matematica;

/**
 *
 * @author drome
 */
public class MathService {
    
    public Matematica CrearMatematica(long num1, long num2){
        
        Matematica M = new Matematica(num1 , num2);
        return M;
    }
    
    public long devolverMayor(Matematica M){
        long num1 = M.getNum1(); 
        long num2 = M.getNum2();
        if (num1 > num2){
            return num1;
        }
        else{
            return num2;
        }
            
    }
    
     public long devolverMenor(Matematica M){
        long num1 = M.getNum1(); 
        long num2 = M.getNum2();
        if (num1 < num2){
            return num1;
        }
        else{
            return num2;
        }
            
    }
    
    public int calcularPotencia(Matematica M){
        long mayor = Math.round(devolverMayor(M)); 
        long menor = Math.round(devolverMenor(M));
        return (int) Math.pow(mayor,menor);
        
    }
    
    public long calcularRaiz(Matematica M){
        long menor = Math.abs(devolverMenor(M));
        return (long) Math.sqrt(menor);
        }
        
    
}
