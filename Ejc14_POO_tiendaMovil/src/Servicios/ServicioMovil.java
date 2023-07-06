/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Movil;
import java.util.Scanner;

/**
 *
 * @author drome
 */
public class ServicioMovil {
    Scanner leer = new Scanner(System.in);
    public Movil crearCel (){
        Movil cel = new Movil();
        System.out.println("Ingrese la marca");
        cel.setMarca(leer.next());
        System.out.println("Ingrese Precio");
        cel.setPrecio(leer.nextFloat());
        System.out.println("Ingrese modelo");
        cel.setModelo(leer.next());
        System.out.println("Ingrese Memoria Ram");
        cel.setMemoriaRam(leer.nextInt());
        System.out.println("Ingrese Almacenamiento");
        cel.setAlmacenamiento(leer.nextInt());
        this.cargaCodigo(cel);
        return cel;
    }
    
    public void cargaCodigo(Movil M){
        int serial[] = new int [7];
        for (int i = 0; i < 7; i++) {
            System.out.println("digite serial " + (i+1));
            serial[i]=leer.nextInt();
        }
        M.setCodigo(serial);
    }
    
    public void MostrarCel(Movil M){
        System.out.println(M.toString());
    }
    
    
}
