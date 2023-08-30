/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author drome
 */
public class Cadena {
    private String cadena;
    private int largo;

    public Cadena() {
    }

    public Cadena(String cadena, int largo) {
        this.cadena = cadena;
        this.largo = largo;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "Cadena{" + "cadena=" + cadena + ", largo=" + largo + '}';
    }
    
    
    
    
    
}
    
    

    



