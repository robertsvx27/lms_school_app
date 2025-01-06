package com.school.app.repository;

import com.school.app.entities.Direccion;
import com.school.app.entities.Estudiante;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RepositorioEstudiante {
    private List<Estudiante> listaEstudiantes;

    public RepositorioEstudiante(){
        listaEstudiantes = new ArrayList<Estudiante>();
        CargarEstudiantes();
    }
    public void RegistrarEstudiante(Estudiante estudiante){
        listaEstudiantes.add(estudiante);
    }

    public List<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public List<Estudiante> getPorNombre(String nombre){
        return listaEstudiantes.stream().filter(est-> est.getNombre().toLowerCase().
                contains(nombre.toLowerCase())).toList();
    }
    public List<Estudiante> getPorNumeroCelular(String numeroCelular){
        return listaEstudiantes.stream().filter(est-> est.getNumeroCelular().contains(numeroCelular)).toList();
    }
    public List<Estudiante> getListaOrdenadaPromedio(){
        return  listaEstudiantes.stream().sorted((est1, est2)->
                est1.getPromedioNotas().compareTo(est2.getPromedioNotas())).toList();
    }
    public void setListaEstudiantes(List<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    public void CargarEstudiantes(){
        Direccion address01 = new Direccion("Calle 1","","", 123L, "BOLIVIA");
        Direccion address02 = new Direccion("Calle 2","","", 1234L, "PARAGUAY");
        Direccion address03 = new Direccion("Calle 3","","", 1235L, "PERU");
        Direccion address04 = new Direccion("Calle 4","","", 1236L, "ARGENTINA");
        Direccion address05 = new Direccion("Calle 5","","", 1237L, "ECUADOR");
        Direccion address06 = new Direccion("Calle 6","","", 1238L, "COLOMBIA");
        Direccion address07 = new Direccion("Calle 71","","", 1239L, "COSTA RICA");
        Direccion address08 = new Direccion("Calle 8","","", 1230L, "BOLIVIA");
        Direccion address09 = new Direccion("Calle 10","","", 12311L, "MEXICO");
        Direccion address10 = new Direccion("Calle 15","","", 12312L, "ARGENTINA");

        Estudiante estudiante01 = new Estudiante("Javier Gonzales","+59179467561",
                "jgonzales@lms.com",1245,85.5, address01);
        Estudiante estudiante02 = new Estudiante("Elva Rojas","+59179467562",
                "erojas@lms.com",1246,70.5, address02);
        Estudiante estudiante03 = new Estudiante("Miguel Perez","+59179467563",
                "mperez@lms.com",1247,84.5, address03);
        Estudiante estudiante04 = new Estudiante("Rosario Tijeras","+59179467564",
                "rtijeras@lms.com",1248,82.5, address04);
        Estudiante estudiante05 = new Estudiante("Camilo Fernandez Barrios","+59179467566",
                "cfernandez@lms.com",1249,80.5, address06);
        Estudiante estudiante06 = new Estudiante("Alan Brito Jimenez","+59179467567",
                "abrito@lms.com",1250,90.5, address07);
        Estudiante estudiante07 = new Estudiante("Ismael Montes Cabrera","+59179467568",
                "imontes@lms.com",1251,92.5, address08);
        Estudiante estudiante08 = new Estudiante("Maria Mercedez Mendez","+59179467569",
                "mmendez@lms.com",1252,97.5, address09);
        Estudiante estudiante09 = new Estudiante("Yoselin Pantoja Gutierrez","+59179467570",
                "ypantoja@lms.com",1253,85.5, address10);
        Estudiante estudiante10 = new Estudiante("Ramon Valdez Chavon","+59179467571",
                "rvaldez@lms.com",1254,92.0, address05);
        listaEstudiantes.add(estudiante01);
        listaEstudiantes.add(estudiante02);
        listaEstudiantes.add(estudiante03);
        listaEstudiantes.add(estudiante04);
        listaEstudiantes.add(estudiante05);
        listaEstudiantes.add(estudiante06);
        listaEstudiantes.add(estudiante07);
        listaEstudiantes.add(estudiante08);
        listaEstudiantes.add(estudiante09);
        listaEstudiantes.add(estudiante10);
    }
}
