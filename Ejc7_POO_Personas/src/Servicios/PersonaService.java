/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author drome
 */
public class PersonaService {
    Scanner leer = new Scanner(System.in);
    
    public Persona crearPersona(){
        Persona P = new Persona();
        System.out.println("Vamos a crear una nueva persona");
        System.out.println("Digite el nombre ");
        P.setNombre(leer.next());
        System.out.println("Digite Edad");
        P.setEdad(leer.nextInt());
        System.out.println("Digite Sexo (H-->Hombre/ M-->Mujer/O-->Otro(H,M,O)");
        String sex;
        do{
            sex = leer.next();
            sex = sex.toUpperCase();
            if (sex.equals("H") || sex.equals("M") || sex.equals("O")){
                P.setSexo(sex);
            }
            else{
                System.out.println("Debes digitar solo H-->Hombre/ M-->Mujer/O-->Otro(H,M,O) ");
            }
                
        }while (!(sex.equals("H") || sex.equals("M") || sex.equals("O")) );
        System.out.println("Digite el peso en KG");
        P.setPeso(leer.nextFloat());
        System.out.println("Digite la altura en Metros");
        P.setAltura(leer.nextFloat());
        return P;
        
    }
    
    public int CalcularIMC(Persona P){
        float IMC = (float) (P.getPeso()/(Math.pow(P.getAltura(),2)));
        System.out.println(IMC);
        if (IMC < 20){
            System.out.println("Esta baja de peso");
            return -1;
        }
        else if (IMC >=20 && IMC <=25){
            System.out.println("Peso Normal");
            return 0;
        }
        else{
            System.out.println("Sobrepeso");
            return 1;
        }
                
    }
    
    public boolean esMayor(Persona P){
        return P.getEdad() >= 18;
    }
}
