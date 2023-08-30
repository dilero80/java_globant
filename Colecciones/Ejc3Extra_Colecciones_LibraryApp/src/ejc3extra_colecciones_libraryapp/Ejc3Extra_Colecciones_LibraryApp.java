/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejc3extra_colecciones_libraryapp;

import Entities.Book;
import Services.BookService;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author drome
 */
public class Ejc3Extra_Colecciones_LibraryApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashSet <Book> books = new HashSet();
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        int optionMenu;
        BookService bs = new BookService();
        do{
            menu();
            optionMenu = read.nextInt();
            switch(optionMenu){
                case 1:
                    String option ="N";
                    do{
                        books.add(bs.createBook());
                        do{
                            System.out.println("Desea agregar otro libro S/N ");
                            option = read.next();
                        }while(!(option.equalsIgnoreCase("N") || option.equalsIgnoreCase("S")));
                    }while(!(option.equalsIgnoreCase("N")));
                    System.out.println(books.size());
                    waitKey();
                    
                    break;
                case 2:
                    for (Book book : books) {
                        bs.showBook(book);
                    }
                    waitKey();
                    break;
                case 3:
                    String bookBorrowed;
                    boolean flag = false;
                    System.out.println("Que libro deseas pedir prestado");
                    bookBorrowed = read.next();
                    for (Book book : books) {
                        if (book.getTitle().equals(bookBorrowed)){
                            bs.borrowBook(book);
                            flag = true;
                        }
                        
                    }
                    if (flag){
                        System.out.println("Libro Actualizado Prestado");
                    }
                    else{
                        System.out.println("Libro no encontrado");
                    }
                    
                    waitKey();
                    break;
                case 4:
                    String bookToReturn;
                    boolean flag1 = false;
                    System.out.println("Que libro deseas pedir prestado");
                    bookToReturn = read.next();
                    for (Book book : books) {
                        if (book.getTitle().equals(bookToReturn)){
                            bs.borrowBook(book);
                            flag1 = true;
                        }
                        
                    }
                    if (flag1){
                        System.out.println("Libro Actualizado Retornado");
                    }
                    else{
                        System.out.println("Libro no encontrado");
                    }
                    waitKey();
                    break;
                case 5:
                    System.out.println("Digite el tiutlo a Eliminar");
                    bs.removeBook(books, read.next());
                    
                    
                    break;
                case 6:
                    optionMenu = 6;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    optionMenu = 0;
                    break;
            }
        }while(!(6 == optionMenu));
        
        
        
    }
    
    /**
     * Menu opciones
     */
    public static void menu(){
        System.out.println("=============================");
        System.out.println("------------MENU-------------");
        System.out.println("=============================");
        System.out.println("1. Crear Libro");
        System.out.println("2. Mostrar Libros");
        System.out.println("3. Prestar Libro ");
        System.out.println("4. Retornar Libro");
        System.out.println("5. Eliminar Libro");
        System.out.println("6. Salir");
        System.out.println("=============================");
        System.out.println("Digite su opcion? ");
    }
    
    public static void waitKey(){
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        String option;
        do{
            System.out.println("Presione C + ENTER para continuar ");
            
            option = read.next();
        }while(!(option.equalsIgnoreCase("C")));
        System.out.println("SALI");
    
    }
    
}
