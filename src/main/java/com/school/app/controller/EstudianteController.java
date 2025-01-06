package com.school.app.controller;

import com.school.app.entities.Estudiante;
import com.school.app.service.ServiceEstudiante;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/schoolApp/api")
public class EstudianteController {
    private final ServiceEstudiante serviceEstudiante;

    public EstudianteController(ServiceEstudiante serviceEstudiante) {
        this.serviceEstudiante = serviceEstudiante;
    }

    @GetMapping("/estudiantes")
    List<Estudiante> listadoEstudiantes(){
        return serviceEstudiante.listadoEstudiantes();
    }

    @GetMapping("/estudiantes/buscarNombre/{nombre}")
    List<Estudiante> busquedaEstudiantesPorNombre(@PathVariable String nombre){
        return serviceEstudiante.busquedaEstudiantesPorNombre(nombre);
    }
    @GetMapping("/estudiantes/buscarCelular/{nroCelular}")
    List<Estudiante> busquedaEstudiantesPorCelular(@PathVariable String nroCelular){
        return serviceEstudiante.busquedaEstudiantesPorNumeroCelular(nroCelular);
    }

    @GetMapping("/estudiantes/listadoPorPromedio")
    List<Estudiante> listadoEstudiantesPorPromedio(){
        return serviceEstudiante.listadoEstudiantesOrdenadoPorPromedio();
    }
}
