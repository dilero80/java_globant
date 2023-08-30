/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejc18_java_intro_matrix_transpuesta;
import java.util.Scanner;
/**
 *
 * @author drome
 */
public class Ejc18_Java_Intro_matrix_transpuesta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int n = 4;
        int matrix[][] = new int [n][n];
        int tranMatrix[][] = new int [n][n];
        
        fillMatrix(matrix, n);
        
        tranMatrix = transMatrix(matrix, n);
        System.out.println("Original");
        printMatrix(matrix, n);
        System.out.println("Transpuesta: ");
        printMatrix(tranMatrix, n);
        
        
        
        
    }
    
    public static void fillMatrix(int [][] matrix, int size){   
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }       
    }
    
    public static int [][] transMatrix(int [][] matrix, int size){   
        int matrixTrans[][] = new int [size][size];
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                matrixTrans[j][i] = matrix[i][j];
            }
        } 
        return matrixTrans;
    }
    
    public static void printMatrix(int [][] matrix, int size){   
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                System.out.print("[" + matrix[i][j] + "]"); 
            }
            System.out.println("");
        }       
    }
}
