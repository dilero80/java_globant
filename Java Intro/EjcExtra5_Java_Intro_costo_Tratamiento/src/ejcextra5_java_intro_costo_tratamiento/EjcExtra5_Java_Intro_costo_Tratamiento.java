/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejcextra5_java_intro_costo_tratamiento;
import java.util.Scanner;
/**
 *
 * @author drome
 * Una obra social tiene tres clases de socios:
 * o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
 * todos los tipos de tratamientos.
 * o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
 * los mismos tratamientos que los socios del tipo A.
 * o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
 * tratamientos.
 * o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
 * real que represente el costo del tratamiento (previo al descuento) y determine el
 * importe en efectivo a pagar por dicho socio.
 */
public class EjcExtra5_Java_Intro_costo_Tratamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int treatmentCost;
        String associateType;
        
        System.out.println("Digite el valor del tratamiento");
        System.out.print("$ ");
        treatmentCost = leer.nextInt();
        System.out.println("Digite tipo de Socio");
        associateType = leer.next();
        associateType = associateType.toUpperCase();
        switch (associateType){
            case "A":
                System.out.println("Debes pagar como Socia A $"+treatmentCost*0.5);
                break;
            case "B":
                System.out.println("Debes pagar como Socia B $"+treatmentCost*0.65);
                break;
            case "C":
                System.out.println("Como socio tipo C pagas el total $"+ treatmentCost);
                break;
            default:
                break;
               
        }
    }
    
}
