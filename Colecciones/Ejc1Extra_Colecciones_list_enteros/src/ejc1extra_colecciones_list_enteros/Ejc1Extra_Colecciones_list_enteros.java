/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejc1extra_colecciones_list_enteros;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author drome
 */
public class Ejc1Extra_Colecciones_list_enteros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        ArrayList <Integer> numbers = new ArrayList();
        readNumbers(numbers);
        
        System.out.println("La cantidad de numeros es "+ numbers.size());
        
        SumPromNumbers(numbers);
        
        
                
    }
    
    
    public static void readNumbers(ArrayList <Integer> numbers){
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        int cont = 0;
        int number;
        do{
            cont++;
            System.out.println("Digite el numero " + cont);
            number = read.nextInt();
            if(number!=-99){
                numbers.add(number);
            }
            
            
        }while (number!=-99);
            
    }
    
    
    public static void SumPromNumbers(ArrayList <Integer> numbers){
        int sum = 0;
        float prom;
        for (Integer number : numbers) {
            sum = number + sum; 
            
        }
        prom = sum / (float)numbers.size();
        System.out.println("La suma da " + sum);
        System.out.println("El promedio da "+ prom);
        
    }
    
    
}
