/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication52;
import java.util.Scanner;
/**
 *
 * @author drome
 * Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida 
 * que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
 * 20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
 * será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
 * rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
 * por pantalla la sopa de letras creada.
 * Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
 * de Java substring(), Length() y Math.random().
 */
public class JavaApplication52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String [][] puzzle = new String [20][20]; 
        String [] word = new String [5];
        for (int i = 0; i < 5; i++){
            System.out.println("Digite la palabra " + (i+1));
            do{
                word[i] = leer.next();
            }while(3<=word[i].length() && 5>=word[i].length());
        }
        
        
        
        
    }
    public static void fillMatrix(String [][] matrix, String [] words){   
        int rows = 20;
        int columns = 20;
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }       
    }
     
    public static void printMatrix(int [][] matrix, int rows, int columns){   
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                System.out.print("[" + matrix[i][j] + "]"); 
            }
            System.out.println("");
        }       
    }
    
}
