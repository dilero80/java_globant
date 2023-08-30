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
public class Cafetera {
    private float cantMaxi;
    private float cantActual;

    public Cafetera() {
    }

    public Cafetera(float cantMaxi, float cantActual) {
        this.cantMaxi = cantMaxi;
        this.cantActual = cantActual;
    }

    public float getCantMaxi() {
        return cantMaxi;
    }

    public void setCantMaxi(float cantMaxi) {
        this.cantMaxi = cantMaxi;
    }

    public float getCantActual() {
        return cantActual;
    }

    public void setCantActual(float cantActual) {
        this.cantActual = cantActual;
    }

    @Override
    public String toString() {
        return "Cafetera{" + "cantMaxi=" + cantMaxi + ", cantActual=" + cantActual + '}';
    }
    
    
    
}
