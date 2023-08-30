/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejc2_poo_circunferencia;
import Entidades.Circunferencia;
import Servicios.circunferenciaService;

/**
 *
 * @author drome
 */
public class Ejc2_POO_Circunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        circunferenciaService newCircle = new circunferenciaService();
        
        Circunferencia circle1 = newCircle.crearCircunferencia() ;
        
        System.out.println("El Area es " + newCircle.AreaCircle(circle1));
        System.out.println("El perimetro es " + newCircle.PerimeterCircle(circle1));
    }
    
}
