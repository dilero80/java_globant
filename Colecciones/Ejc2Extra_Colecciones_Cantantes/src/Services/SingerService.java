/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.FamousSinger;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author drome
 */
public class SingerService {
    Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    public FamousSinger CreateSinger(String name, String bestSale){
        FamousSinger s = new FamousSinger(name, bestSale);
        
        return s;
        
    }
    
    public void showSingers(ArrayList <FamousSinger> Singers){
        int cont = 0;
        System.out.println("===================================================");
        System.out.println("=------LISTADO DE CANTANTES FAMOSOS---------------=");
        System.out.println("===================================================");
        
        for (FamousSinger Singer : Singers) {
            cont++;
            System.out.println(cont + " " + Singer.getName() + " Album mas vendido: " + Singer.getBestSaleRecord());
            System.out.println("===================================================");
        }
    }
    
    public void removeSingers(ArrayList <FamousSinger> Singers, String name){
        boolean flag = false;
        for (int i = 0; i < Singers.size(); i++) {
            
            if (Singers.get(i).getName().equals(name)){
                Singers.remove(i);
                flag =true;
            }
        }
        if (flag){
            System.out.println("Artista eliminado");
        }else{
            System.out.println("Artista no encontrado");
        }
        
        
    }
    
    public void replaceSinger(ArrayList <FamousSinger> Singers, String name){
        boolean flag = false;
        for (int i = 0; i < Singers.size(); i++) {
            
            if (Singers.get(i).getName().equals(name)){
                System.out.println("Digite el nuevo nombre");
                Singers.get(i).setName(read.next());
                System.out.println("Digite el nuevo album mas vendido");
                Singers.get(i).setBestSaleRecord(read.next());
                flag =true;
            }
        }
        if (flag){
            System.out.println("Artista Cambiado Correctamente");
        }else{
            System.out.println("Artista no encontrado");
        }
    
    }
    
    
    public void createSingerDefault(ArrayList<FamousSinger> Singers){
        String [] singerNames = {"THE BEATLES", "ELVIS PRESLEY", "MICHAEL JACKSON", "ELTON JOHN" , "QUEEN"};
        String [] mostSale = {"White Album","Critsmas","Thriller","Goodbye Yellow Brick Road","Greatest hits"}; 
        
        for (int i = 0; i < 5; i++) {
            Singers.add(this.CreateSinger(singerNames[i], mostSale[i]));
        }
    }
}


