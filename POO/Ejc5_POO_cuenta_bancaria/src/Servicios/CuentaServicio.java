/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;
import Entidades.Cuenta;
import java.util.Scanner;
/**
 *
 * @author drome
 */
public class CuentaServicio {
    Scanner leer = new Scanner(System.in);
    
    public Cuenta crearCuenta(){
         
        System.out.println("Vas a crear un cuenta bancaria");
        System.out.println("Por favor digite su DNI");
        long dni = leer.nextLong();
        System.out.println("Digite el numero de cuenta");
        int cuenta = leer.nextInt();
        Cuenta c1 = new Cuenta(cuenta, dni, 0);
        return c1;
    }
    /**
     * 
     * @param C
     * @param ingreso 
     */
    
    public void Ingresar(Cuenta C, int ingreso ){
        System.out.println("Tu saldo actual es " + C.getSaldo());
        int saldo = (int) C.getSaldo() + ingreso;
        C.setSaldo(saldo);
        System.out.println("Has ingresado a tu cuenta $" + ingreso);
        System.out.println("Tu saldo resultante es $" + saldo );
        
    }
    /**
     * 
     * @param C
     * @param retiro 
     */
    public void Retiro(Cuenta C, int retiro ){
        System.out.println("Tu saldo actual es $" + C.getSaldo());
        int saldo = (int) C.getSaldo();
        if (saldo - retiro < 0){
            System.out.println("No tienes fondos suficientes");
            System.out.println("Retiras un total de " + saldo);
            C.setSaldo(0);
        }
        else{
            saldo = (int) C.getSaldo() - retiro;
            C.setSaldo(saldo);
            System.out.println("Has retirado a tu cuenta $" + retiro);
            System.out.println("Tu saldo resultante es $" + saldo );
        }
        
        
    }
    
    public void RetiroRapido(Cuenta C, int retiro ){
        int saldo = (int) C.getSaldo();
        if (retiro > (saldo * .2)){
            System.out.println("No puedes realizar ese retiro rapido pues supera el 20% de tu saldo");
        }
        else{
            saldo = (int) C.getSaldo() - retiro;
            C.setSaldo(saldo);
            System.out.println("Has retirado a tu cuenta $" + retiro);
            System.out.println("Tu saldo resultante es $" + saldo );
        }
    }
    
    public int ConsultarSaldo(Cuenta C){
        return C.getSaldo();
    }
    
    public void ConsultarDatos(Cuenta C){
        System.out.println(C);
    }
    
    
    
    
}
