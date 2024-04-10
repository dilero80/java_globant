/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.tiendaAPI.controllers;

import com.egg.tiendaAPI.entities.DTO.ClientDTO;
import com.egg.tiendaAPI.services.ClientService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author drome
 */

@RestController
@RequestMapping("/api/client") //localhost/news
public class ClientController {
    
    private ClientService clientService;
    
    @GetMapping("/[id]")
    @ResponseStatus(HttpStatus.OK)
    public ClientDTO getClient(@PathVariable("id") String idUser) {
        return clientService.findByID(idUser);
    }
    
    
    
        
    
    
    
    
    
    
}
