/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.tiendaAPI.repositories;

import com.egg.tiendaAPI.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author drome
 */
public interface ClientRepository extends JpaRepository<Client, Long>{
    
    
    
}
