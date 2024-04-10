/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.tiendaAPI.services;

import com.egg.tiendaAPI.entities.Client;
import com.egg.tiendaAPI.entities.DTO.ClientDTO;
import com.egg.tiendaAPI.exceptions.StoreExceptions;
import com.egg.tiendaAPI.repositories.ClientRepository;
import java.util.Optional;
import org.springframework.transaction.annotation.Transactional;
import com.fasterxml.jackson.databind.ObjectMapper;


/**
 *
 * @author drome
 */
public class ClientService {
    
    private ClientRepository clientRepository;
    private ObjectMapper mapper;
    
    
    @Transactional
    public Client createClient(ClientDTO dto) throws StoreExceptions{
        try {
            
            
            Client c;
            c = mapper.convertValue(dto,Client.class);
            clientRepository.save(c);
            
            return c;
            
        } catch (Exception e) {
            throw new StoreExceptions("Can't Create User");
        }
        
    }
    
    @Transactional (readOnly = true)
    public ClientDTO findByID (Long id) throws StoreExceptions{
        try {
            Optional<Client> client = clientRepository.findById(id);
            if(client.isPresent()){
                System.out.println(client);
                return mapper.convertValue(client.get(),ClientDTO.class);
                
            }
            throw new Exception("Client Not Found");

        } catch (Exception e) {
            throw new StoreExceptions("Error reading client: " + e.getMessage());
        }
    }
    
}
