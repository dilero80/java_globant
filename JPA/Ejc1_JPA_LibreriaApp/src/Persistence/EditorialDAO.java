/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Entities.Editorial;
import java.util.List;

/**
 *
 * @author drome
 */
public class EditorialDAO extends DAO<Editorial>{
    @Override
    public void save(Editorial E) {
        super.save(E);
    }
    @Override
    public void edit(Editorial E){
        super.edit(E);
    }

    public void delete(Integer ID) {
        Editorial E = findByID(ID);
        super.delete(E);
    }

    public List<Editorial> listAll() {
        connect();
        List<Editorial> editorials = em.createQuery("SELECT e FROM Editorial e")
                .getResultList();
        disconnect();
        return editorials;
    }

    public Editorial findByID(Integer id) {
        connect();
        Editorial E = (Editorial) em.createQuery("SELECT e FROM Editorial e WHERE e.id LIKE :id")
                .setParameter("id", id).getSingleResult();
        disconnect();
        return E;
    }
    
}
