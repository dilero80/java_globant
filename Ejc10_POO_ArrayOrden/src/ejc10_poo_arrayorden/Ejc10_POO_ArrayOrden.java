/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejc10_poo_arrayorden;
import java.text.DecimalFormat;
import java.util.Arrays;
/**
 *
 * @author drome
 */
public class Ejc10_POO_ArrayOrden {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float [] array1 = new float[50];
        float [] array2 = new float[20];
        llenarMatriz(array1, 50);
        llenarMatriz(array2, 20);
        System.out.println("La matriz original 1 es");
        System.out.println("_____________________________________________");
        printMatriz(array1, 50);
        System.out.println("_____________________________________________");
        System.out.println("La matriz original 2 es");
        System.out.println("_____________________________________________");
        printMatriz(array2, 20);
        System.out.println("_____________________________________________");
        Arrays.sort(array1);
        System.out.println("La matriz ordenada 1 es");
        System.out.println("_____________________________________________");
        printMatriz(array1, 50);
        System.out.println("_____________________________________________");
        System.out.println("La matriz 2 resultante es");
        System.out.println("_____________________________________________");
        changeMatrix(array1, array2);
        printMatriz(array2, 20);
        System.out.println("_____________________________________________");
        
        
        
        
        
        
    }
    
    public static void llenarMatriz(float [] matrix, int size){
        for (int i = 0; i < size; i++) {
            matrix[i] = (float) (Math.random()*100);
            
            
        }
    }
    
    public static void printMatriz(float [] matrix, int size){
        DecimalFormat frmt = new DecimalFormat();
	frmt.setMaximumFractionDigits(2);
        for (int i = 0; i < size; i++) {
            System.out.printf("[" + frmt.format(matrix[i]) + "]" );
        }
        System.out.println("");
    }
    
    public static void changeMatrix(float [] matrix1, float [] matrix2){
        for (int i = 0; i < 10; i++) {
            matrix2[i] = matrix1[i];
        }
        for (int i = 10; i < 20; i++) {
            matrix2[i] = (float) 0.5;
            
        }
    }
    
    public static void menu(){
        System.out.println("-------------------------------------------------");
        System.out.println("MENU");
        System.out.println("1. Rellenar Matrices");
        System.out.println("2. Ordenar Matriz 1");
        System.out.println("3. Cambiar Matriz 2");
        System.out.println("4. ");
        System.out.println("5. Salir");
        System.out.println("-------------------------------------------------");
    }
}
