/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Razas;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author drome
 */
public class RaceService {
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    
    
    public Razas CreateRaces(){
        String race, option;
        ArrayList <String> races = new ArrayList();
        do{
            System.out.println("Ingresa una raza de Perro");
            race = leer.next();
            races.add(race);
            System.out.println("Desea ingresar otra (S/N)");
            option = leer.next();
            
        }while(!(option.equals("N")));
        
        Razas R = new Razas(races); 
        return R;
        
    }
    public void ReadRaces(Razas R){
        ArrayList <String> races = R.getRaces();
        races.forEach((race) -> {
            System.out.println(race);
        });
    }
    
    public void deleteRacebyIndex(Razas R, int index){
        System.out.println("Vamos a borrar la mascota numero " + index);
        ArrayList <String> races = R.getRaces();
        races.remove(index);
        R.setRaces(races);
        System.out.println("mascota borrada");
    }  
    
     public void deleteRacebyName(Razas R, String name){
        System.out.println("Vamos a borrar la mascota de nombre " + name);
        ArrayList <String> races = R.getRaces();
        races.remove(races.indexOf(name));
        R.setRaces(races);
        System.out.println("mascota borrada");
    }  
    
}
