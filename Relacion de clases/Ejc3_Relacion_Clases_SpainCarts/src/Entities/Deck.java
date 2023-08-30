/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

/**
 *
 * @author drome
 */
public class Deck {
    private HashSet<Card> deck;
    private ArrayList<Card> shuffleDeck;
    private ArrayList<Card> used;

    public Deck() {
        this.deck = new HashSet();
        this.shuffleDeck = new ArrayList();
        this.used = new ArrayList();
    }

    public Deck(HashSet<Card> deck) {
        this.deck = deck;
        this.shuffleDeck = new ArrayList();
        this.used = new ArrayList();
        
    }

    public HashSet<Card> getDeck() {
        return deck;
    }

    public void setDeck(HashSet<Card> deck) {
        this.deck = deck;
    }

    public ArrayList<Card> getShuffleDeck() {
        return shuffleDeck;
    }

    public void setShuffleDeck(ArrayList<Card> shuffleDeck) {
        this.shuffleDeck = shuffleDeck;
    }

    public ArrayList<Card> getUsed() {
        return used;
    }

    public void setUsed(ArrayList<Card> used) {
        this.used = used;
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Deck other = (Deck) obj;
        if (!Objects.equals(this.deck, other.deck)) {
            return false;
        }
        if (!Objects.equals(this.shuffleDeck, other.shuffleDeck)) {
            return false;
        }
        if (!Objects.equals(this.used, other.used)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
    

    
    
    
    
    
    
}
