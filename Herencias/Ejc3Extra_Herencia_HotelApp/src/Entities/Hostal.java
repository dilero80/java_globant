/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author drome
 */
public abstract class Hostal {
    
    protected String address;
    protected String name;
    protected String locality;
    protected String manager;

    public Hostal() {
    }

    public Hostal(String address, String name, String locality, String manager) {
        this.address = address;
        this.name = name;
        this.locality = locality;
        this.manager = manager;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "Hostal{" + "address=" + address + ", name=" + name + ", locality=" + locality + ", manager=" + manager + '}';
    }
    
    
            
    
}
