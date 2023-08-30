/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejcextra22_java_intro_suma_matrix;
import java.util.Scanner;
/**
 *
 * @author drome
 */
public class EjcExtra22_Java_Intro_suma_matrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("digite numero de filas");
        int n = leer.nextInt();
        System.out.println("digite numero de columnas");
        int m = leer.nextInt();
        int [][] matrix = new int [n][m];
        
        fillMatrix(matrix, n, m);
        printMatrix(matrix, n, m);
        int suma = sumMatrix(matrix, n, m);
        System.out.println("La suma de todos los valores es " + suma);
        
        
        
        
    }
    
     public static void fillMatrix(int [][] matrix, int rows, int columns){   
        
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
    
    public static int sumMatrix(int [][] matrix, int rows, int columns){   
        int sum  = 0;
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                sum = sum + matrix[i][j]; 
            }
        }
        return sum;
    }
}
