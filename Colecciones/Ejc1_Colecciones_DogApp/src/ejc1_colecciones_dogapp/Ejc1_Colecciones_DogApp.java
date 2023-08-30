/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejc1_colecciones_dogapp;

import Entities.Razas;
import Services.RaceService;

/**Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
 *  programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
 * después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
 * salir, se mostrará todos los perros guardados en el ArrayList.
 *
 * @author drome
 */
public class Ejc1_Colecciones_DogApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        RaceService rs = new RaceService();
        Razas R = rs.CreateRaces();
        
        rs.ReadRaces(R);
        
        rs.deleteRacebyName(R, "beagle");
                
        rs.ReadRaces(R);
    }
    
}
