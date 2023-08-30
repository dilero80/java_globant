/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author drome
 */
public class OperService {
    
    public Operacion crearOperacion(){
        Scanner leer = new Scanner(System.in);
        Operacion type = new Operacion();
        System.out.println("digite numero 1");
        type.setNum1(leer.nextInt());
        System.out.println("digite numero 2");
        type.setNum2(leer.nextInt());
        return type;
    }
    public void changeOperacion(Operacion oper){
        Scanner leer = new Scanner(System.in);
        System.out.println("digite numero 1");
        oper.setNum1(leer.nextInt());
        System.out.println("digite numero 2");
        oper.setNum2(leer.nextInt());
        
    }
    
    public int SumaOper(Operacion sumas){
        return sumas.getNum1() + sumas.getNum2();
    }
    
    public int RestaOper(Operacion restas){
        return restas.getNum1() - restas.getNum2();
    }
    
    public int MultiOper(Operacion multi){
        int num1 = multi.getNum1();
        int num2 = multi.getNum2();
        if (num1 ==0 || num2 == 0){
            System.out.println("No se permite multiplicar por 0");
            return 0;
        }
        else{
            return num1 * num2;
        }
    }
    
    public float DiviOper(Operacion multi){
        int num1 = multi.getNum1();
        int num2 = multi.getNum2();
        if ( num2 == 0){
            System.out.println("No se permite dividir por 0");
            return 0;
        }
        else{
            return (float)(num1 / num2);
        }
    }
    
}
