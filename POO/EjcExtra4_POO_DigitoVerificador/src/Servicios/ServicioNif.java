/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author drome
 */
public class ServicioNif {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    public NIF crearNIF(){
        int dni;
        String dnilong;
        char letter;
        System.out.println("Vamos a crear un NIF");
        System.out.println("Digite el DNI 8 digitos");
        do{
            dni = leer.nextInt();
            
            dnilong = Integer.toString(dni);
        }while(!(dnilong.length() == 8));
        letter = this.Digito(dni);
        
        NIF N = new NIF(dni, letter);
        return N;
    }
    
    public void ponerLetra(NIF N){
        char letter = this.Digito(N.getDNI());
        N.setLetra(letter);
    }
    
    public void ponerDNI(NIF N,int dni){
        N.setDNI(dni);
        
    }
    
    public String mostrarNIF(NIF N){
        String NIF = String.valueOf(N.getDNI())+" - "+N.getLetra();
        return NIF;
        
        
    }
    
    private char Digito(int dni){
        String letters = "TRWAGMYFPDXBNJZSQVHLCKE";
        int suma = 0;
        char [] digit = letters.toCharArray();
        System.out.println(digit[0]);
        
        while(dni > 0) {
            suma += dni % 10;
            dni = dni / 10;
        }
        int pos = (int) suma / 23;
        System.out.println(pos);
        return digit[pos-1];
        
        
    }
    
    
}
