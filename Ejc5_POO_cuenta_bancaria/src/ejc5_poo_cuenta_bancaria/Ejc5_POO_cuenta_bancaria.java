/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejc5_poo_cuenta_bancaria;
import Entidades.Cuenta;
import Servicios.CuentaServicio;
import java.util.Scanner;

/**
 *
 * @author drome
 */
public class Ejc5_POO_cuenta_bancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CuentaServicio CS = new CuentaServicio();
        
        Cuenta C1 = CS.crearCuenta();
        
        CS.Ingresar(C1, 5000);
        CS.Retiro(C1, 1000);
        CS.RetiroRapido(C1, 3000);
        CS.RetiroRapido(C1, 100);
        System.out.println("El saldo de la cuenta es $" + CS.ConsultarSaldo(C1));
        CS.ConsultarDatos(C1);
        
        
        
        
        
    }
    
}
