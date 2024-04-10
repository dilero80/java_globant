/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Entities.Book;
import java.util.List;


/**
 *
 * @author drome
 */
public class BookDAO extends DAO<Book>{
    @Override
    public void save(Book book) {
        super.save(book);
    }
    @Override
    public void edit(Book book){
        super.edit(book);
    }
    public void delete(Long ISBN) {
        Book book = findByISBN(ISBN);
        super.delete(book);
    }
    
    public List<Book> listAll() {
        connect();
        List<Book> books = em.createQuery("SELECT b FROM Book b")
                .getResultList();
        disconnect();
        return books;
    }

    public Book findByISBN(Long isbn) {
        connect();
        Book book = (Book) em.createQuery("SELECT b FROM Book b WHERE b.isbn LIKE :isbn")
                .setParameter("isbn", isbn).getSingleResult();
        disconnect();
        return book;
    }

    public List<Book> findByTitle(String title) {
        connect();
        List<Book> books = em.createQuery("SELECT b FROM Book b WHERE b.title LIKE :title")
                .setParameter("title", "%" + title + "%").getResultList();
        disconnect();
        return books;
    }
    
    public List<Book> findByAuthorName(String authorName) {
        connect();
        List<Book> books = em.createQuery("SELECT b FROM Book b WHERE b.author.name LIKE :authorName")
                .setParameter("authorName", "%" + authorName + "%").getResultList();
        disconnect();
        return books;
    }
    
    public List<Book> findByAuthorEditorial(String editorialName) {
        connect();
        List<Book> books = em.createQuery("SELECT b FROM Book b WHERE b.editorial.name LIKE :editorialName")
                .setParameter("editorialName", "%" + editorialName + "%").getResultList();
        disconnect();
        return books;
    }
    
    

    /**
     * Revisar esta pagina para aprender mas de los JOIN en JPQL
     * https://www.baeldung.com/jpa-join-types
     */
//    public List<Persona> buscarPorPaisYProvincia(String pais, String provincia) {
//        conectar();
//        //Opcion 1 sin JOIN
//        //        List<Persona> personas = em.createQuery("SELECT p FROM Persona p WHERE p.direccion.pais LIKE :pais AND p.direccion.provincia LIKE :provincia ")
//        //                .setParameter("pais", pais).setParameter("provincia", provincia).getResultList();
//        //Opcion 2 con JOIN
//        List<Persona> personas = em.createQuery("SELECT p FROM Persona p JOIN p.direccion d WHERE d.pais LIKE :pais AND d.provincia LIKE :provincia ")
//                .setParameter("pais", pais).setParameter("provincia", provincia).getResultList();
//        desconectar();
//        return personas;
//    }
    
    
}
