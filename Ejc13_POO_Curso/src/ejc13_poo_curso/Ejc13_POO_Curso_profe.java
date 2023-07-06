/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejc13_poo_curso;

import Entidades.Curso;
import Servicios.ServicioCurso;

/**
 *
 * @author drome
 */
public class Ejc13_POO_Curso_profe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioCurso SC = new ServicioCurso();
        Curso C = SC.crarCurso();
        
       SC.calcularGananciasSemana(C);
    }
    
}
