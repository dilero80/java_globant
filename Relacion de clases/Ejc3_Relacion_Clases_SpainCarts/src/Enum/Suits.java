/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enum;

/**
 *
 * @author drome
 */
public enum Suits {
    CUPS('\u3020', "Cups") , COINS('\u2742',"Coins") , CLUBS('\u2663',"Clubs") , SWORDS('\u2694',"Swords");
    
        private char unicode;
        private String value ;
        
        private Suits (char unicode, String value){
            this.unicode = unicode;
            this.value = value;
        }

    public char getUnicode() {
        return unicode;
    }

    public String getValue() {
        return value;
    }
        
        
}
