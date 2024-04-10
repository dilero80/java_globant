/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Author;
import Entities.Book;
import Entities.Editorial;
import Persistence.BookDAO;
import java.util.List;

/**
 *
 * @author drome
 */
public class BookService {
    
    private final BookDAO DAO;
    

    public BookService() {
        this.DAO = new BookDAO();
    }
    
    //CREATE
    public Book CreateBook(Long isbn, String title, Integer year, Integer qty, Author author, Editorial editorial){
        try {
            Book book = new Book();
            book.setIsbn(isbn);
            book.setTitle(title);
            book.setYear(year);
            book.setQty(qty);
            book.setQtyBorrowed(0);
            book.setQtyAvaliable(qty);
            book.setIsUp(true);
            book.setAuthor(author);
            book.setEditorial(editorial);
            
            DAO.save(book);
            return book;
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    //READ
    public Book findByID(Long isbn){
        try {
            return DAO.findByISBN(isbn);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public List<Book> findByTitle(String title){
        try {
            return DAO.findByTitle(title);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public List<Book> findByAuthor(String name){
        try {
            return DAO.findByAuthorName(name);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public List<Book> findByEditorial(String name){
        try {
            return DAO.findByAuthorEditorial(name);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public List<Book> listAllBooks(){
        try {
            return DAO.listAll();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    //UPDATE
    public Book modifyBookbyISBN(Long oldisbn, Long isbn, String title, Integer year, Integer qty, Author author, Editorial editorial){
        try {
            Book book = this.findByID(oldisbn);
            book.setIsbn(isbn);
            book.setTitle(title);
            book.setYear(year);
            book.setQty(qty);
            book.setQtyBorrowed(0);
            book.setQtyAvaliable(qty);
            book.setIsUp(true);
            book.setAuthor(author);
            book.setEditorial(editorial);
            DAO.edit(book);
            return book;
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public Book putDownBookbyISBN (Long isbn){
        try {
            Book book = this.findByID(isbn);
            book.setIsUp(false);
            DAO.edit(book);
            return book;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    //DELETE
    public void deleteEditorialbyISBN(Long isbn){
        try {
            DAO.delete(isbn);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
   
    
    
    
    
    
    
    
}
