/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejc1_poo_libro;

import java.util.Scanner;
import Entidades.Libro;
import Servicios.LibroService;


/**
 *
 * @author drome
 */
public class Ejc1_POO_Libro {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        LibroService newbook = new LibroService();
        System.out.println("cuantos libros deseas añadir");
        int n = leer.nextInt();
        Libro [] books = new Libro[n];
        
        
        for (int i = 0; i < n; i++){
            books[i] = newbook.crearLibro();
        }
        
        System.out.println("que libro desea consultar");
        int bookNumber = leer.nextInt();
        
       newbook.leerLibro(books[(bookNumber-1)]);
       
       
        
        
        
        
        
    }
    
}
