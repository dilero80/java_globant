/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;



/**
 *
 * @author drome
 */
public class Curso {
    private String nombreCurso;
    private int cantHorasPorDia;
    private int cantDiasPorSemana;
    private String turno; // mañana / tarde
    private float precioPorHora;
    private String[] Alumnos = new String[5];

    public Curso(String nombreCurso, int cantHorasPorDia, int cantDiasPorSemana, String turno, float precioPorHora, String [] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantHorasPorDia = cantHorasPorDia;
        this.cantDiasPorSemana = cantDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.Alumnos = alumnos;
        

    }

    public Curso() {
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantHorasPorDia() {
        return cantHorasPorDia;
    }

    public void setCantHorasPorDia(int cantHorasPorDia) {
        this.cantHorasPorDia = cantHorasPorDia;
    }

    public int getCantDiasPorSemana() {
        return cantDiasPorSemana;
    }

    public void setCantDiasPorSemana(int cantDiasPorSemana) {
        this.cantDiasPorSemana = cantDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public float getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(float precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return Alumnos;
    }

    public void setAlumnos(String[] Alumnos) {
        this.Alumnos = Alumnos;
    }

    
    @Override
    public String toString() {
        return "Curso{" + "nombreCurso=" + nombreCurso + ", cantHorasPorDia=" + cantHorasPorDia + ", cantDiasPorSemana=" + cantDiasPorSemana + ", turno=" + turno + ", precioPorHora=" + precioPorHora + ", Alumnos=" + Alumnos + '}';
    }

    
    


    
    
}
