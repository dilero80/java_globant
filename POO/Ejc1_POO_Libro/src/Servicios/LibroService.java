/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author drome
 */
public class LibroService {
    public Libro crearLibro(){
        Scanner leer = new Scanner(System.in);
        Libro libroNew = new Libro();
        System.out.println("Ingrese nombre libro");
        libroNew.setTitulo(leer.next());
        System.out.println("Ingrese ISBN");
        libroNew.setISBN(leer.nextInt());
        System.out.println("Ingrese Autor");
        libroNew.setAutor(leer.next());
        System.out.println("Ingrese numero de paginas");
        libroNew.setNumPaginas(leer.nextInt());
        
        return libroNew;
    }
    
    public void leerLibro (Libro book){
        System.out.println("El Titulo del libro es " + book.getTítulo());
        System.out.println("El Numero de paginas es " + book.getNumPaginas());
        System.out.println("El ISBN es " + book.getISBN());
        System.out.println("El Autor es " + book.getAutor());
    }    
    
}
