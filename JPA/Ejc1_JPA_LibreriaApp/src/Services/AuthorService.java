/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Author;
import Persistence.AuthorDAO;
import java.util.List;

/**
 *
 * @author drome
 */
public class AuthorService {
    
    private final AuthorDAO DAO;

    public AuthorService() {
        this.DAO = new AuthorDAO();
    }
    //CREATE
    public Author createAuthor(Integer id, String name){
        try {
            Author author = new Author();
            author.setId(id);
            author.setIsUp(true);
            author.setName(name);
            DAO.save(author);
            
            return author;
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    //READ
    public Author findByID(Integer id){
        try {
            return DAO.findByID(id);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
            
        }
    }
    
    public List<Author> listAll(){
        try {
            return DAO.listAll();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    //UPDATE
    public Author editAuthor(Integer oldID, Integer id, String name){
        try {
            Author author = this.findByID(oldID);
            author.setId(id);
            author.setIsUp(true);
            author.setName(name);
            DAO.edit(author);
            return author;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        
    }
    
    
    
    public void putDownAuthorbyID(Integer ID){
        try{
            Author author = this.findByID(ID);
            author.setIsUp(false);
            DAO.edit(author);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }     
    }
    //DELETE
    public void deleteAuthorbyID(Integer id){
        try {
            DAO.delete(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    
    
    
}
