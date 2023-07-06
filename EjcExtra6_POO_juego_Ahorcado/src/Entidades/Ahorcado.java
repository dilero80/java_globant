/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author drome
 */
public class Ahorcado {
    private String [] wordVector;
    private String [] wordVectorshow;
    private String word;
    private int jugadas;
    private int encontradas;

    public Ahorcado() {
    }

    public Ahorcado(String word, int jugadas, int encontradas) {
        this.setWord(word);
        this.jugadas = jugadas;
        this.encontradas = encontradas;
    }

    

    public String[] getWordVector() {
        return wordVector;
    }

    public void setWordVector(String[] wordVector) {
        this.wordVector = wordVector;
    }

  
    
    public String[] getWordVectorshow() {
        return wordVectorshow;
    }

    public void setWordVectorshow(String[] wordVectorshow) {
        this.wordVectorshow = wordVectorshow;
    }

    public int getJugadas() {
        return jugadas;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
        
        String  [] temp = new String[word.length()];
        String  [] temp1 = new String[word.length()];
        for (int i = 0; i < word.length(); i++) {
            temp[i] = word.substring(i, i+1);
        }
        
        this.setWordVector(temp);
        
        for (int i = 0; i < temp1.length; i++) {
            temp1[i] = " ";
        }
        this.setWordVectorshow(temp1);
    }
    
    public void setJugadas(int jugadas) {
        this.jugadas = jugadas;
    }

    public int getEncontradas() {
        return encontradas;
    }

    public void setEncontradas(int encontradas) {
        this.encontradas = encontradas;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "wordVector=" + wordVector + ", jugadas=" + jugadas + ", encontradas=" + encontradas + '}';
    }

    
    
    
    
    
    
}
