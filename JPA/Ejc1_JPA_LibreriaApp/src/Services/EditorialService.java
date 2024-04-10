/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Editorial;
import Persistence.EditorialDAO;
import java.util.List;

/**
 *
 * @author drome
 */
public class EditorialService {
    
    private final EditorialDAO DAO;

    public EditorialService() {
        this.DAO = new EditorialDAO();
    }
    //CREATE
    public Editorial createEditorial (Integer id, String name){
        try {
            Editorial E = new Editorial();
            E.setId(id);
            E.setName(name);
            E.setIsUp(true);
            DAO.save(E);
            return E;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    //READ  
    public Editorial findByID(Integer id){
        try {
            return DAO.findByID(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public List<Editorial> listAllEditorials(){
        try {
            return DAO.listAll();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    //UPADTE    
    public Editorial modifyEditorialbyID (Integer oldid, Integer id, String name){
        try {
            Editorial E = this.findByID(oldid);
            E.setId(id);
            E.setName(name);
            E.setIsUp(true);
            DAO.edit(E);
            return E;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        
    }
    
    public void putDownEditorialbyID (Integer oldid, Integer id, String name){
        try {
            Editorial E = this.findByID(oldid);
            E.setId(id);
            E.setName(name);
            E.setIsUp(true);
            DAO.edit(E);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            
        }
        
    }
    //DELETE
    public void deleteEditorialbyID(Integer id){
        try {
            DAO.delete(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    
    
    
}
