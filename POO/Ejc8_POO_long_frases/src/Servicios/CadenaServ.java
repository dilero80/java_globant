/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author drome
 */
public class CadenaServ {
    Scanner leer = new Scanner(System.in);
        
    public Cadena crearCadena (){
        System.out.println("Digite una cadena de texto");
        String texto = leer.nextLine();
        int largo = texto.length();
        texto = texto.toLowerCase();
        Cadena C1 = new Cadena(texto, largo);
        return C1;
    }
    
    public int mostrarVocales(Cadena C){
        String frase = C.getCadena();
        int largo = C.getLargo();
        int vocales = 0;
        for (int i = 0; i < largo; i++) {
            String letra = frase.substring(i,i+1);
            if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")){
                vocales++;
            }
        }
        return vocales;
    }
    
    public String invertirFrase(Cadena C){
        String frase = C.getCadena();
        int largo = C.getLargo();
        String fraseR = "" ;
        
        for (int i = (largo-1); i >= 0; i--) {
            
            fraseR = fraseR.concat(frase.substring(i, i+1));
        }
        return fraseR;
    }
    
    public void vecesRepetido(Cadena C){
        String frase = C.getCadena();
        int largo = C.getLargo();
        int veces = 0;
        String letraUser;
        
        System.out.println("digite la letra que quiere buscar ?");
        letraUser = leer.next();
        letraUser = letraUser.toLowerCase();
        
        for (int i = 0; i < largo; i++) {
            String letra = frase.substring(i,i+1);
            if (letra.equals(letraUser) ){
                veces++;
            }
        }
        System.out.println("El Caractaer " + letraUser + " se repite " + veces + " veces");
    }
    
    public void compararFrase(Cadena C){
        String frase = C.getCadena();
        int largo = C.getLargo();
        String fraseComp;
        
        System.out.println("digite la frase a comparr que quiere comparar?");
        fraseComp = leer.nextLine();
        if (fraseComp.equals(frase)){
            System.out.println("Las cadenas son iguales");
        }
        else{
            System.out.println("No son iguales");
        }
    }
    
    public void compararLongitud(Cadena C){
        String frase = C.getCadena();
        int largo = C.getLargo();
        int veces = 0;
        String fraseComp;
        System.out.println("digite la frase a comparr que quiere comparar?");
        fraseComp = leer.nextLine();
        if (fraseComp.length() == largo){
            System.out.println("Las cadenas son iguales de tamaño");
        }
        else{
            System.out.println("No son iguales de largo");
        }
        
    }
    
    public void unirFrases (Cadena C){
        String frase = C.getCadena();
        int largo = C.getLargo();
        int veces = 0;
        String fraseComp;
        System.out.println("digite la frase a unir?");
        fraseComp = leer.nextLine();
        frase = frase.concat(fraseComp);
        C.setCadena(frase);
        System.out.println("La frase resultante es " + frase);
    }
            
    public void reemplazarChar(Cadena C){
        String frase = C.getCadena();
        int largo = C.getLargo();
        String letraB;
        String fraseR = "";
        System.out.println("digite el caracter a cambiar?");
        letraB = leer.next();
        
        for (int i = 0; i < largo; i++) {
            String letra = frase.substring(i,i+1);
            if (letra.equals("a")){
                fraseR = fraseR.concat(letraB);
            }
            else{
                fraseR = fraseR.concat(frase.substring(i, i+1));
            }
        }
        System.out.println("La frase resultante es ");
        C.setCadena(fraseR);
        
    }
    
    public void contarChar(Cadena C){
        String frase = C.getCadena();
        int largo = C.getLargo();
        int cont = 0;
        String letraB;
        System.out.println("digite el caracter a contar?");
        letraB = leer.next();
        for (int i = 0; i < largo; i++) {
            String letra = frase.substring(i,i+1);
            if (letra.equals(letraB)){
                cont++;
            }
        }
        System.out.println("La cantiadad de veces que se repite el caracter" + letraB + "es " + cont);
        
    }
    
}
