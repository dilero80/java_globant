/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author drome
 */
public class AlumnService {
    public ArrayList<Alumno> alumns;
    public ArrayList<Double> notes;
    Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    
    
    public AlumnService() {
        this.alumns = new ArrayList();
    }
    
    public Alumno createAlumn (){
        this.notes = new ArrayList();
        String name;
        System.out.println("====================");
        System.out.println("CREACION DE ALUMNO");
        System.out.println("====================");
        System.out.println("Digite el nombre del alumno");
        name = read.next();
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite la nota "+ (i+1));
            notes.add(read.nextDouble());
        }
        
        System.out.println("ALUMNO CREADO");
        Alumno A = new Alumno(name, notes);
        return A;
    }
    
    public void createAlumns(){
        String option;
        do{
            this.alumns.add(this.createAlumn());
            System.out.println("Deseas crear otro alumno? (S/N)");
            option = read.next();
            if(!option.equalsIgnoreCase("N") || !option.equalsIgnoreCase("S")){
                System.out.println("Opcion no valida!!");
            }
        }while(!option.equalsIgnoreCase("N")); 
    }
    
    
    public Double finalNote(String name){
        ArrayList<Double> notes;
        int cont = 0;
        Double finalNote = 0.00;
        
        for (Alumno alumn : alumns) {
            if(alumn.getName().equalsIgnoreCase(name)){
                notes = alumn.getNotes();
                cont = 0;
                for (Double note : notes) {
                    finalNote = note + finalNote;
                    cont++;
                }
                finalNote = finalNote / cont;
                return finalNote;
            }
        }
        System.out.println("Alumno no existe");
        return finalNote;
        
    }
    
    public void showAlumns(){
        for (Alumno alumn : alumns) {
            System.out.println(alumn);
            
            
        }
    }
    

}
