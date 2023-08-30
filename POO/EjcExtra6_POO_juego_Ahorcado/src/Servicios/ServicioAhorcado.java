/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author drome
 */
public class ServicioAhorcado {
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    
    public Ahorcado crearAhorcado(){
        int turnos;
        String palabra;
        System.out.println("Digite la cantidad de turnos");
        turnos = leer.nextInt();
        System.out.println("Digite la palabra del ahorcado");
        palabra = leer.next();
        palabra = palabra.toUpperCase();
        Ahorcado A = new Ahorcado(palabra, turnos, 0);
        return A;
        
    }
    
    public int Longitud(Ahorcado A){
        return A.getWordVector().length;
    }
    
    public boolean letra(Ahorcado A, String letra){
        int encontradas = A.getEncontradas();
        int cont = 0;
        boolean flagencon = false;
        boolean flagRepetida = true;
        String [] temp = A.getWordVectorshow();
        for(String l1 : temp){
            if(l1.equals(letra)){
                flagRepetida = false;
            }
        }
        if(flagRepetida){
            for(String L : A.getWordVector()){
                //System.out.println(L);
                if (letra.equals(L) ){
                    encontradas++;
                    temp[cont] = L;
                    flagencon = true;
                }
                cont++;
            }
            A.setEncontradas(encontradas);
            A.setWordVectorshow(temp);
        }    
        return flagencon;
    }
    
    public boolean encontradas(Ahorcado A, String letra){
        int oportunidades = A.getJugadas();
        boolean flag = false;
        if(this.letra(A, letra)){
            flag = true;
        }
        else{
            oportunidades--;
        }
        A.setJugadas(oportunidades);
        return flag;
    }
    
    public int intentos(Ahorcado A){
        return A.getJugadas();
    }
    
    public boolean juego(Ahorcado A){
        boolean flagGano =false;
        this.mostrarAhorcado(A);
        String letra;
        int intentos;
        do{
            do{
                System.out.println("Digite una letra a buscar");
                letra = leer.next();
                letra = letra.toUpperCase();
            }while(!(letra.length()==1));
                
            if(this.encontradas(A, letra)){
                 System.out.println("-----------------------");
                 System.out.println("Letra correcta");
                 System.out.println("-----------------------");
                this.mostrarAhorcado(A);
                if(A.getEncontradas() == this.Longitud(A)){
                    flagGano = true;
                }
            }
            else{
                System.out.println("-----------------------");
                System.out.println("Letra incorrecta");
                System.out.println("-----------------------");
                this.mostrarAhorcado(A);
            }
            intentos = A.getJugadas();
            
        }while(!(0 >= intentos ) && !flagGano);
        
        return flagGano;
        
    }
    
    public void mostrarAhorcado(Ahorcado A){
        int quedan =  A.getJugadas();
        int dibujo = (int)((quedan*100)/A.getInicial()); 
        System.out.println("---------------------------");
        System.out.println("------JUEGO AHORCADO-------");
        System.out.println("---------------------------");
        
        if(81 <= dibujo && dibujo <= 100){            
            System.out.println("+----+");
            System.out.println("|    |");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        }
        else if(61 <= dibujo && dibujo <= 80){
            System.out.println("+----+");
            System.out.println("|    |");
            System.out.println("|    O");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        }
        else if(41 <= dibujo && dibujo <= 60){
            System.out.println("+----+");
            System.out.println("|    |");
            System.out.println("|    O");
            System.out.println("|    |");
            System.out.println("|");
            System.out.println("|");
        }
        else if(21 <= dibujo && dibujo <= 40){
            System.out.println("+----+");
            System.out.println("|    |");
            System.out.println("|    O");
            System.out.println("|   -|-");
            System.out.println("|");
            System.out.println("|");
        }
        else if(1 <= dibujo && dibujo <= 20){
            System.out.println("+----+");
            System.out.println("|    |");
            System.out.println("|    O");
            System.out.println("|   -|-");
            System.out.println("|   / \'");
            System.out.println("|");
        }
        else if(dibujo == 0){
            System.out.println("+----+");
            System.out.println("|  +-| ");
            System.out.println("|  |(**)");
            System.out.println("   +----");
            System.out.println("|   -|-");
            System.out.println("|   / \'");
            System.out.println("|");
        }
        
        
        for(String L : A.getWordVectorshow()){
            System.out.print("[" + L + "]");
        }
        System.out.println("");
        System.out.println("Te quedan " + quedan + " Oportunidades");
        System.out.println("LLevas " + A.getEncontradas() + " Encontradas");
        
    }
    
    public void mostrarVector(Ahorcado A){
        
        for (String i : A.getWordVector()){
            System.out.print("[" + i + "]");
        }
        System.out.println("");
    }
    
    public void reempezarJuego(Ahorcado A, int jugadas){
        A.setJugadas(jugadas);
        A.setEncontradas(0);
        A.setWord(A.getWord());
    }
}
