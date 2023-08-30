/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entity.Vehiculo;
import java.util.HashSet;
import java.util.Scanner;
/**
 *
 * @author Daniel Plasencia
 */
public class VehiculoService {
    
    Scanner leer = new Scanner(System.in);
    
    public Vehiculo crearVehiculo(){
        
        Vehiculo v1 = new Vehiculo();
        String tipo;
        
        
        while (true){
            
            System.out.println("Ingrese el tipo del vehiculo");
            System.out.println("automovil \nbicicleta \nmotocicleta");
            tipo = leer.next();

            if (tipo.equals("automovil") || tipo.equals("bicicleta") || tipo.equals("motocicleta")){
                v1.setTipo(tipo);
                break;   
            } else{
                
                System.out.println("Debe ingresar una motocicleta, bicicleta o automovil!!\n");
                
            }
            
        }
        
        System.out.println("Ingrese la marca del vehiculo");
        v1.setMarca(leer.next());
        System.out.println("Ingrese el modelo del vehiculo");
        v1.setModelo(leer.next());
        
        System.out.println("Ingrese el año del vehiculo");
        v1.setAnio(leer.nextInt());
        v1.setDistancia(0);
        return v1;
        
    }
    
    public void moverse(Vehiculo v1, float tiempoSegundos){
        
        float distanciaFinal;
        
        switch(v1.getTipo()){
            
            case "automovil":
                distanciaFinal = v1.getDistancia() + 3*tiempoSegundos;
                break;
            case "motocicleta":
                distanciaFinal = v1.getDistancia() + 2*tiempoSegundos;
                break;
            case "bicicleta":
                distanciaFinal = v1.getDistancia() + 1*tiempoSegundos;
                break;
            default:
                distanciaFinal = v1.getDistancia();
        }
        
        v1.setDistancia(distanciaFinal);
        
    }
    
    public void frenarse(Vehiculo v1){
        float distanciaFinal;
        
        switch(v1.getTipo()){
            
            case "automovil":
                distanciaFinal = v1.getDistancia() + 2;
                break;
            case "motocicleta":
                distanciaFinal = v1.getDistancia() + 2;
                break;
            case "bicicleta":
                distanciaFinal = v1.getDistancia();
                break;
            default:
                distanciaFinal = v1.getDistancia();
        }
        
        v1.setDistancia(distanciaFinal);
    }
    
    public void reiniciar(Vehiculo v1){
        v1.setDistancia(0);
    }
    
    public String getTipo(Vehiculo v1){
        return v1.getTipo();
    }
    
    public float getDistancia(Vehiculo v1){
        return v1.getDistancia();
    }
    
}
