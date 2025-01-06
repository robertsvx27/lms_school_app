package com.school.app.entities;

public class Estudiante extends Persona{

    private Integer numeroEstudiante;
    private Double promedioNotas;


    public Estudiante(String nombre, String numeroCelular, String correoElectronico,
                      Integer numeroEstudiante, Double promedioNotas, Direccion direccion) {
        super(nombre, numeroCelular, correoElectronico, direccion);
        this.numeroEstudiante = numeroEstudiante;
        this.promedioNotas = promedioNotas;
    }

    public Estudiante(){
        super();
    }

    public Integer getNumeroEstudiante() {
        return numeroEstudiante;
    }

    public void setNumeroEstudiante(Integer numeroEstudiante) {
        this.numeroEstudiante = numeroEstudiante;
    }

    public Double getPromedioNotas() {
        return promedioNotas;
    }

    public void setPromedioNotas(Double promedioNotas) {
        this.promedioNotas = promedioNotas;
    }
}
