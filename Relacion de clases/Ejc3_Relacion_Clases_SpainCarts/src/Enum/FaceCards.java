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
public enum FaceCards {
    JACK('\u004A',"Jack"), HORSE('\u2658', "Horse"), KING('\u265A', "King");

        private char unicode;
        private String value;

        private FaceCards(char unicode, String value){
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
