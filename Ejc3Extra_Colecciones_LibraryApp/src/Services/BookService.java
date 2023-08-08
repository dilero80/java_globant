/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Book;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author drome
 */
public class BookService {
    Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    //constructor
    
    public BookService() {
    }
    
    //Create Book
    public Book createBook(){
        String author, title;
        Integer qty;
        System.out.println("Digite el autor");
        author = read.next();
        System.out.println("Digite El nombre del libro");
        title = read.next();
        System.out.println("Digite la cantidad disponible");
        qty = read.nextInt();
        Book b = new Book(title, author, qty, 0);
        return b;
    }
    
    public Book createBook(String title, String author, Integer qty  ){
        
        Book b = new Book(title, author, qty, 0);
        return b;
    }
    
    public void removeBook (HashSet<Book> books, String title){
        boolean flag = false;
        Iterator<Book> it = books.iterator();
        
        while (it.hasNext()) {
            Book next = it.next();
            if(next.getTitle().equals(title)){
                it.remove();
                flag = true;
            }
        }
        
        if (flag){
            System.out.println("Libro eliminado");
        }else{
            System.out.println(" Libro no encontrado");
        }
        
        
    }
    
    public boolean borrowBook(Book b){
        if (b.getQty()-b.getQtyBorrowed() <= 0 ){
            System.out.println("No hay cantidad disponible para prestar");
            return false;
        }
        else{
            b.setQtyBorrowed(b.getQtyBorrowed()+1);
            System.out.println("Actualizado datos de libro");
            return true;
            
        }
    }
    
    public boolean returnBook(Book b){
        if (b.getQtyBorrowed() == 0 ){
            System.out.println("No hay libros de este titulo prestados");
            return false;
        }
        else{
            b.setQtyBorrowed(b.getQtyBorrowed()-1);
            System.out.println("Actualizado datos de libro");
            return true;
            
        }
    }
    
    public void showBook(Book b){
        System.out.println(b.toString());
    }
    
}
