/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejc20_java_intro_magic_square;
import java.util.Scanner;

/**
 *
 * @author drome
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
 * suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
 * permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
 * El programa deberá comprobar que los números introducidos son correctos, es decir,
 * están entre el 1 y el 9.
 */
public class Ejc20_Java_Intro_magic_square {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite tamaño matriz ");
        int sum = 0;
        int n = leer.nextInt();
        int matrix [][] = new int [n][n];
        
        fillMatrix(matrix, n);
        printMatrix(matrix, n);
        
        for (int i = 0; i < n; i++){
            sum = sum + matrix[0][i];
        }
        if (isMagic(matrix, n, sum)){
            System.out.println("Si es magica");
        }else {
            System.out.println("No es magica");
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
    
    public static void fillMatrix(int [][] matrix, int size){   
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                do {             
                    System.out.println("Digite la posicion ["+i+"]["+j+"]");
                    matrix[i][j] = leer.nextInt();
                } while (10 < matrix[i][j]);
            }
        }       
    }
    
    public static boolean isMagic(int [][] matriz, int n, int sum){
	boolean magic = true;
        boolean flag = false; 
	int i, j , temp = 0, temp1 = 0, diag1 , diag2 = 0; 
	
	
	do{ 
    
            diag1 = 0;
            diag2 = 0;
            for  (i = 0; i < n; i++){
                temp = 0;
                temp1 = 0;
                for ( j = 0; j < n; j++){	
                    temp = temp + matriz[i][j];
                    temp1 = temp1 + matriz[j][i];
                    if (i == j){
                        diag1 = diag1 + matriz[i][j];					
                    }
                }
            }
            for (i = 0; i < n; i++){
			diag2 = diag2 + matriz[(n-1-i)][i];
            }
		
            if (sum != temp || sum != diag1 || sum != diag2 || sum != temp1){
                magic = false;
                flag = true;
            }
		
        } while (magic && flag) ;
    return magic;
    }
}
