/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author drome
 */
public class ServicioCliente {
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    public Cliente registrarCliente(){
        String nombre;
        String id;
        int edad;
        int altura;
        int peso;
        String objetivo ="";
        String option;
        
        System.out.println("------------------------");
        System.out.println("REGISTRO CLIENTE");
        System.out.println("------------------------");
        System.out.println("Digite el nombre del cliente");
        nombre = leer.next();
        
        System.out.println("Digite id del cliente");
        id = leer.next();
        
        System.out.println("Digite el peso del cliente");
        peso = leer.nextInt();
        
        System.out.println("Digite altura del cliente");
        altura = leer.nextInt();
        
        System.out.println("Digite la edad del cliente");
        edad = leer.nextInt();
        
        System.out.println("Escoja el objetivo");
        System.out.println("A. Bajar de peso");
        System.out.println("B. Tonificar Musculos");
        System.out.println("C. Aumento de masa muscular");
        
        do{
            option = leer.next();
            option = option.toUpperCase();
        }while(!(option.equals("A") || option.equals("B") || option.equals("C")));
        
        switch(option){
            case "A":
                objetivo = "Bajar de peso";
                break;
            case "B":
                objetivo = "Tonificar Musculos";
                break;
            case "C":
                objetivo = "Aumento de masa muscular";
                break;
            
        }
        
        Cliente C = new Cliente(id, nombre, edad, altura, peso, objetivo);
            
        
        return C;
    } 
    
    public void obtenerClientes(ArrayList<Cliente> CL ){
        for(int i = 0 ; i < CL.size(); i++ ){
            System.out.println("--------------------------------------------------------");
            System.out.println("El cliente #" + i);
            System.out.println("El ID es " + this.obtenerID(CL.get(i)) + " nombre :" + this.obtenerNombre(CL.get(i)));
            System.out.println("--------------------------------------------------------");
            
        }
    }
    
    public ArrayList actualizarCliente (ArrayList<Cliente> CL, String id ){
        for (int i = 0; i < CL.size() ; i++) {
            if (CL.get(i).getId().equals(id)){
                       
                System.out.println("------------------------");
                System.out.println("CAMBIO CLIENTE");
                System.out.println("------------------------");
                this.actualizarNombre(CL.get(i));
                this.actualizarID(CL.get(i));
                this.actualizarEdad(CL.get(i));
                this.actualizarPeso(CL.get(i));
                this.actualizarAltura(CL.get(i));
                this.actualizarObj(CL.get(i));
                
            }
            else{
                System.out.println("No esta el cliente");
            }
        }
           
        
        return CL;
    }
    
    public ArrayList eliminarCliente (ArrayList<Cliente> CL, String id ){
        for (int i = 0; i < CL.size() ; i++) {
            if (CL.get(i).getId().equals(id)){
                       
                CL.remove(i);
                System.out.println("------------------------");
                System.out.println("CLIENTE ELIMINADO");
                System.out.println("------------------------");
                return CL;
            }
        }
        System.out.println("Cliente no esta en lista");
        return CL;
                
    }
    
    public String obtenerID(Cliente C){
        return C.getId();
    }
    
    public String obtenerNombre(Cliente C){
        return C.getNombre();
    }
    
    public int obtenerPeso(Cliente C){
        return C.getPeso();
    }
    
    public int obtenerAltura(Cliente C){
        return C.getAltura();
    }
    
    public int obtenerEdad(Cliente C){
        return C.getEdad();
    }
    
    public String obtenerObj(Cliente C){
        return C.getObjetivo();
    }
    
    public void actualizarNombre(Cliente C){
        String option;
        System.out.println("El nombre actual es " + this.obtenerNombre(C));
        System.out.println("Deseas actualizar el nombre (S/N)");
        option = leer.next();
        option = option.toUpperCase();
        if (option.equals("S")){
            System.out.println("Digite el nuevo nombre");
            C.setNombre(leer.next());
        }
        else{
            System.out.println("No fue actualizado");
        }
    }
    public void actualizarID(Cliente C){
        String option;
        System.out.println("El ID actual es " + this.obtenerID(C));
        System.out.println("Deseas actualizar el ID (S/N)");
        option = leer.next();
        option = option.toUpperCase();
        if (option.equals("S")){
            System.out.println("Digite el nuevo ID");
            C.setId(leer.next());
        }
        else{
            System.out.println("No fue actualizado");
        }
    }
    
     public void actualizarPeso(Cliente C){
        String option;
        System.out.println("El Peso actual es " + this.obtenerPeso(C));
        System.out.println("Deseas actualizar el Peso (S/N)");
        option = leer.next();
        option = option.toUpperCase();
        if (option.equals("S")){
            System.out.println("Digite el nuevo ID");
            C.setPeso(leer.nextInt());
        }
        else{
            System.out.println("No fue actualizado");
        }
    }
     public void actualizarEdad(Cliente C){
        String option;
        System.out.println("La edad actual es " + this.obtenerEdad(C));
        System.out.println("Deseas actualizar el edad (S/N)");
        option = leer.next();
        option = option.toUpperCase();
        if (option.equals("S")){
            System.out.println("Digite la nueva edad");
            C.setEdad(leer.nextInt());
        }
        else{
            System.out.println("No fue actualizado");
        }
    }
     public void actualizarAltura(Cliente C){
        String option;
        System.out.println("La altura actual es " + this.obtenerAltura(C));
        System.out.println("Deseas actualizar la altura (S/N)");
        option = leer.next();
        option = option.toUpperCase();
        if (option.equals("S")){
            System.out.println("Digite la nueva altura");
            C.setAltura(leer.nextInt());
        }
        else{
            System.out.println("No fue actualizado");
        }
    }
    
     public void actualizarObj(Cliente C){
        String option, option1;
        String objetivo = "";
        System.out.println("El objetivo actual es " + this.obtenerObj(C));
        System.out.println("Deseas actualizar el objetivo (S/N)");
        option1 = leer.next();
        option1 = option1.toUpperCase();
        if (option1.equals('S')){
                System.out.println("Escoja el objetivo");
                System.out.println("A. Bajar de peso");
                System.out.println("B. Tonificar Musculos");
                System.out.println("C. Aumento de masa muscular");

                do{
                    option = leer.next();
                    option = option.toUpperCase();
                }while(!(option.equals("A") || option.equals("B") || option.equals("C")));

                switch(option){
                    case "A":
                        objetivo = "Bajar de peso";
                        break;
                    case "B":
                        objetivo = "Tonificar Musculos";
                        break;
                    case "C":
                        objetivo = "Aumento de masa muscular";
                        break;
                }
            C.setObjetivo(objetivo);
        }
        else{
            System.out.println("No fue actualizado");
        }
    }  
    
}
