package cl.praxis.EscuelaRuralJPA.model.service;

import cl.praxis.EscuelaRuralJPA.model.entities.Alumno;

import java.util.List;

public interface AlumnoService {

    List<Alumno> findAll();
    Alumno findOne(String rut);
    boolean create(Alumno a);
    boolean update(Alumno a);
    boolean delete(String rut);
}
