package com.school.app.service;

import com.school.app.entities.Estudiante;
import com.school.app.repository.RepositorioEstudiante;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceEstudiante {
    private final RepositorioEstudiante repositorioEstudiante;
    public ServiceEstudiante(RepositorioEstudiante repositorioEstudiante){
        this.repositorioEstudiante = repositorioEstudiante;
    }
    public List<Estudiante> listadoEstudiantes(){
        return repositorioEstudiante.getListaEstudiantes();
    }
    public List<Estudiante> busquedaEstudiantesPorNombre(String nombre){
        return repositorioEstudiante.getPorNombre(nombre);
    }
    public List<Estudiante> busquedaEstudiantesPorNumeroCelular(String numeroCelular){
        return repositorioEstudiante.getPorNumeroCelular(numeroCelular);
    }

    public List<Estudiante> listadoEstudiantesOrdenadoPorPromedio(){
        return repositorioEstudiante.getListaOrdenadaPromedio();
    }
}
