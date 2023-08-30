/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejc21_java_intro_matrixcontenida;
import java.util.Scanner;
/**
 *
 * @author drome
 * Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de 
 * 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
 * dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
 * se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
 * que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
 * la matriz M en la cual empieza el primer elemento de la submatriz P.
 */
public class Ejc21_Java_Intro_matrixcontenida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nm = 10;
        int np = 3;
        int matrix1[][] = new int[nm][nm];
        int matrix2[][] = new int[np][np];
        fillMatrixAl(matrix1, nm);
        
        
        printMatrix(matrix1, nm);
        
        fillMatrix(matrix2, np);
        printMatrix(matrix2, np);
        
        if (contained (matrix1, matrix2, nm, np)){
            System.out.println("Matriz 2 contiene matriz 1");
        } 
        else {
            System.out.println("No la contiene");
        }         
    }
    
    public static void printMatrix(int [][] matrix, int size){   
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                System.out.print("[" + matrix[i][j] + "]"); 
            }
            System.out.println("");
        }       
    }
    
    public static void fillMatrixAl(int [][] matrix, int size){   
        
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }       
    }
    
    public static void fillMatrix(int [][] matrix, int size){   
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                do {             
                    System.out.println("Digite la posicion ["+i+"]["+j+"]");
                    matrix[i][j] = leer.nextInt();
                } while (100 < matrix[i][j]);
            }
        }       
    }
    public static boolean contained (int [][] matrix1, int[][] matrix2, int size1, int size2){
        int n = size1 - size2;
        boolean iscontained = false;
        for (int i = 0; i < n ;i++){
            for (int j = 0; j < n; j++){
                iscontained = true;
                for (int k = i; k < i+3; k++){
                    for (int l = j; l < j+3; l++){
                        if (matrix1[k][l]!= matrix2[k-i][l-j]){
                            iscontained = false;
                            
                            
                        }
                    }
                }
                if (iscontained){
                    System.out.println("La matrix la contiene en la posicion ["+ i +"]["+ j +"]");
                    return iscontained;
                }
            }
        }
        return iscontained;
     }
    
}
