/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejc19_java_intro_antisimetrica;
import java.util.Scanner;
/**
 *
 * @author drome
 */
public class Ejc19_Java_Intro_antisimetrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int n = 3;
        int matrix[][] = new int [n][n];
        int tranMatrix[][] = new int [n][n];
        int exampleMatrix [][] = new int [n][n];
        exampleMatrix [0][0] = 0;
        exampleMatrix [0][1] = -2;
        exampleMatrix [0][2] = 4;
        exampleMatrix [1][0] = 2;
        exampleMatrix [1][1] = 0;
        exampleMatrix [1][2] = 2;
        exampleMatrix [2][0] = -4;
        exampleMatrix [2][1] = -2;
        exampleMatrix [2][2] = 0;
        
        double flip0 = Math.random();
        if (flip0 > 0.5){
            fillMatrix(matrix, n);
        }
        else{
            matrix = exampleMatrix;
        }
        
        double flip1 = Math.random();
        if (flip1 > 0.5){
            tranMatrix = transMatrix(matrix, n);
        } 
        else{
            fillMatrix(tranMatrix, n);
        }
         
        
        System.out.println("Original");
        printMatrix(matrix, n);
        System.out.println("Comparada: ");
        printMatrix(tranMatrix, n);
        boolean isEqual = compareMatrix(matrix, tranMatrix, n);
        if(isEqual){
            System.out.println("SI es Antisimetrica");
        }
        else{
            System.out.println("No es antisimetrica");
        }
        
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
                matrixTrans[j][i] = -1 * matrix[i][j];
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
    
    public static boolean compareMatrix(int [][] matrix, int[][]matrix2, int size){   
        boolean isEqual = true;
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                if (matrix[i][j] != matrix2[i][j]){
                    isEqual = false;
                } 
            }
        }
        return isEqual;
    }
    
}
