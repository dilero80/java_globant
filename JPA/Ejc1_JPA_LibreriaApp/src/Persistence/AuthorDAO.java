/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Entities.Author;

import java.util.List;

/**
 *
 * @author drome
 */
public class AuthorDAO extends DAO<Author>{
    
    @Override
    public void save(Author A) {
        super.save(A);
    }
    
    @Override
    public void edit(Author A){
        super.edit(A);
    }

    public void delete(Integer ID) {
        Author A = findByID(ID);
        super.delete(A);
    }

    public List<Author> listAll() {
        connect();
        List<Author> authors = em.createQuery("SELECT a FROM Author a")
                .getResultList();
        disconnect();
        return authors;
    }

    public Author findByID(Integer id) {
        connect();
        Author A = (Author) em.createQuery("SELECT a FROM Author a WHERE a.id LIKE :id")
                .setParameter("id", id).getSingleResult();
        disconnect();
        return A;
    }
    
}
