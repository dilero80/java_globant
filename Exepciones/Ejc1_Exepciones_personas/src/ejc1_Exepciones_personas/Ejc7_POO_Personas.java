/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejc1_Exepciones_personas;
import java.util.Scanner;
import Entidades.Persona;
import Servicios.PersonaService;
/**
 *
 * @author drome
 */
/*
Inicializar un objeto de la clase Persona ejercicio 3 de la guía 8 Servicios, a null y tratar 
de invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el código 
con una cláusula try-catch para probar la nueva excepción que debe ser controlada. 
*/

public class Ejc7_POO_Personas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersonaService PS = new PersonaService();
        int n = 2;
        int sobrepeso = 0;
        int pesoideal = 0;
        int bajopeso = 0;
        int mayor = 0;
        int pesoIMC;
        Persona [] personas = new Persona[n];
        Persona p = new Persona();
        System.out.println(p);
        try {
            if(PS.esMayor(p)){
               System.out.println("Es mayor de Edad");
                mayor++;
            }
            else{
                System.out.println("Es Menor de edad");
            }
            
            } catch (Exception e) {
            System.out.println(e.getMessage());
            }
        
            
        }
        
        
        
//        for (int i = 0; i < n; i++) {
//            personas[i] = PS.crearPersona();
//            pesoIMC = PS.CalcularIMC(personas[i]);
//            switch (pesoIMC) {
//                case -1:
//                    bajopeso++;
//                    break;
//                case 0:
//                    pesoideal++;
//                    break;
//                case 1:
//                    sobrepeso++;
//                    break;
//                default:
//                    break;
//            }
//            if(PS.esMayor(personas[i])){
//                System.out.println("Es mayor de Edad");
//                mayor++;
//            }
//            else{
//                System.out.println("Es Menor de edad");
//            }
//            
//        }
//        
//        System.out.println("El % de Sobrepesos es " + ((sobrepeso / (float)(n)) * 100 ) + "%") ;
//        
//        System.out.println("El % de peso ideal es " + ((pesoideal/ (float) (n)) * 100) + "%");
//        
//        System.out.println("El % de Bajo peso es " + ((bajopeso / (float)(n)) * 100)  + "%");
//        
//        System.out.println("El # de Mayores de edad es " + mayor);
//        
//        System.out.println("El # de Menores de edad es " + (n - mayor));
//         
    
    
    
}
