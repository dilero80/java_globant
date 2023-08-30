/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejc14_java_intro_euroconverter;
import java.util.Scanner;
/**
 *
 * @author drome
 * convierte euros a otras monedas
 */
public class Ejc14_java_intro_euroconverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite la cantida de Euros");
        float euro = leer.nextFloat();
        System.out.println("A que moneda deseas convertir dolar / yen  / libras ");
        String currency = leer.next();
        converter(currency, euro);
        
        
    }
    public static void converter(String currency, float euro){
        switch (currency){
            case "dolar":
                System.out.println("Son: " + (1.28611 * euro) +" Dolares");
                break;
            case "yen":
                System.out.println("Son: USD$" + (euro * 129.852) +" Yenes");
                break;
            case "libras":
                System.out.println("son: "+ (euro * 0.86) + " Libras" );
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
        
    }
    
}
