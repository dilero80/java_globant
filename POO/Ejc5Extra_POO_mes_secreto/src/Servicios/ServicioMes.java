/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.MesSecreto;
import java.util.Scanner;

/**
 *
 * @author drome
 */
public class ServicioMes {
    
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    
    public MesSecreto crearMesSecreto (){
        int m = (int) (Math.random() * 11);
        System.out.println(m);
        MesSecreto M = new MesSecreto (m);
        return M;
    } 
    
    
    public boolean compararMeses(MesSecreto M, String Mes){
        
        return M.getMesSecreto().equals(Mes);
    }
    
    public String verMes(MesSecreto M){
        return M.getMesSecreto();
    }
    
    public void cambiarMes(MesSecreto M){
         int m = (int) (Math.random() * (12));
         M.setMesPos(m);
        
    }
    
    
    
}
