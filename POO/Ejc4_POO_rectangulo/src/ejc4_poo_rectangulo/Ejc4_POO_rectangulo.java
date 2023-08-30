/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejc4_poo_rectangulo;
import Entidades.Rectangulo;
import Servicios.RectanguloService;
import java.util.Scanner;
/**
 *
 * @author drome
 */
public class Ejc4_POO_rectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RectanguloService rectanglenew = new RectanguloService();
        Rectangulo rectangle1 = rectanglenew.crearRectangulo();
        
        Scanner leer = new Scanner(System.in);
        
        int menu = 6;
        
        do{
            System.out.println("Digite la opcion");
            System.out.println("1.Superficie");
            System.out.println("2. Perimetro");
            System.out.println("3. Dibujar");
            System.out.println("4. Cambiar baser");
            System.out.println("5. Cambiar altura");
            System.out.println("6. Salir");
            menu = leer.nextInt();
        
            switch (menu){
                case 1:
                    System.out.println("La superficie es " + rectanglenew.superficie(rectangle1));
                    break;
                case 2:
                    System.out.println("El perimetro da " + rectanglenew.perimetro(rectangle1));
                    break;
                case 3:
                    rectanglenew.pintaRectangulo(rectangle1);
                    break;
                case 4:
                    System.out.println("Digite la nueva altura ");
                    int alt = leer.nextInt();
                    rectanglenew.ChangeAltura(rectangle1, alt);
                    break;
                case 5:
                    System.out.println("Digite la nueva base ");
                    int base = leer.nextInt();
                    
                    break;
                case 6:
                    System.out.println("Gracias");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            } 
            
        }while (menu != 6 || 6 < menu);
        
        
    }
    
}
