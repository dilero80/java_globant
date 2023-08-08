/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.Objects;

/**
 *
 * @author drome
 */
public class Book {
    private String title;
    private String authorsName;
    private Integer qty;
    private Integer qtyBorrowed;
    
    
    //Constructors

    public Book() {
    }

    public Book(String title, String authorsName, Integer qty, Integer qtyBorrowed) {
        this.title = title;
        this.authorsName = authorsName;
        this.qty = qty;
        this.qtyBorrowed = qtyBorrowed;
    }
    
    //getter & setter

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorsName() {
        return authorsName;
    }

    public void setAuthorsName(String authorsName) {
        this.authorsName = authorsName;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Integer getQtyBorrowed() {
        return qtyBorrowed;
    }

    public void setQtyBorrowed(Integer qtyBorrowed) {
        this.qtyBorrowed = qtyBorrowed;
    }
    
    //To String

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", authorsName=" + authorsName + ", qty=" + qty + ", qtyBorrowed=" + qtyBorrowed + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.title);
        hash = 29 * hash + Objects.hashCode(this.authorsName);
        /*hash = 29 * hash + Objects.hashCode(this.qty);
        hash = 29 * hash + Objects.hashCode(this.qtyBorrowed);*/
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.authorsName, other.authorsName)) {
            return false;
        }
        /*if (!Objects.equals(this.qty, other.qty)) {
            return false;
        }
        if (!Objects.equals(this.qtyBorrowed, other.qtyBorrowed)) {
            return false;
        }*/
        return true;
    }
    
    
    
    
    
    
}
