/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejc17_java_intro_numberdigits;
import java.util.Scanner;
/**
 *
 * @author drome
 * Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
 * de 2 dígitos, etcétera (hasta 5 dígitos).
 */
public class Ejc17_Java_Intro_numberDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite el tamaño del vector");
        int n = leer.nextInt();
        int vector[] = new int [n];
        fillVector(vector,n);
        
        for (int i = 1; i < 6; i++){
            int digits = findNumberDigits(vector, n, i);
            System.out.println("La cantidad de bloques con " + i + "digitos es " + digits);
        }
    }
    
   
    public static void fillVector(int [] vector, int size){   
        for (int i = 0; i < size; i++){
            vector[i] = (int) (Math.random() * 10000);
        }       
    }
    
    public static int findNumberDigits(int [] vector, int size, int numberDigits){
        int sum = 0;
        for (int i = 0; i < size; i++){
            String digits = String.valueOf(vector[i]);
            if ((digits.length() == numberDigits)){
                sum = sum + 1;
            }
        }
        return sum;
    }
            
    
}
