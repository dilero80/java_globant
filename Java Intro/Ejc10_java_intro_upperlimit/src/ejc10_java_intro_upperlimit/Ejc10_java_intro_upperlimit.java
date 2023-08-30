/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejc10_java_intro_upperlimit;
import java.util.Scanner;
/**
 *
 * @author drome
 * 10. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
 * números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
public class Ejc10_java_intro_upperlimit {

    /**
      @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Digite el numero limite");
        int upperLimit = leer.nextInt();
        int sum = 0;
        int num = 0;
        while (sum < upperLimit){
            System.out.println("Digite un numero entero");
            num = leer.nextInt();
            sum = sum + num;
        }
        
        System.out.println("Se alcanzo el limite");
    }
    
}
