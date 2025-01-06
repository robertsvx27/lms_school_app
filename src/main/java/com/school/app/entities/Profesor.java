package com.school.app.entities;

public class Profesor extends Persona{
    private Double salario;

    public Profesor(String nombre, String numeroCelular, String correoElectronico, Direccion direccion) {
        super(nombre, numeroCelular, correoElectronico, direccion);
    }

    public Profesor(){
        super();
    }
    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
