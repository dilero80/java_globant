/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Card;
import Entities.Deck;
import Enum.FaceCards;
import Enum.Suits;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author drome
 */
public class DeckService {
    Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private HashSet<Card> deck;

    public DeckService() {
        this.deck = new HashSet();
    }
    
    
    public Deck createDeck(){
        
        for (Suits suit : Suits.values()) {
            for (Integer i = 1; i < 8; i++) {
                deck.add(new Card(i.toString(), suit.toString()));
                //System.out.println(i.toString()+ " " + face.toString());
            }
            for (FaceCards face : FaceCards.values()) {
                deck.add(new Card(face.toString(), suit.toString()));
                //System.out.println(suit.toString()+" "+ face.toString());
            }
        }
        return new Deck(deck);
    }
    
    public void shuffleDeckInitial(Deck D){
        ArrayList<Card> list = new ArrayList(D.getDeck());
        Collections.shuffle(list);
        D.setShuffleDeck(list);
    }
     public void shuffleDeck(Deck D){
        ArrayList<Card> list = D.getShuffleDeck();
        Collections.shuffle(list);
        D.setShuffleDeck(list);
    }
    
    
    public void showCards(Deck D){
        ArrayList<Card> list =new ArrayList(D.getDeck());
        int cont = 0; 
        for (Card card : list) {
            cont++;
            System.out.println("CARTA " + cont + " " + card.getNumber() + " " + card.getSuit() );
            
        }
        
    }
    
      public void showCardsShuffle(Deck D){
        ArrayList<Card> list =D.getShuffleDeck();
        String cardNumber;
        int cont = 0; 
        char suitN=0;
        
        
        System.out.println("+------------------------------------+");
        System.out.println("| Num |     Carta        | Simbolo   |");
        for (Card card : list) {
            cont++;
            cardNumber =  (card.getNumber() + " " + card.getSuit() );
            if(cont<10){
                 System.out.print("|  " + cont + "  |");
            }else{
                 System.out.print("| " + cont + "  |");
            }
            System.out.print("   " +  cardNumber);
            for (int i = 0; i < (15-cardNumber.length()); i++) {
                System.out.print(" ");
            }
            System.out.print("|");
            for(Suits suit:Suits.values()){
                if (suit.toString().equals(card.getSuit())){
                    suitN = suit.getUnicode();
                }
            }
            if (card.getNumber().toString().equals("HORSE") || card.getNumber().toString().equals("JACK") || card.getNumber().toString().equals("KING")){
                System.out.print("    " + FaceCards.valueOf(card.getNumber().toString()).getUnicode() + " " + suitN + "   ");
            }
            else
            {
                  System.out.print("    " + card.getNumber() + " " + suitN + "   " ); 
            }
          
            System.out.println("|");
           
            
        }
        System.out.println("+----------------------------------+");
    }
      
    public void showCardsUsed(Deck D){
        ArrayList<Card> list =D.getUsed();
        String cardNumber;
        int cont = 0; 
        char suitN=0;
        
        
        System.out.println("+------------------------------------+");
        System.out.println("|------CARTAS USADAS-----------------|");
        System.out.println("| Num |     Carta        | Simbolo   |");
        for (Card card : list) {
            cont++;
            cardNumber =  (card.getNumber() + " " + card.getSuit() );
            if(cont<10){
                 System.out.print("|  " + cont + "  |");
            }else{
                 System.out.print("| " + cont + "  |");
            }
            System.out.print("   " +  cardNumber);
            for (int i = 0; i < (15-cardNumber.length()); i++) {
                System.out.print(" ");
            }
            System.out.print("|");
            for(Suits suit:Suits.values()){
                if (suit.toString().equals(card.getSuit())){
                    suitN = suit.getUnicode();
                }
            }
            if (card.getNumber().toString().equals("HORSE") || card.getNumber().toString().equals("JACK") || card.getNumber().toString().equals("KING")){
                System.out.print("    " + FaceCards.valueOf(card.getNumber().toString()).getUnicode() + " " + suitN + "   ");
            }
            else
            {
                  System.out.print("    " + card.getNumber() + " " + suitN + "   " ); 
            }
          
            System.out.println("|");
           
            
        }
        System.out.println("+----------------------------------+");
    }
      
    public void giveCard(Deck D){
        System.out.println("Cuantas cartas quieres?");
        Card cardPop;
        int qty = read.nextInt();
        if (D.getShuffleDeck().size()<qty)
        {
            System.out.println("No hay suficientes cartas");
        }else{
            for (int i = 0; i < qty; i++) {
                cardPop = D.getShuffleDeck().remove(0);
                System.out.println(cardPop);
                //System.out.println(D.getShuffleDeck().size());
                D.getUsed().add(cardPop);
                //System.out.println(D.getUsed().size());
                D.setShuffleDeck(D.getShuffleDeck());

            }
        }
        
    }
    
}
