/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Curso;
import java.util.Scanner;

/**
 *
 * @author drome
 */
public class ServicioCurso {
    Scanner leer = new Scanner(System.in);
    public Curso crearCurso(){
        String turno;
        String nombreCurso;
        int cantidadHorasPorDia;
        int cantidadDiasPorSemana;
        float precioPorHora;
        String alumnos[] = new String[5];
        Curso C = new Curso();
        System.out.println("Por favor digite el nombre del curso");
        nombreCurso = leer.next();
        C.setNombreCurso(nombreCurso);
        System.out.println("Digite la cantidad de horas por dia del curso");
        cantidadHorasPorDia = leer.nextInt();
        C.setCantHorasPorDia(cantidadHorasPorDia);
        System.out.println("Digite la cantidad de dias a la semana del curso");
        cantidadDiasPorSemana = leer.nextInt();
        C.setCantDiasPorSemana(cantidadDiasPorSemana);
        System.out.println("Digite turno A) Mañana \n B) Tarde");
        do{
          turno = leer.next();
          turno = turno.toUpperCase();
        }while (!(turno.equals("A") || turno.equals("B")));
        if (turno.equals("A")){
            turno = "diurno";
        }
        else if (turno.equals("B")){
            turno = "tarde";
        }
        C.setTurno(turno);
        System.out.println("digite valor de precio por hora");
        precioPorHora = leer.nextFloat();
        C.setPrecioPorHora(precioPorHora);
        this.cargarAlumnos(C);
        return C;
    }
    
    public void cargarAlumnos(Curso C){
        String nombres[]= new String[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite el nombre " + (i+1));
            nombres[i] = leer.next();
        }
        C.setAlumnos(nombres);
        
    }
    
    public void calcularGananciasSemana(Curso C){
        float total = (float)(C.getCantHorasPorDia() * C.getPrecioPorHora() * 5 * C.getCantDiasPorSemana());
        System.out.println("El curso genera un total de $" + total);
    }
    
    
}
