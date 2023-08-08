/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Rutina;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author drome
 */
public class ServicioRutina {
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    public Rutina crearRutina(){
        String id;
        String nombre;
        int duracion;// en minutos
        String nivelDificultad="";//baja / media / alta
        String descripcion;
        String option;
        
        System.out.println("-------------------------");
        System.out.println("VAMOS A CREAR UNA RUTINA");
        System.out.println("-------------------------");
        System.out.println("Digite codigo Rutina");
        id = leer.next();
        System.out.println("Digite Nombre Rutina");
        nombre = leer.next();
        System.out.println("Digite duracion en minutos");
        duracion = leer.nextInt();
        System.out.println("Digite la descripcion de la rutina");
        descripcion = leer.next();
        System.out.println("Escoja nivel de dificultad");
        System.out.println("A. Baja");
        System.out.println("B. Media");
        System.out.println("C. Alta");
        do{
            option = leer.next();
            option = option.toUpperCase();
        }while(!(option.equals("A") || option.equals("B") || option.equals("C")));
        
        switch(option){
            case "A":
                nivelDificultad = "Baja";
                break;
            case "B":
                nivelDificultad = "Media";
                break;
            case "C":
                nivelDificultad = "Alta";
                break;
        }
        
        Rutina R = new Rutina(id, nombre, duracion, nivelDificultad, descripcion);
        return R;
    }
    
    public void obtenerRutinas(ArrayList<Rutina> RL){
      for(int i = 0 ; i < RL.size(); i++ ){
            System.out.println("--------------------------------------------------------");
            System.out.println("La rutina #" + i);
            System.out.println("El ID es " + this.obtenerID(RL.get(i)) + " nombre :" + this.obtenerNombre(RL.get(i)));
            System.out.println("--------------------------------------------------------");
            
        }  
    }
             
    public ArrayList actualizarRutina(ArrayList<Rutina> RL, String id){
        
        return RL;
    }
    
    public ArrayList eliminarRutina(ArrayList<Rutina> RL, String id){
        for (int i = 0; i < RL.size() ; i++) {
            if (RL.get(i).getId().equals(id)){
                       
                RL.remove(i);
                System.out.println("------------------------");
                System.out.println("RUTINA ELIMINADA");
                System.out.println("------------------------");
                return RL;
            }
        }
        System.out.println("Rutina no esta en lista");
        return RL;
    }
    
    public void verRutina(ArrayList<Rutina> RL, String id){
        for (int i = 0; i < RL.size() ; i++) {
            if (RL.get(i).getId().equals(id)){
                       
                System.out.println("------------------------");
                System.out.println("LISTAR RUTINA");
                System.out.println("------------------------");
                System.out.println("El nombre es "+ this.obtenerNombre(RL.get(i)));
                System.out.println("El ID es " + this.obtenerID(RL.get(i)));
                System.out.println("El Nivel es " + this.obtenerNivel(RL.get(i)));
                System.out.println("La descripcion es " + this.obtenerDesc(RL.get(i)));
                System.out.println("La duracion es " + this.obtenerDuracion(RL.get(i)));
                System.out.println("------------------------");
                System.out.println("COMPLETADO");
                System.out.println("------------------------");
                return;
            }
           
        }
        System.out.println("Cliente no esta en lista");
    }
    
    public String obtenerID(Rutina R){
        return R.getId();
    }
    
    public String obtenerNombre(Rutina R){
        return R.getNombre();
    }
    
    public int obtenerDuracion(Rutina R){
        return R.getDuracion();
    }
    
    public String obtenerNivel(Rutina R){
        return R.getNivelDificultad();
    }
    
    public String obtenerDesc(Rutina R){
        return R.getDescripcion();
    }
    
    public void actualizarNombre(Rutina R){
        String option;
        System.out.println("El nombre actual es " + this.obtenerNombre(R));
        System.out.println("Deseas actualizar el nombre (S/N)");
        option = leer.next();
        option = option.toUpperCase();
        if (option.equals("S")){
            System.out.println("Digite el nuevo nombre");
            R.setNombre(leer.next());
        }
        else{
            System.out.println("No fue actualizado");
        }
    }
    public void actualizarID(Rutina R){
        String option;
        System.out.println("El ID actual es " + this.obtenerID(R));
        System.out.println("Deseas actualizar el ID (S/N)");
        option = leer.next();
        option = option.toUpperCase();
        if (option.equals("S")){
            System.out.println("Digite el nuevo ID");
            R.setId(leer.next());
        }
        else{
            System.out.println("No fue actualizado");
        }
    }
    
     
    
    public void actualizarDuracion(Rutina R){
        String option;
        System.out.println("La  duracion actual es " + this.obtenerDuracion(R));
        System.out.println("Deseas actualizar el edad (S/N)");
        option = leer.next();
        option = option.toUpperCase();
        if (option.equals("S")){
            System.out.println("Digite la nueva duracion");
            R.setDuracion(leer.nextInt());
        }
        else{
            System.out.println("No fue actualizado");
        }
    }
    
    public void actualizarDescripcion(Rutina R){
        String option;
        System.out.println("La  descripcion actual es " + this.obtenerDesc(R));
        System.out.println("Deseas actualizar el edad (S/N)");
        option = leer.next();
        option = option.toUpperCase();
        if (option.equals("S")){
            System.out.println("Digite la nueva descripcion");
            R.setDescripcion(leer.next());
        }
        else{
            System.out.println("No fue actualizado");
        }
    }
    
    public void actualizarNivel(Rutina R){
        String option, option1;
        String nivel = "";
        System.out.println("El nivel actual es " + this.obtenerNivel(R));
        System.out.println("Deseas actualizar el nivel (S/N)");
        option1 = leer.next();
        option1 = option1.toUpperCase();
        if (option1.equals('S')){
                System.out.println("Escoja el nivel");
                System.out.println("A. Bajo");
                System.out.println("B. Medio");
                System.out.println("C. Alto");

                do{
                    option = leer.next();
                    option = option.toUpperCase();
                }while(!(option.equals("A") || option.equals("B") || option.equals("C")));

                switch(option){
                    case "A":
                        nivel = "Bajo";
                        break;
                    case "B":
                        nivel = "Medio";
                        break;
                    case "C":
                        nivel = "Alto";
                        break;
                }
            R.setNivelDificultad(nivel);
        }
        else{
            System.out.println("No fue actualizado");
        }
    }  
    
    
}
