package cl.praxis.EscuelaRuralJPA.model.service;

import cl.praxis.EscuelaRuralJPA.model.entities.Alumno;
import cl.praxis.EscuelaRuralJPA.model.repository.AlumnoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoServiceImpl implements AlumnoService {

    AlumnoRepository repository;

    public AlumnoServiceImpl(AlumnoRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Alumno> findAll() {
        return repository.findAll();
    }

    @Override
    public Alumno findOne(String rut) {
        return repository.findById(rut).orElse(null);
    }

    @Override
    public boolean create(Alumno a) {
        Alumno result = repository.save(a);
        return result != null;
    }

    @Override
    public boolean update(Alumno a) {
        Alumno alumno = repository.save(a);
        return alumno != null;
    }

    @Override
    public boolean delete(String rut) {
        boolean exist = repository.existsById(rut);
        if (exist){
            repository.deleteById(rut);
        }
        return exist;
    }
}
