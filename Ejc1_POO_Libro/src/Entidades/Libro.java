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
public class Libro {
    private int ISBN;
    private String Titulo;
    private String Autor;
    private int numPaginas;
    
    public Libro() {
        }
    
    public Libro(int ISBN, String Titulo, String Autor, int numPaginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.numPaginas = numPaginas;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getTítulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    
    

    
    
    
    
    
}
