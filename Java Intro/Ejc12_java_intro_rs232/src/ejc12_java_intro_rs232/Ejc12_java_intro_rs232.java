/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejc12_java_intro_rs232;
import java.util.Scanner;
/**
 *
 * @author drome
 * Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
 * dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
 *   fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
 *   X y el último tiene que ser una O.
 *   Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
 *   especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
 *   de FDE, que no respete el formato se considera incorrecta.
 *   Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
 *   incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
 *   siguientes funciones de Java Substring(), Length(), equals().
 */
public class Ejc12_java_intro_rs232 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int correctStreams = 0;
        int incorrectStreams = 0;
        String rs232String ="";
        
        Scanner leer = new Scanner(System.in);
        do{
        System.out.println("digite cadena");
        
        rs232String = leer.next();
        
        if (rs232String.length() == 5 && "X".equals(rs232String.substring(0, 1)) && "O".equals(rs232String.substring(4, 5)) ){
            correctStreams++;
        }
        else{
            incorrectStreams++;
        }
        
        }
        while (!rs232String.equals("&&&&&"));
        System.out.println("La cantidad de secuencias correctas fue:" + correctStreams);
        System.out.println("La cantidad de secuencias Incorrectas fue: " + incorrectStreams);
    }
    
}
