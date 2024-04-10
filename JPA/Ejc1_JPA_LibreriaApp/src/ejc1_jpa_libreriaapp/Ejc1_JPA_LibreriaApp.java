/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejc1_jpa_libreriaapp;

import Services.AuthorService;
import Services.BookService;
import Services.EditorialService;
import java.util.Scanner;

/**
 *
 * @author drome
 */
public class Ejc1_JPA_LibreriaApp {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int option;
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        
        BookService bs = new BookService();
        EditorialService es = new EditorialService();
        AuthorService as = new AuthorService();
        
        do{
            menu();
            System.out.println("CHOOSE YOUR OPTION");
            option = read.nextInt();
            switch (option){
                case 1:
                    authorMenu();
                    break;
                case 2:
                    
                    
                    break;
                case 3:
                    
                    break;

                case 4:
                    
                    break;
                case 5:
                    
                    break;
                default:
                    break;


            }
        }while(!(20 == option));
        
//        
//        
          bs.findByTitle("java").forEach((a) -> System.out.println(a.toString()));
          
          bs.modifyBookbyISBN(8488457162l, 8488457162l, " esto es una prueba ", 2001 ,10 , as.findByID(1), es.findByID(1));
          bs.findByTitle("prueba").forEach((a) -> System.out.println(a.toString()));
          bs.modifyBookbyISBN(8488457162l,8488457162l, "Acceso a bases de datos con Java-JDBC 2.0  ", 2001 ,10 , as.findByID(1), es.findByID(1));
          
    }
    
    
    public static void menu(){
        System.out.println("-----MENU-----");
        System.out.println("1. AUTHOR MENU");
        System.out.println("2. EDITORIAL MENU");
        System.out.println("3. BOOK MENU");
        System.out.println("4. CLIENT MENU");
        System.out.println("5. LOAN MENU");
        System.out.println("6. EXIT");
    }
    
    public static void bookMenu(){
        System.out.println("----- BOOK MENU-----");
        System.out.println("1. CREATE BOOK");
        System.out.println("2. FIND BOOK BY ISBN ");
        System.out.println("3. FIND BOOK(S) BY TITLE");
        System.out.println("4. FIND BOOK(S) BY EDITORIAL");
        System.out.println("5. LIST ALL BOOKS");
        System.out.println("6. EDIT A BOOK BY ISBN");
        System.out.println("7. DELETE A BOOK BY ISBN");
        System.out.println("8. RETURN TO MAIN MENU");
    }
    
    public static void editorialMenu(){
        System.out.println("----- EDITORIAL MENU-----");
        System.out.println("1. CREATE EDITORIAL");
        System.out.println("2. FIND EDITORIAL BY ID ");
        System.out.println("3. FIND EDITORIAL(S) BY TITLE");
        System.out.println("5. LIST ALL EDITORIALS");
        System.out.println("6. EDIT A EDITORIAL BY ID");
        System.out.println("7. DELETE A EDITORIAL BY ID");
        System.out.println("8. RETURN TO MAIN MENU");
    }
    
    public static void authorMenu(){
        do {
            int option1;
            Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
            System.out.println("----- AUTHOR MENU-----");
            System.out.println("1. CREATE AUTHOR");
            System.out.println("2. FIND AUTHOR BY ID ");
            System.out.println("3. FIND AUTHOR(S) BY TITLE");
            System.out.println("5. LIST ALL AUTHORS");
            System.out.println("6. EDIT A AUTHOR BY ID");
            System.out.println("7. DELETE A AUTHOR BY ID");
            System.out.println("8. RETURN TO MAIN MENU");            
            System.out.println("CHOOSE YOUR OPTION");
            option1 = read.nextInt();
                switch (option1){
                    case 1:
                         break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        option1=8;    
                        break;
                    default:
                        break;
                }
            } while(!(8 == option1));
    }
    
    
    public static void clientMenu(){
        System.out.println("----- CLIENT MENU-----");
        System.out.println("1. CREATE CLIENT");
        System.out.println("2. FIND CLIENT BY ID ");
        System.out.println("3. FIND CLIENT(S) BY TITLE");
        System.out.println("5. LIST ALL CLIENTS");
        System.out.println("6. EDIT A CLIENT BY ID");
        System.out.println("7. DELETE A CLIENT BY ID");
        System.out.println("8. RETURN TO MAIN MENU");
    }
    
    
    public static void loanMenu(){
        System.out.println("----- LOAN MENU-----");
        System.out.println("1. CREATE LOAN");
        System.out.println("2. FIND LOAN BY ID ");
        System.out.println("3. FIND LOAN(S) BY TITLE");
        System.out.println("5. LIST ALL LOANS");
        System.out.println("6. EDIT A LOAN BY ID");
        System.out.println("7. DELETE A LOAN BY ID");
        System.out.println("8. RETURN TO MAIN MENU");
    }
    
    
    public void tempdata(EditorialService es, AuthorService as, BookService bs){
        //Create Editorial
        es.createEditorial(1, "Grupo Eidos");
        es.createEditorial(2, " Ieditorial Elearning S.L.");
        es.createEditorial(3, "Diego Marín Librero Editor SL");
        es.createEditorial(4, "Tutorial Formación, S.L.L.");
        //create Authors
        as.createAuthor(1, "Esteban Núñez, Ángel");
        as.createAuthor(2, "Jiménez Barrionuevo, Fernando");
        as.createAuthor(3, "Valenzuela Vila, María del Mar");
        as.createAuthor(4, "uano Vázquez, Francisco Javier");
        //System.out.println(as.findByID(2));

        // create Books
        bs.CreateBook(8488457162l, " Acceso a bases de datos con Java-JDBC 2.0 ", 2001 ,10 , as.findByID(1), es.findByID(1));
        bs.CreateBook(8488457707l, " Acceso a datos con Java JDBC ", 2003 ,8 , as.findByID(1), es.findByID(1));//no tiene autor probar sin autor
        bs.CreateBook(9788417663308l, "  Ajax y Java para desarrollo de interfaces web Ria", 2018 , 5 , as.findByID(1), es.findByID(2));
        bs.CreateBook(8484252345l, "   Algoritmos y estructuras de datos : implementaciones en Java ", 2002 , 4 , as.findByID(2), es.findByID(3));
        bs.CreateBook(9788499018980l   , "Ampliación y mejora de un applet de Java que simula modelos de teletráfico ", 2009 , 14 , as.findByID(3), es.findByID(4));
    }
    
    
}
