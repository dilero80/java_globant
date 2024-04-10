/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import tienda.servicios.ProductoService;

/**
 *
 * @author drome
 */
public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProductoService ps = new ProductoService();
        
        
        
        try{
            
            ps.imprimirNombre();
         
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error del sistema por \n" + e.getMessage());
        }
        
        
        try{
            
            ps.imprimirProductos();
         
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error del sistema por \n" + e.getMessage());
        }
        
    }
    
}
