/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.tiendaAPI.entities.DTO;

/**
 *
 * @author drome
 */
public class ClientDTO {
    private Long id;
    private String name;
    private Integer phone;
    private String email;

    public ClientDTO() {
    }

    public ClientDTO(Long id, String name, Integer phone, String email) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ClientDTO{" + "id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + '}';
    }
    
    
    
    
    
    
}
