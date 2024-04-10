/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author drome
 */
@Entity
public class Book {
    @Id
    private Long isbn;
    private String title;
    private Integer year;
    private Integer qty;
    private Integer qtyBorrowed;
    private Integer qtyAvaliable;
    private boolean isUp;
    @OneToOne
    private Author author;
    @OneToOne
    private Editorial editorial;

    public Book() {
    }

    public Book(Long isbn, String title, Integer year, Integer qty, Integer qtyBorrowed, Integer qtyAvaliable, boolean isUp, Author author, Editorial editorial) {
        this.isbn = isbn;
        this.title = title;
        this.year = year;
        this.qty = qty;
        this.qtyBorrowed = qtyBorrowed;
        this.qtyAvaliable = qtyAvaliable;
        this.isUp = isUp;
        this.author = author;
        this.editorial = editorial;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
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

    public Integer getQtyAvaliable() {
        return qtyAvaliable;
    }

    public void setQtyAvaliable(Integer qtyAvaliable) {
        this.qtyAvaliable = qtyAvaliable;
    }

    public boolean isIsUp() {
        return isUp;
    }

    public void setIsUp(boolean isUp) {
        this.isUp = isUp;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Book{" + "isbn=" + isbn + ", title=" + title + ", year=" + year + ", qty=" + qty + ", qtyBorrowed=" + qtyBorrowed + ", qtyAvaliable=" + qtyAvaliable + ", isUp=" + isUp + ", author=" + author + ", editorial=" + editorial + '}';
    }
    
    
    
            
    
}
