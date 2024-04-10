/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejc11_poo_dateclase;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author drome
 */
public class Ejc11_POO_Dateclase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int anio, mes, dia;
        
        System.out.println("Digite el año > 1900");
        do{
            anio = leer.nextInt();
        }while(1900 > anio );
        anio = anio-1900;
        System.out.println("Digite el mes");
        do{
            mes = leer.nextInt();
        }while(!(mes > 0 && mes <= 12));
        mes = mes -1; 
        System.out.println("digite el dia");
        do{
            dia = leer.nextInt();
        }while(!(dia > 0 && dia <= 31));
        
        Date hoy = new Date();
        Date fecha;
        fecha = new Date(anio,mes,dia);
        
        System.out.println("La fecha es " + fecha);
        System.out.println("la fecha  actual es " + hoy);
        
        int anio1;
        anio1 = fecha.getYear();
        int anio2;
        anio2 = hoy.getYear();
        
        System.out.println("Hay " + Math.abs(anio2 - anio1) + " años de diferencia");
        
        
        
        
        
        
    }
    
}
