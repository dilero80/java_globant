/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejcextra21_java_intro_notas;
import java.util.Scanner;
/**
 *
 * @author drome
 * Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
 * adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
 * desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos
 * prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
 * Primer trabajo práctico evaluativo 10%
 * Segundo trabajo práctico evaluativo 15%
 * Primer Integrador 25%
 * Segundo integrador 50%
 */
public class EjcExtra21_Java_Intro_Notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        float [][] notas = new float [10][4];
        
        fillNotes(notas);
        resultNotes(notas);
        
    }
    
    public static void fillNotes(float [][] notes){
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 10; i++){
            System.out.println("NOTAS PARA EL ALUMNO "+ (i + 1));
            for (int j = 0; j < 4; j++){
                System.out.println("Digite la nota " + (j + 1) +" del Alumno " + (i + 1));
                do{
                    notes[i][j] = leer.nextFloat();
                }while(notes[i][j] > 10);
            }
        }
    }
    
    public static void resultNotes(float [][] notes ){
        float [] finale = new float [10];
        float [] percent = new float [4];
        percent[0] = (float) 0.1;
        percent[1] = (float) 0.15;
        percent[2] = (float) .25;
        percent[3]= (float) 0.5;
        String [] notesText = new String [4];
        notesText[0] = "Primer trabajo práctico evaluativo 10%";
        notesText[1] = "Segundo trabajo práctico evaluativo 15%";
        notesText[2] = "Primer Integrador 25%";
        notesText[3] = "Segundo integrador 50%";
        float prom = 0;
        int approved = 0;
        for (int i = 0; i < 10; i++){
            System.out.println("NOTAS PARA EL ALUMNO "+ (i + 1));
            
            for (int j = 0; j < 4; j++){
                System.out.println("La nota del " + notesText[j] + " del Alumno " + (i + 1));
                prom = prom + notes[i][j]*percent[j];
                System.out.println(notes[i][j]*percent[j]);    
            }
            finale[i] = prom;
           
            prom = 0;
        }
        
        for (int i = 0; i < 10; i++){
            System.out.println("La nota final para el alumno " + (i + 1) + " es " + finale[i]);
            if (finale[i] >= 7){
                approved++;
            }
        }
        System.out.println("La Cantidad de alumnos que pasaron es " + approved );
        System.out.println("La Cantidad que perdieron es " + (10 - approved));
        
        
        
    }
    
}
